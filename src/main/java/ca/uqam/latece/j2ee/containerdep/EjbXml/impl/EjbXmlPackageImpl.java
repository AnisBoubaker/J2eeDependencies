/**
 * © Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal
 */
package ca.uqam.latece.j2ee.containerdep.EjbXml.impl;

import ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor;
import ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor;
import ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlFactory;
import ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage;
import ca.uqam.latece.j2ee.containerdep.EjbXml.EntityBeanDescriptor;
import ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry;
import ca.uqam.latece.j2ee.containerdep.EjbXml.MessageBeanDescriptor;
import ca.uqam.latece.j2ee.containerdep.EjbXml.PersistenceType;
import ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanDescriptor;
import ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EjbXmlPackageImpl extends EPackageImpl implements EjbXmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beanDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityBeanDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionBeanDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageBeanDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sessionBeanTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum persistenceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EjbXmlPackageImpl() {
		super(eNS_URI, EjbXmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EjbXmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EjbXmlPackage init() {
		if (isInited) return (EjbXmlPackage)EPackage.Registry.INSTANCE.getEPackage(EjbXmlPackage.eNS_URI);

		// Obtain or create and register package
		EjbXmlPackageImpl theEjbXmlPackage = (EjbXmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EjbXmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EjbXmlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEjbXmlPackage.createPackageContents();

		// Initialize created meta-data
		theEjbXmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEjbXmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EjbXmlPackage.eNS_URI, theEjbXmlPackage);
		return theEjbXmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeanDescriptor() {
		return beanDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanDescriptor_EjbName() {
		return (EAttribute)beanDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanDescriptor_EjbClass() {
		return (EAttribute)beanDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanDescriptor_LocalHomeInterface() {
		return (EAttribute)beanDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanDescriptor_LocalInterface() {
		return (EAttribute)beanDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanDescriptor_RemoteHomeInterface() {
		return (EAttribute)beanDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanDescriptor_RemoteInterface() {
		return (EAttribute)beanDescriptorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeanDescriptor_Enventry() {
		return (EReference)beanDescriptorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanDescriptor_DisplayName() {
		return (EAttribute)beanDescriptorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvEntry() {
		return envEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvEntry_Name() {
		return (EAttribute)envEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvEntry_Type() {
		return (EAttribute)envEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvEntry_Value() {
		return (EAttribute)envEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentDescriptor() {
		return deploymentDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentDescriptor_EnterpriseBeans() {
		return (EReference)deploymentDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentDescriptor_Version() {
		return (EAttribute)deploymentDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentDescriptor_Description() {
		return (EAttribute)deploymentDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentDescriptor_DisplayName() {
		return (EAttribute)deploymentDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityBeanDescriptor() {
		return entityBeanDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityBeanDescriptor_PersistenceType() {
		return (EAttribute)entityBeanDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionBeanDescriptor() {
		return sessionBeanDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionBeanDescriptor_Type() {
		return (EAttribute)sessionBeanDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageBeanDescriptor() {
		return messageBeanDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSessionBeanType() {
		return sessionBeanTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersistenceType() {
		return persistenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbXmlFactory getEjbXmlFactory() {
		return (EjbXmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		beanDescriptorEClass = createEClass(BEAN_DESCRIPTOR);
		createEAttribute(beanDescriptorEClass, BEAN_DESCRIPTOR__EJB_NAME);
		createEAttribute(beanDescriptorEClass, BEAN_DESCRIPTOR__EJB_CLASS);
		createEAttribute(beanDescriptorEClass, BEAN_DESCRIPTOR__LOCAL_HOME_INTERFACE);
		createEAttribute(beanDescriptorEClass, BEAN_DESCRIPTOR__LOCAL_INTERFACE);
		createEAttribute(beanDescriptorEClass, BEAN_DESCRIPTOR__REMOTE_HOME_INTERFACE);
		createEAttribute(beanDescriptorEClass, BEAN_DESCRIPTOR__REMOTE_INTERFACE);
		createEReference(beanDescriptorEClass, BEAN_DESCRIPTOR__ENVENTRY);
		createEAttribute(beanDescriptorEClass, BEAN_DESCRIPTOR__DISPLAY_NAME);

		envEntryEClass = createEClass(ENV_ENTRY);
		createEAttribute(envEntryEClass, ENV_ENTRY__NAME);
		createEAttribute(envEntryEClass, ENV_ENTRY__TYPE);
		createEAttribute(envEntryEClass, ENV_ENTRY__VALUE);

		deploymentDescriptorEClass = createEClass(DEPLOYMENT_DESCRIPTOR);
		createEReference(deploymentDescriptorEClass, DEPLOYMENT_DESCRIPTOR__ENTERPRISE_BEANS);
		createEAttribute(deploymentDescriptorEClass, DEPLOYMENT_DESCRIPTOR__VERSION);
		createEAttribute(deploymentDescriptorEClass, DEPLOYMENT_DESCRIPTOR__DESCRIPTION);
		createEAttribute(deploymentDescriptorEClass, DEPLOYMENT_DESCRIPTOR__DISPLAY_NAME);

		entityBeanDescriptorEClass = createEClass(ENTITY_BEAN_DESCRIPTOR);
		createEAttribute(entityBeanDescriptorEClass, ENTITY_BEAN_DESCRIPTOR__PERSISTENCE_TYPE);

		sessionBeanDescriptorEClass = createEClass(SESSION_BEAN_DESCRIPTOR);
		createEAttribute(sessionBeanDescriptorEClass, SESSION_BEAN_DESCRIPTOR__TYPE);

		messageBeanDescriptorEClass = createEClass(MESSAGE_BEAN_DESCRIPTOR);

		// Create enums
		sessionBeanTypeEEnum = createEEnum(SESSION_BEAN_TYPE);
		persistenceTypeEEnum = createEEnum(PERSISTENCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityBeanDescriptorEClass.getESuperTypes().add(this.getBeanDescriptor());
		sessionBeanDescriptorEClass.getESuperTypes().add(this.getBeanDescriptor());
		messageBeanDescriptorEClass.getESuperTypes().add(this.getBeanDescriptor());

		// Initialize classes, features, and operations; add parameters
		initEClass(beanDescriptorEClass, BeanDescriptor.class, "BeanDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBeanDescriptor_EjbName(), ecorePackage.getEString(), "ejbName", null, 0, 1, BeanDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanDescriptor_EjbClass(), ecorePackage.getEString(), "ejbClass", null, 0, 1, BeanDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanDescriptor_LocalHomeInterface(), ecorePackage.getEString(), "localHomeInterface", null, 0, 1, BeanDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanDescriptor_LocalInterface(), ecorePackage.getEString(), "localInterface", null, 0, 1, BeanDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanDescriptor_RemoteHomeInterface(), ecorePackage.getEString(), "remoteHomeInterface", null, 0, 1, BeanDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanDescriptor_RemoteInterface(), ecorePackage.getEString(), "remoteInterface", null, 0, 1, BeanDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeanDescriptor_Enventry(), this.getEnvEntry(), null, "enventry", null, 0, -1, BeanDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanDescriptor_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, BeanDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envEntryEClass, EnvEntry.class, "EnvEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnvEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvEntry_Type(), ecorePackage.getEString(), "type", null, 0, 1, EnvEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnvEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentDescriptorEClass, DeploymentDescriptor.class, "DeploymentDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentDescriptor_EnterpriseBeans(), this.getBeanDescriptor(), null, "enterpriseBeans", null, 0, -1, DeploymentDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentDescriptor_Version(), ecorePackage.getEString(), "version", null, 0, 1, DeploymentDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentDescriptor_Description(), ecorePackage.getEString(), "description", null, 0, 1, DeploymentDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentDescriptor_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, DeploymentDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityBeanDescriptorEClass, EntityBeanDescriptor.class, "EntityBeanDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityBeanDescriptor_PersistenceType(), this.getPersistenceType(), "persistenceType", "Unspecified", 0, 1, EntityBeanDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sessionBeanDescriptorEClass, SessionBeanDescriptor.class, "SessionBeanDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSessionBeanDescriptor_Type(), this.getSessionBeanType(), "type", "Unspecified", 0, 1, SessionBeanDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageBeanDescriptorEClass, MessageBeanDescriptor.class, "MessageBeanDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(sessionBeanTypeEEnum, SessionBeanType.class, "SessionBeanType");
		addEEnumLiteral(sessionBeanTypeEEnum, SessionBeanType.STATELESS);
		addEEnumLiteral(sessionBeanTypeEEnum, SessionBeanType.STATEFUL);
		addEEnumLiteral(sessionBeanTypeEEnum, SessionBeanType.UNSPECIFIED);

		initEEnum(persistenceTypeEEnum, PersistenceType.class, "PersistenceType");
		addEEnumLiteral(persistenceTypeEEnum, PersistenceType.CONTAINER);
		addEEnumLiteral(persistenceTypeEEnum, PersistenceType.BEAN);
		addEEnumLiteral(persistenceTypeEEnum, PersistenceType.UNSPECIFIED);

		// Create resource
		createResource(eNS_URI);
	}

} //EjbXmlPackageImpl
