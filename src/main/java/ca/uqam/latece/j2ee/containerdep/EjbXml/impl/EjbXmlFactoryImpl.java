/**
 * © Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal
 */
package ca.uqam.latece.j2ee.containerdep.EjbXml.impl;

import ca.uqam.latece.j2ee.containerdep.EjbXml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EjbXmlFactoryImpl extends EFactoryImpl implements EjbXmlFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EjbXmlFactory init() {
		try {
			EjbXmlFactory theEjbXmlFactory = (EjbXmlFactory)EPackage.Registry.INSTANCE.getEFactory(EjbXmlPackage.eNS_URI);
			if (theEjbXmlFactory != null) {
				return theEjbXmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EjbXmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbXmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EjbXmlPackage.ENV_ENTRY: return createEnvEntry();
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR: return createDeploymentDescriptor();
			case EjbXmlPackage.ENTITY_BEAN_DESCRIPTOR: return createEntityBeanDescriptor();
			case EjbXmlPackage.SESSION_BEAN_DESCRIPTOR: return createSessionBeanDescriptor();
			case EjbXmlPackage.MESSAGE_BEAN_DESCRIPTOR: return createMessageBeanDescriptor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EjbXmlPackage.SESSION_BEAN_TYPE:
				return createSessionBeanTypeFromString(eDataType, initialValue);
			case EjbXmlPackage.PERSISTENCE_TYPE:
				return createPersistenceTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EjbXmlPackage.SESSION_BEAN_TYPE:
				return convertSessionBeanTypeToString(eDataType, instanceValue);
			case EjbXmlPackage.PERSISTENCE_TYPE:
				return convertPersistenceTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntry createEnvEntry() {
		EnvEntryImpl envEntry = new EnvEntryImpl();
		return envEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentDescriptor createDeploymentDescriptor() {
		DeploymentDescriptorImpl deploymentDescriptor = new DeploymentDescriptorImpl();
		return deploymentDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityBeanDescriptor createEntityBeanDescriptor() {
		EntityBeanDescriptorImpl entityBeanDescriptor = new EntityBeanDescriptorImpl();
		return entityBeanDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionBeanDescriptor createSessionBeanDescriptor() {
		SessionBeanDescriptorImpl sessionBeanDescriptor = new SessionBeanDescriptorImpl();
		return sessionBeanDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBeanDescriptor createMessageBeanDescriptor() {
		MessageBeanDescriptorImpl messageBeanDescriptor = new MessageBeanDescriptorImpl();
		return messageBeanDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionBeanType createSessionBeanTypeFromString(EDataType eDataType, String initialValue) {
		SessionBeanType result = SessionBeanType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSessionBeanTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceType createPersistenceTypeFromString(EDataType eDataType, String initialValue) {
		PersistenceType result = PersistenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbXmlPackage getEjbXmlPackage() {
		return (EjbXmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EjbXmlPackage getPackage() {
		return EjbXmlPackage.eINSTANCE;
	}

} //EjbXmlFactoryImpl
