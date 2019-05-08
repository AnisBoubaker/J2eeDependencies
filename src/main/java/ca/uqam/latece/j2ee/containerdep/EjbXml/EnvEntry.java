/**
 * © Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal
 */
package ca.uqam.latece.j2ee.containerdep.EjbXml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry#getName <em>Name</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry#getType <em>Type</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getEnvEntry()
 * @model
 * @generated
 */
public interface EnvEntry extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getEnvEntry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getEnvEntry_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getEnvEntry_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // EnvEntry
