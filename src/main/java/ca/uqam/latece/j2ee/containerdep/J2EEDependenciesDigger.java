package ca.uqam.latece.j2ee.containerdep;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.omg.kdm.action.AbstractActionRelationship;
import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement;
import org.eclipse.gmt.modisco.omg.kdm.action.BlockUnit;
import org.eclipse.gmt.modisco.omg.kdm.action.Calls;
import org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeElement;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeFactory;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeItem;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeModel;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeRelationship;
import org.eclipse.gmt.modisco.omg.kdm.code.ControlElement;
import org.eclipse.gmt.modisco.omg.kdm.code.Datatype;
import org.eclipse.gmt.modisco.omg.kdm.code.EnumeratedType;
import org.eclipse.gmt.modisco.omg.kdm.code.InterfaceUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.Module;
import org.eclipse.gmt.modisco.omg.kdm.code.PreprocessorDirective;
import org.eclipse.gmt.modisco.omg.kdm.code.TemplateUnit;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.gmt.modisco.omg.kdm.kdm.ExtensionFamily;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KDMModel;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KdmFactory;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KdmPackage;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Stereotype;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KDMModel;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor;
import ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor;
import ca.uqam.latece.j2ee.containerdep.exceptions.KDMModelNotFoundException;
import ca.uqam.latece.j2ee.containerdep.kdm.JEEExtension;
import ca.uqam.latece.j2ee.containerdep.kdm.JEEStereotypes;
import ca.uqam.latece.j2ee.containerdep.kdmadapters.KDMAdapterFactory;
import ca.uqam.latece.j2ee.ejbxmlparser.EjbXMLBrowser;
import ca.uqam.latece.j2ee.ejbxmlparser.EjbXMLParser;



public class J2EEDependenciesDigger {

	private String kdmLocation;
	private String modelName;
	private Resource resource;
	private CodeModel model;
	private String projectFullPath;
	private List<DeploymentDescriptor> deploymentDescriptors = new ArrayList<DeploymentDescriptor>();
	private EjbXMLParser deploymentDescriptorParser=null; 
	private JEEExtension jeeExtension;
	
	/**
	 * Initialize the Digger, which includes: 
	 * - Loading the KDM model into memory ; and
	 * - Finding, parsing and loading into memory the deployment descriptors (ejb-jar.xml). 
	 * 
	 * @param kdmLocation
	 * @param modelName
	 * @param projectFullPath
	 */
	public J2EEDependenciesDigger(String kdmLocation, String modelName, String projectFullPath){
		this.kdmLocation = kdmLocation;
		this.modelName = modelName;
		this.projectFullPath = projectFullPath;
		
		init();
	}
	
	private void init(){
		//Load the KDM Model
		this.model = loadModelFromKDM(kdmLocation);
		//Find and parse the deployment descriptors (ejb-jar.xml) found in project's path
		this.loadDeploymentDescriptors();
		
		this.jeeExtension = new JEEExtension(this.model);
		
		//Complete the KDM model with CodeRelationships between bean classes and their respective
		//interfaces.
		this.addBeanRelationshipsToKDM();
	}
	
	private void addBeanRelationshipsToKDM(){
		//Retrieve stereotype objects from JEE Extension
		Stereotype beanClassStereotype = jeeExtension.getStereotype(JEEStereotypes.BEAN_CLASS);
		Stereotype localInterfaceStereotype = jeeExtension.getStereotype(JEEStereotypes.BEAN_LOCAL_INTERFACE);
		Stereotype remoteInterfaceStereotype = jeeExtension.getStereotype(JEEStereotypes.BEAN_REMOTE_INTERFACE);
		Stereotype localHomeStereotype = jeeExtension.getStereotype(JEEStereotypes.BEAN_LOCAL_HOME);
		Stereotype remoteHomeStereotype = jeeExtension.getStereotype(JEEStereotypes.BEAN_REMOTE_HOME);
		
		List<BeanDescriptor> beanDescriptors = this.deploymentDescriptorParser.getAllBeanDescriptors();
		Map<String, Datatype> classMap = getAllClassInterfaceUnit();
		
		
		for(BeanDescriptor bean: beanDescriptors){
			Datatype beanClass = classMap.get(bean.getEjbClass());
			if(beanClass!=null){
				Datatype localInterface = classMap.get(bean.getLocalInterface());
				Datatype remoteInterface= classMap.get(bean.getRemoteInterface());
				Datatype localHome = classMap.get(bean.getLocalHomeInterface()); 
				Datatype remoteHome = classMap.get(bean.getRemoteHomeInterface());
				if(localInterface!=null){
					beanClass.getCodeRelation().add( createCodeRelationship(beanClass, localInterface, localInterfaceStereotype) );
					localInterface.getCodeRelation().add( createCodeRelationship(localInterface, beanClass, beanClassStereotype) );	
				}
				if(remoteInterface!=null){
					beanClass.getCodeRelation().add( createCodeRelationship(beanClass, remoteInterface, remoteInterfaceStereotype) );
					remoteInterface.getCodeRelation().add( createCodeRelationship(remoteInterface, beanClass, beanClassStereotype) );
				}
				if(localHome!=null){
					beanClass.getCodeRelation().add( createCodeRelationship(beanClass, localHome, localHomeStereotype) );
					localHome.getCodeRelation().add( createCodeRelationship(localHome, beanClass, beanClassStereotype) );
				}
				if(remoteHome!=null){
					beanClass.getCodeRelation().add( createCodeRelationship(beanClass, remoteHome, remoteHomeStereotype) );
					remoteHome.getCodeRelation().add( createCodeRelationship(remoteHome, beanClass, beanClassStereotype) );
				}
			}			
		}
		
	}
	
