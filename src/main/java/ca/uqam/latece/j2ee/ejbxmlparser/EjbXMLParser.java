package ca.uqam.latece.j2ee.ejbxmlparser;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.*;

import ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor;
import ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor;
import ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlFactory;
import ca.uqam.latece.j2ee.containerdep.EjbXml.EntityBeanDescriptor;
import ca.uqam.latece.j2ee.containerdep.EjbXml.PersistenceType;
import ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanDescriptor;
import ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanType;


public class EjbXMLParser {
	private List<File> filesToParse;
	private List<DeploymentDescriptor> deploymentDescriptors;
	
	
	public EjbXMLParser(){
		this.filesToParse = new ArrayList<File>();
		this.deploymentDescriptors = new ArrayList<DeploymentDescriptor>();
	}
	
	public EjbXMLParser(List<File> filesToParse){
		this();
		this.filesToParse = filesToParse;
	}
	
	public List<DeploymentDescriptor> getDeploymentDescriptors(){
		return this.deploymentDescriptors;
	}
	
	/**
	 * This function iterates through all the DDs and adds all their BeanDescriptors
	 * into a list that is returned by the method. 
	 * 
	 * @return
	 */
	public List<BeanDescriptor> getAllBeanDescriptors(){
		ArrayList<BeanDescriptor> beansList = new ArrayList<BeanDescriptor>();
		for(DeploymentDescriptor dd : this.deploymentDescriptors){
			beansList.addAll(dd.getEnterpriseBeans());
		}
		return beansList;
	}
	
	public void parseAll(){
		for(File f: this.filesToParse){
			parseXMLFile(f);
		}
	}
	
	private void parseXMLFile(File file){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);
			Element root = doc.getDocumentElement();
			if(root.getTagName().equalsIgnoreCase("ejb-jar")){
				
				DeploymentDescriptor dd = EjbXmlFactory.eINSTANCE.createDeploymentDescriptor();
				this.deploymentDescriptors.add(dd);
				dd.setVersion(root.getAttribute("version"));
				
				NodeList nodes = root.getChildNodes();
				for(int counter=0; counter<nodes.getLength(); counter++){
					Node currentNode = nodes.item(counter);
					switch(currentNode.getNodeName().toLowerCase()){
						case "enterprise-beans": parseBeans(currentNode, dd); break;
						case "assembly-descriptor": parseAssemblyDescriptor(currentNode, dd); break;
						case "description": dd.setDescription(currentNode.getTextContent()); break;
						case "display-name": dd.setDisplayName(currentNode.getTextContent()); break;
					}
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void parseBeans(Node node, DeploymentDescriptor dd){
		NodeList nodes = node.getChildNodes();
				
		for(int counter=0; counter<nodes.getLength(); counter++){
			Node currentNode = nodes.item(counter);
			BeanDescriptor newBean=null;
			switch(currentNode.getNodeName().toLowerCase()){
				case "session": newBean = parseSessionBean(currentNode); break;
				case "entity": newBean = parseEntityBean(currentNode); break;
			}
			if(newBean!=null){
				dd.getEnterpriseBeans().add(newBean);
			}
		}
	}
	
	private BeanDescriptor parseSessionBean(Node node){
		SessionBeanDescriptor bean = EjbXmlFactory.eINSTANCE.createSessionBeanDescriptor();
		NodeList nodes = node.getChildNodes();
		
		for(int counter=0; counter<nodes.getLength(); counter++){
			Node currentNode = nodes.item(counter);
			
			parseBeanCommonTags(currentNode, bean);
			
			switch(currentNode.getNodeName().toLowerCase()){
				case "session-type": 
					if(currentNode.getTextContent().equalsIgnoreCase("stateful")) bean.setType(SessionBeanType.STATEFUL);
					if(currentNode.getTextContent().equalsIgnoreCase("stateless")) bean.setType(SessionBeanType.STATELESS);
					break;
			}
		}
		return bean;
	}
	
	private void parseBeanCommonTags(Node node, BeanDescriptor bean){
		switch(node.getNodeName().toLowerCase()){
			case "ejb-name": bean.setEjbName(node.getTextContent()); break;
			case "display-name": bean.setDisplayName(node.getTextContent()); break;
			case "ejb-class": bean.setEjbClass(node.getTextContent()); break;
			case "local-home": bean.setLocalHomeInterface(node.getTextContent()); break;
			case "remote-home": bean.setRemoteHomeInterface(node.getTextContent()); break;
			case "local": bean.setLocalInterface(node.getTextContent()); break;
			case "remote": bean.setRemoteInterface(node.getTextContent()); break;
		}
	}
	
	private BeanDescriptor parseEntityBean(Node node){
		EntityBeanDescriptor bean = EjbXmlFactory.eINSTANCE.createEntityBeanDescriptor();
		NodeList nodes = node.getChildNodes();
		
		for(int counter=0; counter<nodes.getLength(); counter++){
			Node currentNode = nodes.item(counter);
			
			parseBeanCommonTags(currentNode, bean);
			
			switch(currentNode.getNodeName().toLowerCase()){
				case "persistence-type": 
					if(currentNode.getTextContent().equalsIgnoreCase("Container")) 
						bean.setPersistenceType(PersistenceType.CONTAINER);
					if(currentNode.getTextContent().equalsIgnoreCase("Bean")) 
						bean.setPersistenceType(PersistenceType.BEAN);
					break;
			}
		}
		return bean;
	}
	
	private void parseAssemblyDescriptor(Node node, DeploymentDescriptor dd){
		/**
		 * @TODO: Complete this method.
		 */
	}
}
