/**
 * © Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal
 */
package ca.uqam.latece.j2ee.containerdep.EjbXml.util;

import ca.uqam.latece.j2ee.containerdep.EjbXml.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage
 * @generated
 */
public class EjbXmlSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EjbXmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbXmlSwitch() {
		if (modelPackage == null) {
			modelPackage = EjbXmlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EjbXmlPackage.BEAN_DESCRIPTOR: {
				BeanDescriptor beanDescriptor = (BeanDescriptor)theEObject;
				T result = caseBeanDescriptor(beanDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbXmlPackage.ENV_ENTRY: {
				EnvEntry envEntry = (EnvEntry)theEObject;
				T result = caseEnvEntry(envEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR: {
				DeploymentDescriptor deploymentDescriptor = (DeploymentDescriptor)theEObject;
				T result = caseDeploymentDescriptor(deploymentDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbXmlPackage.ENTITY_BEAN_DESCRIPTOR: {
				EntityBeanDescriptor entityBeanDescriptor = (EntityBeanDescriptor)theEObject;
				T result = caseEntityBeanDescriptor(entityBeanDescriptor);
				if (result == null) result = caseBeanDescriptor(entityBeanDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbXmlPackage.SESSION_BEAN_DESCRIPTOR: {
				SessionBeanDescriptor sessionBeanDescriptor = (SessionBeanDescriptor)theEObject;
				T result = caseSessionBeanDescriptor(sessionBeanDescriptor);
				if (result == null) result = caseBeanDescriptor(sessionBeanDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjbXmlPackage.MESSAGE_BEAN_DESCRIPTOR: {
				MessageBeanDescriptor messageBeanDescriptor = (MessageBeanDescriptor)theEObject;
				T result = caseMessageBeanDescriptor(messageBeanDescriptor);
				if (result == null) result = caseBeanDescriptor(messageBeanDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeanDescriptor(BeanDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Env Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Env Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvEntry(EnvEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentDescriptor(DeploymentDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Bean Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Bean Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityBeanDescriptor(EntityBeanDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Bean Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Bean Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionBeanDescriptor(SessionBeanDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Bean Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Bean Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageBeanDescriptor(MessageBeanDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EjbXmlSwitch
