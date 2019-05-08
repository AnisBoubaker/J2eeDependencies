package ca.uqam.latece.j2ee.containerdep.kdmadapters;

import java.util.List;

import org.eclipse.gmt.modisco.omg.kdm.kdm.Stereotype;

public class Util {
	public static boolean hasStereotypeNamed(List<Stereotype> stereotypes, String name ){
		for(Stereotype s : stereotypes){
			if(s.getName().equals(name)) return true;
		}
		return false;
	}
}