	private CodeRelationship createCodeRelationship(CodeItem from, KDMEntity to, Stereotype stereotype){
		CodeRelationship cr = CodeFactory.eINSTANCE.createCodeRelationship();
		cr.setFrom(from);
		cr.setTo(to);
		cr.getStereotype().add(stereotype);
		return cr;
	}
	
	private void loadDeploymentDescriptors(){
		EjbXMLBrowser browser = new EjbXMLBrowser(this.projectFullPath);
		this.deploymentDescriptorParser = new EjbXMLParser(browser);
		this.deploymentDescriptorParser.parseAll();
		this.deploymentDescriptors = this.deploymentDescriptorParser.getDeploymentDescriptors();
	}
	
	private CodeModel loadModelFromKDM(String location) throws KDMModelNotFoundException{
		URI uri = URI.createURI(location);
		return loadModelFromKDM(uri);
	}
	
	private CodeModel loadModelFromKDM(URI uri) throws KDMModelNotFoundException{
		//Initialize the model
		KdmPackage.eINSTANCE.eClass();
		
		// Register the XMI resource factory for the .xmi extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		// Obtain a new resource set
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Get the resource
		this.resource = resourceSet.getResource(uri, true);
		
		
		Segment segment = (Segment)resource.getContents().get(0);
		for(KDMModel model: segment.getModel()){
    		if(model.getName().compareTo(this.modelName)==0) return (CodeModel)model;
    	}
		throw new KDMModelNotFoundException();
	}
	
	
	private ControlElement getCallerMethod(Calls call){
		EObject current = call;
		while(current.eContainer()!=null){
			current = current.eContainer();
			if(current instanceof ControlElement){
				return (ControlElement)current;
			}
		}
		return null;
	}
	
	
	/**
	 * Returns the fully qualified name of a given AbstractCodeElement (FQN), by going up it's containment hierarchy. 
	 * The FQN would include the name of given element and will be prepended by any element that contains it, if the latter
	 * is either a MethodUnit, ClassUnit, Package or Module.  
	 * @return
	 */
	private String getFQN(AbstractCodeElement elt){
		if(elt==null) return "??";
		EObject current = elt;
		String fqn = elt.getName();
		while(current.eContainer()!=null){
			current = current.eContainer();
			if(current instanceof ClassUnit || 
					current instanceof InterfaceUnit ||
					current instanceof MethodUnit || 
					current instanceof org.eclipse.gmt.modisco.omg.kdm.code.Package || 
					current instanceof Module){
				CodeItem codeItem = (CodeItem)current;
				fqn=codeItem.getName()+"."+fqn;
			}
		}
		return fqn;
	}
	
	private CodeModel getCodeModel(AbstractCodeElement elt){
		if(elt==null) return null;
		EObject current = elt;
		while(current.eContainer()!=null){
			current = current.eContainer();
			if(current instanceof CodeModel){
				return (CodeModel)current;
			}
		}
		return null;
	}
	
	
	/**
	 * Utility function: produces the list of ClassUnit, with the FQN as key.
	 * @return
	 */
	public Map<String, Datatype> getAllClassInterfaceUnit(){
		Map<String, Datatype> classList = new HashMap<String, Datatype>();
		for(Iterator<EObject> i = resource.getAllContents(); i.hasNext() ; ){
    		Object obj = i.next();
    		if(obj instanceof ClassUnit || obj instanceof InterfaceUnit){
    			Datatype classUnit = (Datatype)obj; 
    			String fqn = getFQN(classUnit);
    			classList.put(fqn, classUnit);
    		}
		}
		return classList;
	}
	
