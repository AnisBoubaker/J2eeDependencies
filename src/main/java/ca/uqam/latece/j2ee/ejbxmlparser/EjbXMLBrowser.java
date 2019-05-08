package ca.uqam.latece.j2ee.ejbxmlparser;

import java.io.File;
import java.util.ArrayList;

import ca.uqam.latece.j2ee.containerdep.exceptions.EjbXMLParserException;

public class EjbXMLBrowser extends ArrayList<File>{

	private static final long serialVersionUID = -554128851456496235L;
	private String rootDirectoryPath;
	
	public EjbXMLBrowser(String root){
		this.rootDirectoryPath = root;
		this.browse();
	}
	
	private void browse(){
		File root = new File(rootDirectoryPath);
		
		if(root.isFile()) throw new EjbXMLParserException();
		
		this.browse(root);
	}
	
	private void browse(File directory){
		for(File f: directory.listFiles()){
			if(f.isDirectory() && !f.getName().equalsIgnoreCase("bin")) browse(f);
			else {
				if(f.getName().equalsIgnoreCase("ejb-jar.xml")){
					this.add(f);
				}
			}
		}
	}
	
}
