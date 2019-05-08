/**
 * © Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal
 */
package ca.uqam.latece.j2ee.containerdep.EjbXml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlFactory
 * @model kind="package"
 * @generated
 */
public interface EjbXmlPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "© Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EjbXml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.uqam.latece.j2ee.ejbxml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ejbxml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EjbXmlPackage eINSTANCE = ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.BeanDescriptorImpl <em>Bean Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.BeanDescriptorImpl
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getBeanDescriptor()
	 * @generated
	 */
	int BEAN_DESCRIPTOR = 0;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_DESCRIPTOR__EJB_NAME = 0;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_DESCRIPTOR__EJB_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Local Home Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_DESCRIPTOR__LOCAL_HOME_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Local Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_DESCRIPTOR__LOCAL_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Remote Home Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_DESCRIPTOR__REMOTE_HOME_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Remote Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_DESCRIPTOR__REMOTE_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Enventry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_DESCRIPTOR__ENVENTRY = 6;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_DESCRIPTOR__DISPLAY_NAME = 7;

	/**
	 * The number of structural features of the '<em>Bean Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_DESCRIPTOR_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Bean Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EnvEntryImpl <em>Env Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EnvEntryImpl
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getEnvEntry()
	 * @generated
	 */
	int ENV_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Env Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Env Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.DeploymentDescriptorImpl <em>Deployment Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.DeploymentDescriptorImpl
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getDeploymentDescriptor()
	 * @generated
	 */
	int DEPLOYMENT_DESCRIPTOR = 2;

	/**
	 * The feature id for the '<em><b>Enterprise Beans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_DESCRIPTOR__ENTERPRISE_BEANS = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_DESCRIPTOR__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_DESCRIPTOR__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_DESCRIPTOR__DISPLAY_NAME = 3;

	/**
	 * The number of structural features of the '<em>Deployment Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_DESCRIPTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Deployment Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EntityBeanDescriptorImpl <em>Entity Bean Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EntityBeanDescriptorImpl
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getEntityBeanDescriptor()
	 * @generated
	 */
	int ENTITY_BEAN_DESCRIPTOR = 3;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_DESCRIPTOR__EJB_NAME = BEAN_DESCRIPTOR__EJB_NAME;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_DESCRIPTOR__EJB_CLASS = BEAN_DESCRIPTOR__EJB_CLASS;

	/**
	 * The feature id for the '<em><b>Local Home Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_DESCRIPTOR__LOCAL_HOME_INTERFACE = BEAN_DESCRIPTOR__LOCAL_HOME_INTERFACE;

	/**
	 * The feature id for the '<em><b>Local Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_DESCRIPTOR__LOCAL_INTERFACE = BEAN_DESCRIPTOR__LOCAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Remote Home Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_DESCRIPTOR__REMOTE_HOME_INTERFACE = BEAN_DESCRIPTOR__REMOTE_HOME_INTERFACE;

	/**
	 * The feature id for the '<em><b>Remote Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_DESCRIPTOR__REMOTE_INTERFACE = BEAN_DESCRIPTOR__REMOTE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Enventry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_DESCRIPTOR__ENVENTRY = BEAN_DESCRIPTOR__ENVENTRY;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_DESCRIPTOR__DISPLAY_NAME = BEAN_DESCRIPTOR__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_DESCRIPTOR__PERSISTENCE_TYPE = BEAN_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Bean Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_DESCRIPTOR_FEATURE_COUNT = BEAN_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Bean Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_DESCRIPTOR_OPERATION_COUNT = BEAN_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.SessionBeanDescriptorImpl <em>Session Bean Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.SessionBeanDescriptorImpl
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getSessionBeanDescriptor()
	 * @generated
	 */
	int SESSION_BEAN_DESCRIPTOR = 4;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_DESCRIPTOR__EJB_NAME = BEAN_DESCRIPTOR__EJB_NAME;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_DESCRIPTOR__EJB_CLASS = BEAN_DESCRIPTOR__EJB_CLASS;

	/**
	 * The feature id for the '<em><b>Local Home Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_DESCRIPTOR__LOCAL_HOME_INTERFACE = BEAN_DESCRIPTOR__LOCAL_HOME_INTERFACE;

	/**
	 * The feature id for the '<em><b>Local Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_DESCRIPTOR__LOCAL_INTERFACE = BEAN_DESCRIPTOR__LOCAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Remote Home Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_DESCRIPTOR__REMOTE_HOME_INTERFACE = BEAN_DESCRIPTOR__REMOTE_HOME_INTERFACE;

	/**
	 * The feature id for the '<em><b>Remote Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_DESCRIPTOR__REMOTE_INTERFACE = BEAN_DESCRIPTOR__REMOTE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Enventry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_DESCRIPTOR__ENVENTRY = BEAN_DESCRIPTOR__ENVENTRY;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_DESCRIPTOR__DISPLAY_NAME = BEAN_DESCRIPTOR__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_DESCRIPTOR__TYPE = BEAN_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Session Bean Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_DESCRIPTOR_FEATURE_COUNT = BEAN_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Session Bean Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_DESCRIPTOR_OPERATION_COUNT = BEAN_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.MessageBeanDescriptorImpl <em>Message Bean Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.MessageBeanDescriptorImpl
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getMessageBeanDescriptor()
	 * @generated
	 */
	int MESSAGE_BEAN_DESCRIPTOR = 5;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BEAN_DESCRIPTOR__EJB_NAME = BEAN_DESCRIPTOR__EJB_NAME;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BEAN_DESCRIPTOR__EJB_CLASS = BEAN_DESCRIPTOR__EJB_CLASS;

	/**
	 * The feature id for the '<em><b>Local Home Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BEAN_DESCRIPTOR__LOCAL_HOME_INTERFACE = BEAN_DESCRIPTOR__LOCAL_HOME_INTERFACE;

	/**
	 * The feature id for the '<em><b>Local Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BEAN_DESCRIPTOR__LOCAL_INTERFACE = BEAN_DESCRIPTOR__LOCAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Remote Home Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BEAN_DESCRIPTOR__REMOTE_HOME_INTERFACE = BEAN_DESCRIPTOR__REMOTE_HOME_INTERFACE;

	/**
	 * The feature id for the '<em><b>Remote Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BEAN_DESCRIPTOR__REMOTE_INTERFACE = BEAN_DESCRIPTOR__REMOTE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Enventry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BEAN_DESCRIPTOR__ENVENTRY = BEAN_DESCRIPTOR__ENVENTRY;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BEAN_DESCRIPTOR__DISPLAY_NAME = BEAN_DESCRIPTOR__DISPLAY_NAME;

	/**
	 * The number of structural features of the '<em>Message Bean Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BEAN_DESCRIPTOR_FEATURE_COUNT = BEAN_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Bean Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BEAN_DESCRIPTOR_OPERATION_COUNT = BEAN_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanType <em>Session Bean Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanType
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getSessionBeanType()
	 * @generated
	 */
	int SESSION_BEAN_TYPE = 6;

	/**
	 * The meta object id for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.PersistenceType <em>Persistence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.PersistenceType
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getPersistenceType()
	 * @generated
	 */
	int PERSISTENCE_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor <em>Bean Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean Descriptor</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor
	 * @generated
	 */
	EClass getBeanDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Name</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getEjbName()
	 * @see #getBeanDescriptor()
	 * @generated
	 */
	EAttribute getBeanDescriptor_EjbName();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Class</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getEjbClass()
	 * @see #getBeanDescriptor()
	 * @generated
	 */
	EAttribute getBeanDescriptor_EjbClass();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getLocalHomeInterface <em>Local Home Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Home Interface</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getLocalHomeInterface()
	 * @see #getBeanDescriptor()
	 * @generated
	 */
	EAttribute getBeanDescriptor_LocalHomeInterface();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getLocalInterface <em>Local Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Interface</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getLocalInterface()
	 * @see #getBeanDescriptor()
	 * @generated
	 */
	EAttribute getBeanDescriptor_LocalInterface();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getRemoteHomeInterface <em>Remote Home Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Home Interface</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getRemoteHomeInterface()
	 * @see #getBeanDescriptor()
	 * @generated
	 */
	EAttribute getBeanDescriptor_RemoteHomeInterface();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getRemoteInterface <em>Remote Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Interface</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getRemoteInterface()
	 * @see #getBeanDescriptor()
	 * @generated
	 */
	EAttribute getBeanDescriptor_RemoteInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getEnventry <em>Enventry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enventry</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getEnventry()
	 * @see #getBeanDescriptor()
	 * @generated
	 */
	EReference getBeanDescriptor_Enventry();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor#getDisplayName()
	 * @see #getBeanDescriptor()
	 * @generated
	 */
	EAttribute getBeanDescriptor_DisplayName();

	/**
	 * Returns the meta object for class '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry
	 * @generated
	 */
	EClass getEnvEntry();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry#getName()
	 * @see #getEnvEntry()
	 * @generated
	 */
	EAttribute getEnvEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry#getType()
	 * @see #getEnvEntry()
	 * @generated
	 */
	EAttribute getEnvEntry_Type();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry#getValue()
	 * @see #getEnvEntry()
	 * @generated
	 */
	EAttribute getEnvEntry_Value();

	/**
	 * Returns the meta object for class '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor <em>Deployment Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Descriptor</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor
	 * @generated
	 */
	EClass getDeploymentDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getEnterpriseBeans <em>Enterprise Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enterprise Beans</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getEnterpriseBeans()
	 * @see #getDeploymentDescriptor()
	 * @generated
	 */
	EReference getDeploymentDescriptor_EnterpriseBeans();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getVersion()
	 * @see #getDeploymentDescriptor()
	 * @generated
	 */
	EAttribute getDeploymentDescriptor_Version();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getDescription()
	 * @see #getDeploymentDescriptor()
	 * @generated
	 */
	EAttribute getDeploymentDescriptor_Description();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor#getDisplayName()
	 * @see #getDeploymentDescriptor()
	 * @generated
	 */
	EAttribute getDeploymentDescriptor_DisplayName();

	/**
	 * Returns the meta object for class '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EntityBeanDescriptor <em>Entity Bean Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Bean Descriptor</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EntityBeanDescriptor
	 * @generated
	 */
	EClass getEntityBeanDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EntityBeanDescriptor#getPersistenceType <em>Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Type</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EntityBeanDescriptor#getPersistenceType()
	 * @see #getEntityBeanDescriptor()
	 * @generated
	 */
	EAttribute getEntityBeanDescriptor_PersistenceType();

	/**
	 * Returns the meta object for class '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanDescriptor <em>Session Bean Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Bean Descriptor</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanDescriptor
	 * @generated
	 */
	EClass getSessionBeanDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanDescriptor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanDescriptor#getType()
	 * @see #getSessionBeanDescriptor()
	 * @generated
	 */
	EAttribute getSessionBeanDescriptor_Type();

	/**
	 * Returns the meta object for class '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.MessageBeanDescriptor <em>Message Bean Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Bean Descriptor</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.MessageBeanDescriptor
	 * @generated
	 */
	EClass getMessageBeanDescriptor();

	/**
	 * Returns the meta object for enum '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanType <em>Session Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Session Bean Type</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanType
	 * @generated
	 */
	EEnum getSessionBeanType();

	/**
	 * Returns the meta object for enum '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.PersistenceType <em>Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Persistence Type</em>'.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.PersistenceType
	 * @generated
	 */
	EEnum getPersistenceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EjbXmlFactory getEjbXmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.BeanDescriptorImpl <em>Bean Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.BeanDescriptorImpl
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getBeanDescriptor()
		 * @generated
		 */
		EClass BEAN_DESCRIPTOR = eINSTANCE.getBeanDescriptor();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_DESCRIPTOR__EJB_NAME = eINSTANCE.getBeanDescriptor_EjbName();

		/**
		 * The meta object literal for the '<em><b>Ejb Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_DESCRIPTOR__EJB_CLASS = eINSTANCE.getBeanDescriptor_EjbClass();

		/**
		 * The meta object literal for the '<em><b>Local Home Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_DESCRIPTOR__LOCAL_HOME_INTERFACE = eINSTANCE.getBeanDescriptor_LocalHomeInterface();

		/**
		 * The meta object literal for the '<em><b>Local Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_DESCRIPTOR__LOCAL_INTERFACE = eINSTANCE.getBeanDescriptor_LocalInterface();

		/**
		 * The meta object literal for the '<em><b>Remote Home Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_DESCRIPTOR__REMOTE_HOME_INTERFACE = eINSTANCE.getBeanDescriptor_RemoteHomeInterface();

		/**
		 * The meta object literal for the '<em><b>Remote Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_DESCRIPTOR__REMOTE_INTERFACE = eINSTANCE.getBeanDescriptor_RemoteInterface();

		/**
		 * The meta object literal for the '<em><b>Enventry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAN_DESCRIPTOR__ENVENTRY = eINSTANCE.getBeanDescriptor_Enventry();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_DESCRIPTOR__DISPLAY_NAME = eINSTANCE.getBeanDescriptor_DisplayName();

		/**
		 * The meta object literal for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EnvEntryImpl <em>Env Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EnvEntryImpl
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getEnvEntry()
		 * @generated
		 */
		EClass ENV_ENTRY = eINSTANCE.getEnvEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY__NAME = eINSTANCE.getEnvEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY__TYPE = eINSTANCE.getEnvEntry_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY__VALUE = eINSTANCE.getEnvEntry_Value();

		/**
		 * The meta object literal for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.DeploymentDescriptorImpl <em>Deployment Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.DeploymentDescriptorImpl
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getDeploymentDescriptor()
		 * @generated
		 */
		EClass DEPLOYMENT_DESCRIPTOR = eINSTANCE.getDeploymentDescriptor();

		/**
		 * The meta object literal for the '<em><b>Enterprise Beans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_DESCRIPTOR__ENTERPRISE_BEANS = eINSTANCE.getDeploymentDescriptor_EnterpriseBeans();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_DESCRIPTOR__VERSION = eINSTANCE.getDeploymentDescriptor_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_DESCRIPTOR__DESCRIPTION = eINSTANCE.getDeploymentDescriptor_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_DESCRIPTOR__DISPLAY_NAME = eINSTANCE.getDeploymentDescriptor_DisplayName();

		/**
		 * The meta object literal for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EntityBeanDescriptorImpl <em>Entity Bean Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EntityBeanDescriptorImpl
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getEntityBeanDescriptor()
		 * @generated
		 */
		EClass ENTITY_BEAN_DESCRIPTOR = eINSTANCE.getEntityBeanDescriptor();

		/**
		 * The meta object literal for the '<em><b>Persistence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN_DESCRIPTOR__PERSISTENCE_TYPE = eINSTANCE.getEntityBeanDescriptor_PersistenceType();

		/**
		 * The meta object literal for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.SessionBeanDescriptorImpl <em>Session Bean Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.SessionBeanDescriptorImpl
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getSessionBeanDescriptor()
		 * @generated
		 */
		EClass SESSION_BEAN_DESCRIPTOR = eINSTANCE.getSessionBeanDescriptor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN_DESCRIPTOR__TYPE = eINSTANCE.getSessionBeanDescriptor_Type();

		/**
		 * The meta object literal for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.MessageBeanDescriptorImpl <em>Message Bean Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.MessageBeanDescriptorImpl
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getMessageBeanDescriptor()
		 * @generated
		 */
		EClass MESSAGE_BEAN_DESCRIPTOR = eINSTANCE.getMessageBeanDescriptor();

		/**
		 * The meta object literal for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanType <em>Session Bean Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanType
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getSessionBeanType()
		 * @generated
		 */
		EEnum SESSION_BEAN_TYPE = eINSTANCE.getSessionBeanType();

		/**
		 * The meta object literal for the '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.PersistenceType <em>Persistence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.PersistenceType
		 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.impl.EjbXmlPackageImpl#getPersistenceType()
		 * @generated
		 */
		EEnum PERSISTENCE_TYPE = eINSTANCE.getPersistenceType();

	}

} //EjbXmlPackage