	public void printAllCalls(){
		int callsCount = 0;
		List<Calls> callsList = getAllCalls();
		
		for(Calls call: callsList){
			boolean ignored = false;
			ControlElement toMethod = call.getTo();
			Datatype toClass = (Datatype)toMethod.eContainer();
			ControlElement fromMethod = getCallerMethod(call);
			Datatype fromClass = null;
			if(fromMethod!=null) fromClass = (Datatype)fromMethod.eContainer();
			
			if(getCodeModel(call.getFrom())!=this.model ||
					getCodeModel(call.getTo())!=this.model){
				ignored = true;
			}
			/*System.out.println("("+callsCount+") Call: " +
					(fromClass!=null?fromClass.getName():"??") + "." +
					(fromMethod!=null?fromMethod.getName():"??") + "->" +
					toClass.getName() + "." + 
					toMethod.getName());*/
			System.out.println((ignored?"****":"")+getFQN(fromMethod)+"->"+getFQN(toMethod));
			
			callsCount++;
		}
		for(Iterator<EObject> i = resource.getAllContents(); i.hasNext() ; ){
    		Object obj = i.next();
    		
    		if(obj instanceof Calls){
    			
    		}
    	}
    	System.out.println("******** Total Calls: "+callsCount);
	}
	
	public List<Calls> getAllCalls(){
		List<Calls> callsList = new ArrayList<Calls>();
		for(Iterator<EObject> i = resource.getAllContents(); i.hasNext() ; ){
    		Object obj = i.next();
    		if(obj instanceof Calls){
    			callsList.add((Calls)obj);
    		}
		}
		return callsList;
	}
	
	public List<MethodUnit> getAllMethods(){
		List<MethodUnit> methodsList = new ArrayList<MethodUnit>();
		for(Iterator<EObject> i = resource.getAllContents(); i.hasNext() ; ){
    		Object obj = i.next();
    		if(obj instanceof MethodUnit){
    			MethodUnit method = (MethodUnit)obj;
    			methodsList.add(method);
    		}
		}
		return methodsList;
	}
	
	public List<Datatype> getAllClassInterface(){
		List<Datatype> classInterfaceList = new ArrayList<Datatype>();
		for(Iterator<EObject> i = resource.getAllContents(); i.hasNext() ; ){
    		Object obj = i.next();
    		if(obj instanceof ClassUnit || obj instanceof InterfaceUnit){
    			Datatype classInterface = (Datatype)obj;
    			classInterfaceList.add(classInterface);
    		}
		}
		return classInterfaceList;
	}
	
	
	private void setupWorkingMemory(KieSession kSession){
		List<Calls> callsList = getAllCalls();
		System.out.println("We have "+callsList.size()+" calls");
    	for(Calls call: callsList){
    		kSession.insert(KDMAdapterFactory.getInstance().adapt(call));
    	}
    	List<MethodUnit> methods = getAllMethods();
    	System.out.println("We have "+methods.size()+" methods");
    	for(MethodUnit method: methods){
    		kSession.insert(KDMAdapterFactory.getInstance().adapt(method));
    		
    	}
    	List<Datatype> classInterfaces = getAllClassInterface();
    	System.out.println("We have "+classInterfaces.size()+" classes/interfaces");
    	for(Datatype classInterface: classInterfaces){
    		if(classInterface instanceof ClassUnit) 
    			kSession.insert(KDMAdapterFactory.getInstance().adapt((ClassUnit)classInterface));
    		if(classInterface instanceof InterfaceUnit) 
    			kSession.insert(KDMAdapterFactory.getInstance().adapt((InterfaceUnit)classInterface));
    	}
	}
	
	public void saveModel(String path){
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		Resource newResource = resSet.createResource(URI.createURI(path));
		newResource.getContents().add(
				(Segment)(this.model.eContainer())
				);
		try {
			newResource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	    }
	}
	
	public void dig(){
		try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	setupWorkingMemory(kSession);
        	
        	kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
	}
	
	
}
