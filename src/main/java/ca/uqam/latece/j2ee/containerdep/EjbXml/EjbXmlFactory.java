/**
 * © Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal
 */
package ca.uqam.latece.j2ee.containerdep.EjbXml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage
 * @generated
 */
public interface EjbXmlFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EjbXmlFactory eINSTANCE = ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Env Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Env Entry</em>'.
	 * @generated
	 */
	EnvEntry createEnvEntry();

	/**
	 * Returns a new object of class '<em>Deployment Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Descriptor</em>'.
	 * @generated
	 */
	DeploymentDescriptor createDeploymentDescriptor();

	/**
	 * Returns a new object of class '<em>Entity Bean Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Bean Descriptor</em>'.
	 * @generated
	 */
	EntityBeanDescriptor createEntityBeanDescriptor();

	/**
	 * Returns a new object of class '<em>Session Bean Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session Bean Descriptor</em>'.
	 * @generated
	 */
	SessionBeanDescriptor createSessionBeanDescriptor();

	/**
	 * Returns a new object of class '<em>Message Bean Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Bean Descriptor</em>'.
	 * @generated
	 */
	MessageBeanDescriptor createMessageBeanDescriptor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EjbXmlPackage getEjbXmlPackage();

} //EjbXmlFactory
