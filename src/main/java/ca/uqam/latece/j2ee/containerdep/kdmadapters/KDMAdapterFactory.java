package ca.uqam.latece.j2ee.containerdep.kdmadapters;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.gmt.modisco.omg.kdm.action.Calls;
import org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.Datatype;
import org.eclipse.gmt.modisco.omg.kdm.code.InterfaceUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit;
import org.eclipse.gmt.modisco.omg.kdm.core.ModelElement;

/**
 * Factory class that creates adapter for KDM concepts used in the 
 * Container Dependencies project. 
 * 
 * An adapter is a Wrapper of an instance of a KDM concept that extends it
 * with some project specific behavior. 
 *  
 * @author Anis Boubaker
 *
 */
public class KDMAdapterFactory {
	private static KDMAdapterFactory eInstance=null;
	@SuppressWarnings("rawtypes")
	private Map<ModelElement, KDMAdapter> createdAdapters = new HashMap<ModelElement,KDMAdapter>();
	
	private KDMAdapterFactory(){
		//Singleton...
	}
	
	public static KDMAdapterFactory getInstance(){
		if(eInstance==null) eInstance = new KDMAdapterFactory();
		return eInstance;
	}
	
	public CallsAdapter adapt(Calls x){
		if(createdAdapters.containsKey(x)) return (CallsAdapter)createdAdapters.get(x);
		CallsAdapter adapter = new CallsAdapter(x);
		createdAdapters.put(x, adapter);
		return adapter;
	}
	
	public ClassUnitAdapter adapt(ClassUnit x){
		if(createdAdapters.containsKey(x)) return (ClassUnitAdapter)createdAdapters.get(x);
		ClassUnitAdapter adapter = new ClassUnitAdapter(x);
		createdAdapters.put(x, adapter);
		return adapter;
	}
	
	public InterfaceUnitAdapter adapt(InterfaceUnit x){
		if(createdAdapters.containsKey(x)) return (InterfaceUnitAdapter)createdAdapters.get(x);
		InterfaceUnitAdapter adapter = new InterfaceUnitAdapter(x);
		createdAdapters.put(x, adapter);
		return adapter;
	}
	
		
	public MethodUnitAdapter adapt(MethodUnit x){
		if(createdAdapters.containsKey(x)) return (MethodUnitAdapter)createdAdapters.get(x);
		MethodUnitAdapter adapter = new MethodUnitAdapter(x);
		createdAdapters.put(x, adapter);
		return adapter;
	}
}
