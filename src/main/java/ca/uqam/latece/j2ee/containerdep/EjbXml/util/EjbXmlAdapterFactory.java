/**
 * © Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal
 */
package ca.uqam.latece.j2ee.containerdep.EjbXml.util;

import ca.uqam.latece.j2ee.containerdep.EjbXml.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage
 * @generated
 */
public class EjbXmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EjbXmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbXmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EjbXmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EjbXmlSwitch<Adapter> modelSwitch =
		new EjbXmlSwitch<Adapter>() {
			@Override
			public Adapter caseBeanDescriptor(BeanDescriptor object) {
				return createBeanDescriptorAdapter();
			}
			@Override
			public Adapter caseEnvEntry(EnvEntry object) {
				return createEnvEntryAdapter();
			}
			@Override
			public Adapter caseDeploymentDescriptor(DeploymentDescriptor object) {
				return createDeploymentDescriptorAdapter();
			}
			@Override
			public Adapter caseEntityBeanDescriptor(EntityBeanDescriptor object) {
				return createEntityBeanDescriptorAdapter();
			}
			@Override
			public Adapter caseSessionBeanDescriptor(SessionBeanDescriptor object) {
				return createSessionBeanDescriptorAdapter();
			}
			@Override
			public Adapter caseMessageBeanDescriptor(MessageBeanDescriptor object) {
				return createMessageBeanDescriptorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor <em>Bean Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor
	 * @generated
	 */
	public Adapter createBeanDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry
	 * @generated
	 */
	public Adapter createEnvEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor <em>Deployment Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor
	 * @generated
	 */
	public Adapter createDeploymentDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.EntityBeanDescriptor <em>Entity Bean Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.EntityBeanDescriptor
	 * @generated
	 */
	public Adapter createEntityBeanDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanDescriptor <em>Session Bean Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.SessionBeanDescriptor
	 * @generated
	 */
	public Adapter createSessionBeanDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.uqam.latece.j2ee.containerdep.EjbXml.MessageBeanDescriptor <em>Message Bean Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.uqam.latece.j2ee.containerdep.EjbXml.MessageBeanDescriptor
	 * @generated
	 */
	public Adapter createMessageBeanDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EjbXmlAdapterFactory
