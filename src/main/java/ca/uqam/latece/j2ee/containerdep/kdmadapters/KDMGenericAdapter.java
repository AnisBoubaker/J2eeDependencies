package ca.uqam.latece.j2ee.containerdep.kdmadapters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.InterfaceUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.Package;
import org.eclipse.gmt.modisco.omg.kdm.core.ModelElement;

/**
 * Generic Adaptor, provides generic methods to concrete adapters.
 * 
 * @author Anis Boubaker
 *
 * @param <T>
 */
public abstract class KDMGenericAdapter<T extends ModelElement> extends KDMAdapter<T> {

	boolean didComputeEnclosingElements = false;
	MethodUnitAdapter enclosingMethod = null;
	ClassUnitAdapter enclosingClass = null;
	InterfaceUnitAdapter enclosingInterface = null;
	String fullPackageName = "" ;
	
	protected KDMGenericAdapter(T adaptee) {
		super(adaptee);
	}
	
	
	public MethodUnitAdapter getEnclosingMethod(){
		computeEnclosingElements();
		return enclosingMethod;
	}
	
	public ClassUnitAdapter getEnclosingClass(){
		computeEnclosingElements();
		return enclosingClass;
	}
	
	public InterfaceUnitAdapter getEnclosingInterface(){
		computeEnclosingElements();
		return enclosingInterface;
	}
	
	public String getFullPackageName(){
		computeEnclosingElements();
		return fullPackageName;
	}
	
	private void computeEnclosingElements(){
		if(this.didComputeEnclosingElements) return;
		
		EObject current = this.eContainer();
		while(current!=null){
			if(current instanceof MethodUnit){
				this.enclosingMethod = KDMAdapterFactory.getInstance().adapt((MethodUnit)current);
			}
			if(current instanceof ClassUnit){
				this.enclosingClass = KDMAdapterFactory.getInstance().adapt((ClassUnit)current);
			}
			
			if(current instanceof InterfaceUnit){
				this.enclosingInterface = KDMAdapterFactory.getInstance().adapt((InterfaceUnit)current);
			}
			
			if(current instanceof Package){
				this.fullPackageName = ((Package)current).getName() + "." + fullPackageName;
			}
			
			current = current.eContainer();
		}
		this.didComputeEnclosingElements = true;
	}
	
	

}
