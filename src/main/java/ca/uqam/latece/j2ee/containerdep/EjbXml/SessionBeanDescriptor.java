/**
 * © Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal
 */
package ca.uqam.latece.j2ee.containerdep.EjbXml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session Bean Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanDescriptor#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getSessionBeanDescriptor()
 * @model
 * @generated
 */
public interface SessionBeanDescriptor extends BeanDescriptor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal";

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Unspecified"</code>.
	 * The literals are from the enumeration {@link ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanType
	 * @see #setType(SessionBeanType)
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getSessionBeanDescriptor_Type()
	 * @model default="Unspecified"
	 * @generated
	 */
	SessionBeanType getType();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanDescriptor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanType
	 * @see #getType()
	 * @generated
	 */
	void setType(SessionBeanType value);

} // SessionBeanDescriptor
