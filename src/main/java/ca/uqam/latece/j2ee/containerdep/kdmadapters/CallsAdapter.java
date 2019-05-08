package ca.uqam.latece.j2ee.containerdep.kdmadapters;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement;
import org.eclipse.gmt.modisco.omg.kdm.action.Calls;
import org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.ControlElement;
import org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.Package;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Annotation;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Attribute;
import org.eclipse.gmt.modisco.omg.kdm.kdm.ExtendedValue;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Stereotype;


/**
 * Adapter for the Calls KDM concept. 
 *  
 * @author Anis Boubaker
 *
 */
public class CallsAdapter extends KDMGenericAdapter<Calls> implements Calls {

		
	protected CallsAdapter(Calls c) {
		super(c);
	}
	
	public MethodUnitAdapter getToMethod(){
		if(this.getTo() instanceof MethodUnit) return KDMAdapterFactory.getInstance().adapt((MethodUnit)this.getTo());
		return null;
	}
	
	
	public MethodUnitAdapter getFromMethod(){
		EObject current = this.getFrom();
		while(current!=null){
			if(current instanceof MethodUnit){
				return KDMAdapterFactory.getInstance().adapt((MethodUnit)current);
			}
			current = current.eContainer();
		}
		return null;
	}
	
	public Calls createSiblingCallTo(MethodUnitAdapter method){
		Calls newCall = EcoreUtil.copy(this.getAdaptee());
		newCall.setTo(method.getAdaptee());
		ActionElement callContainer= (ActionElement)(this.adaptee.eContainer());
		callContainer.getActionRelation().add(newCall);
		return newCall;
	}

	
	/*
	 * Below: methods overridden from the adaptee class. 
	 * All calls are redirected to the adaptee.
	 */
	
	@Override
	public EList<Stereotype> getStereotype() {
		return adaptee.getStereotype();
	}

	@Override
	public EList<ExtendedValue> getTaggedValue() {
		return adaptee.getTaggedValue();
	}

	@Override
	public EList<Attribute> getAttribute() {
		return adaptee.getAttribute();
	}

	@Override
	public EList<Annotation> getAnnotation() {
		return adaptee.getAnnotation();
	}

	@Override
	public ControlElement getTo() {
		return adaptee.getTo();
	}

	@Override
	public void setTo(ControlElement value) {
		adaptee.setTo(value);		
	}

	@Override
	public ActionElement getFrom() {
		return adaptee.getFrom();
	}

	@Override
	public void setFrom(ActionElement value) {
		adaptee.setFrom(value);
	}
	
	
	
}
