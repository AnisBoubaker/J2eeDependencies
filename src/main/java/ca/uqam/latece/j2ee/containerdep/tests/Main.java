package ca.uqam.latece.j2ee.containerdep.tests;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;

import ca.uqam.latece.j2ee.containerdep.J2EEDependenciesDigger;
import ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor;
import ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor;
import ca.uqam.latece.j2ee.ejbxmlparser.EjbXMLBrowser;
import ca.uqam.latece.j2ee.ejbxmlparser.EjbXMLParser;

public class Main {

	//PET STORE
	//private static final String MODEL_PATH = "models/kdm/com.sun.j2ee.blueprints.petstore.petstore_kdm.xmi";
	//private static final String MODEL_NAME = "com.sun.j2ee.blueprints.petstore.petstore";
	
	//ONLINE SHOPPING
	/*private static final String MODEL_PATH = "models/kdm/OnlineShopping_kdm.xmi";
	private static final String MODEL_NAME = "OnlineShopping";
	private static final String PROJECT_FULL_PATH= "/Users/anis/Cloud/Eclipse/workspace-neon/OnlineShopping";*/
	
	//Pet Store All
	private static final String MODEL_PATH = "models/kdm/petstore-all_kdm.xmi";
	private static final String MODEL_NAME = "petstore-all";
	private static final String PROJECT_FULL_PATH= "/Users/anis/Documents/Eclipse/workspace-neon/petstore-all";
	
	
	public static void main(String[] args) {
		J2EEDependenciesDigger digger = new J2EEDependenciesDigger(MODEL_PATH, MODEL_NAME, PROJECT_FULL_PATH);
		digger.dig();
		digger.saveModel("models/kdm/petstore-all-result_kdm.xmi");
	}
}
