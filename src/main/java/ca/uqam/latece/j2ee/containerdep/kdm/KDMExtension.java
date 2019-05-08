package ca.uqam.latece.j2ee.containerdep.kdm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gmt.modisco.omg.kdm.code.CodeModel;
import org.eclipse.gmt.modisco.omg.kdm.kdm.ExtensionFamily;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KdmFactory;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Stereotype;

/**
 * Abstract class 
 * 
 * @author Anis Boubaker
 *
 */
public abstract class KDMExtension {
	
	private String extensionName;
	private CodeModel codeModel;
	private ExtensionFamily extension;
	protected Map<ExtensionStereotype, Stereotype> stereotypes = new HashMap<ExtensionStereotype, Stereotype>();
	
	
	protected KDMExtension(CodeModel codeModel){
		this.codeModel = codeModel;
		this.setStereotypes();
		this.extendCodeModel();
	}
	
	protected abstract void setStereotypes();
	
	protected void setStereotypes(ExtensionStereotype[] stereotypes){
		for(ExtensionStereotype s : stereotypes){
			Stereotype stereotypeObject = createStereotypeNamed(s); 
			this.stereotypes.put(s, stereotypeObject);
		}
	}
	
	protected void extendCodeModel(){
		this.extension = KdmFactory.eINSTANCE.createExtensionFamily();
		extension.setName(this.extensionName);
		this.codeModel.getExtension().add(extension);
		
		for(Stereotype s : this.stereotypes.values()){
			this.extension.getStereotype().add(s);
		}
	}
	
	protected Stereotype createStereotypeNamed(ExtensionStereotype s){
		Stereotype stereotype = KdmFactory.eINSTANCE.createStereotype();
		stereotype.setName(s.getName());
		return stereotype;
	}
	
	public String getExtensionName(){
		return this.extensionName;
	}
	
	protected void setExtensionName(String name){
		this.extensionName = name;
	}
	
	public Stereotype getStereotype(ExtensionStereotype e){
		return this.stereotypes.get(e);
	}
	
	public static boolean isExtended(CodeModel codeModel, String extensionName){
		for(ExtensionFamily e: codeModel.getExtension()){
			if(e.getName().compareTo(extensionName)==0) 
				return true;
		}
		return false;
	}
	
}
