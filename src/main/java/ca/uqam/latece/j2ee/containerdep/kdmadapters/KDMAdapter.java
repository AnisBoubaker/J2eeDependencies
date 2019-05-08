package ca.uqam.latece.j2ee.containerdep.kdmadapters;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.omg.kdm.core.ModelElement;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Annotation;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Attribute;
import org.eclipse.gmt.modisco.omg.kdm.kdm.ExtendedValue;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Stereotype;

public abstract class KDMAdapter<T extends ModelElement>{
	protected T adaptee; 
	
	protected KDMAdapter(T adaptee){
		this.adaptee = adaptee;
	}
	
	public T getAdaptee(){
		return this.adaptee;
	}
	
	/********************************
	 * BELOW: Overridden methods related 
	 * to ModelElement class, that is subclassed
	 * by all adapters.  
	 /*******************************/
	
	public EList<Attribute> getAttribute() {
		return adaptee.getAttribute();
	}

	public EList<Annotation> getAnnotation() {
		return adaptee.getAnnotation();
	}
	
	public EList<Stereotype> getStereotype() {
		return adaptee.getStereotype();
	}

	public EList<ExtendedValue> getTaggedValue() {
		return adaptee.getTaggedValue();
	}
	
	/********************************
	 * BELOW: EMF generic methods to 
	 * be overridden by all adapters.  
	 /*******************************
	
	/**
	 * 
	 * @return
	 */
	public EClass eClass() {
		return adaptee.eClass();
	}
	
	public Resource eResource() {
		return adaptee.eResource();
	}

	public EObject eContainer() {
		return adaptee.eContainer();
	}

	public EStructuralFeature eContainingFeature() {
		return adaptee.eContainingFeature();
	}

	public EReference eContainmentFeature() {
		return adaptee.eContainmentFeature();
	}

	public EList<EObject> eContents() {
		return adaptee.eContents();
	}

	public TreeIterator<EObject> eAllContents() {
		return adaptee.eAllContents();
	}

	public boolean eIsProxy() {
		return adaptee.eIsProxy();
	}

	public EList<EObject> eCrossReferences() {
		return adaptee.eCrossReferences();
	}

	public Object eGet(EStructuralFeature feature) {
		return adaptee.eGet(feature);
	}

	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return adaptee.eGet(feature, resolve);
	}

	public void eSet(EStructuralFeature feature, Object newValue) {
		adaptee.eSet(feature, newValue);
	}

	public boolean eIsSet(EStructuralFeature feature) {
		return adaptee.eIsSet(feature);
	}

	public void eUnset(EStructuralFeature feature) {
		adaptee.eUnset(feature);
	}

	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		return adaptee.eInvoke(operation, arguments);
	}

	public EList<Adapter> eAdapters() {
		return adaptee.eAdapters();
	}

	public boolean eDeliver() {
		return adaptee.eDeliver();
	}

	public void eSetDeliver(boolean deliver) {
		adaptee.eSetDeliver(deliver);
		
	}

	public void eNotify(Notification notification) {
		adaptee.eNotify(notification);
	}
}
