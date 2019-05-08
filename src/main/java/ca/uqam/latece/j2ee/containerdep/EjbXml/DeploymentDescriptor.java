/**
 * © Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal
 */
package ca.uqam.latece.j2ee.containerdep.EjbXml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getEnterpriseBeans <em>Enterprise Beans</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getVersion <em>Version</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 *
 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getDeploymentDescriptor()
 * @model
 * @generated
 */
public interface DeploymentDescriptor extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal";

	/**
	 * Returns the value of the '<em><b>Enterprise Beans</b></em>' containment reference list.
	 * The list contents are of type {@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enterprise Beans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enterprise Beans</em>' containment reference list.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getDeploymentDescriptor_EnterpriseBeans()
	 * @model containment="true"
	 * @generated
	 */
	EList<BeanDescriptor> getEnterpriseBeans();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getDeploymentDescriptor_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getDeploymentDescriptor_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getDeploymentDescriptor_DisplayName()
	 * @model
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

} // DeploymentDescriptor
