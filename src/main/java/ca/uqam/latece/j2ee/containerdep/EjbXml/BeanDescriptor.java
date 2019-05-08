/**
 * © Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal
 */
package ca.uqam.latece.j2ee.containerdep.EjbXml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bean Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getLocalHomeInterface <em>Local Home Interface</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getLocalInterface <em>Local Interface</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getRemoteHomeInterface <em>Remote Home Interface</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getRemoteInterface <em>Remote Interface</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getEnventry <em>Enventry</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 *
 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getBeanDescriptor()
 * @model abstract="true"
 * @generated
 */
public interface BeanDescriptor extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal";

	/**
	 * Returns the value of the '<em><b>Ejb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Name</em>' attribute.
	 * @see #setEjbName(String)
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getBeanDescriptor_EjbName()
	 * @model
	 * @generated
	 */
	String getEjbName();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getEjbName <em>Ejb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Name</em>' attribute.
	 * @see #getEjbName()
	 * @generated
	 */
	void setEjbName(String value);

	/**
	 * Returns the value of the '<em><b>Ejb Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Class</em>' attribute.
	 * @see #setEjbClass(String)
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getBeanDescriptor_EjbClass()
	 * @model
	 * @generated
	 */
	String getEjbClass();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getEjbClass <em>Ejb Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Class</em>' attribute.
	 * @see #getEjbClass()
	 * @generated
	 */
	void setEjbClass(String value);

	/**
	 * Returns the value of the '<em><b>Local Home Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Home Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Home Interface</em>' attribute.
	 * @see #setLocalHomeInterface(String)
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getBeanDescriptor_LocalHomeInterface()
	 * @model
	 * @generated
	 */
	String getLocalHomeInterface();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getLocalHomeInterface <em>Local Home Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Home Interface</em>' attribute.
	 * @see #getLocalHomeInterface()
	 * @generated
	 */
	void setLocalHomeInterface(String value);

	/**
	 * Returns the value of the '<em><b>Local Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Interface</em>' attribute.
	 * @see #setLocalInterface(String)
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getBeanDescriptor_LocalInterface()
	 * @model
	 * @generated
	 */
	String getLocalInterface();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getLocalInterface <em>Local Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Interface</em>' attribute.
	 * @see #getLocalInterface()
	 * @generated
	 */
	void setLocalInterface(String value);

	/**
	 * Returns the value of the '<em><b>Remote Home Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Home Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Home Interface</em>' attribute.
	 * @see #setRemoteHomeInterface(String)
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getBeanDescriptor_RemoteHomeInterface()
	 * @model
	 * @generated
	 */
	String getRemoteHomeInterface();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getRemoteHomeInterface <em>Remote Home Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Home Interface</em>' attribute.
	 * @see #getRemoteHomeInterface()
	 * @generated
	 */
	void setRemoteHomeInterface(String value);

	/**
	 * Returns the value of the '<em><b>Remote Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Interface</em>' attribute.
	 * @see #setRemoteInterface(String)
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getBeanDescriptor_RemoteInterface()
	 * @model
	 * @generated
	 */
	String getRemoteInterface();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getRemoteInterface <em>Remote Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Interface</em>' attribute.
	 * @see #getRemoteInterface()
	 * @generated
	 */
	void setRemoteInterface(String value);

	/**
	 * Returns the value of the '<em><b>Enventry</b></em>' containment reference list.
	 * The list contents are of type {@link ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enventry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enventry</em>' containment reference list.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getBeanDescriptor_Enventry()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvEntry> getEnventry();

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
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getBeanDescriptor_DisplayName()
	 * @model
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

} // BeanDescriptor
