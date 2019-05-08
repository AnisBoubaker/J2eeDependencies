/**
 * © Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal
 */
package ca.uqam.latece.j2ee.containerdep.EjbXml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Bean Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EntityBeanDescriptor#getPersistenceType <em>Persistence Type</em>}</li>
 * </ul>
 *
 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getEntityBeanDescriptor()
 * @model
 * @generated
 */
public interface EntityBeanDescriptor extends BeanDescriptor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal";

	/**
	 * Returns the value of the '<em><b>Persistence Type</b></em>' attribute.
	 * The default value is <code>"Unspecified"</code>.
	 * The literals are from the enumeration {@link ca.uqam.latece.j2ee.containerdep.EjbXml.PersistenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Type</em>' attribute.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.PersistenceType
	 * @see #setPersistenceType(PersistenceType)
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#getEntityBeanDescriptor_PersistenceType()
	 * @model default="Unspecified"
	 * @generated
	 */
	PersistenceType getPersistenceType();

	/**
	 * Sets the value of the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EntityBeanDescriptor#getPersistenceType <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Type</em>' attribute.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.PersistenceType
	 * @see #getPersistenceType()
	 * @generated
	 */
	void setPersistenceType(PersistenceType value);

} // EntityBeanDescriptor
