/**
 * © Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal
 */
package ca.uqam.latece.j2ee.containerdep.EjbXml.impl;

import ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor;
import ca.uqam.latece.j2ee.containerdep.EjbXml.DeploymentDescriptor;
import ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.DeploymentDescriptorImpl#getEnterpriseBeans <em>Enterprise Beans</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.DeploymentDescriptorImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.DeploymentDescriptorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.DeploymentDescriptorImpl#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentDescriptorImpl extends MinimalEObjectImpl.Container implements DeploymentDescriptor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal";

	/**
	 * The cached value of the '{@link #getEnterpriseBeans() <em>Enterprise Beans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterpriseBeans()
	 * @generated
	 * @ordered
	 */
	protected EList<BeanDescriptor> enterpriseBeans;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbXmlPackage.Literals.DEPLOYMENT_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeanDescriptor> getEnterpriseBeans() {
		if (enterpriseBeans == null) {
			enterpriseBeans = new EObjectContainmentEList<BeanDescriptor>(BeanDescriptor.class, this, EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__ENTERPRISE_BEANS);
		}
		return enterpriseBeans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__ENTERPRISE_BEANS:
				return ((InternalEList<?>)getEnterpriseBeans()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__ENTERPRISE_BEANS:
				return getEnterpriseBeans();
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__VERSION:
				return getVersion();
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__DESCRIPTION:
				return getDescription();
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__DISPLAY_NAME:
				return getDisplayName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__ENTERPRISE_BEANS:
				getEnterpriseBeans().clear();
				getEnterpriseBeans().addAll((Collection<? extends BeanDescriptor>)newValue);
				return;
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__VERSION:
				setVersion((String)newValue);
				return;
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__ENTERPRISE_BEANS:
				getEnterpriseBeans().clear();
				return;
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__ENTERPRISE_BEANS:
				return enterpriseBeans != null && !enterpriseBeans.isEmpty();
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EjbXmlPackage.DEPLOYMENT_DESCRIPTOR__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (version: ");
		result.append(version);
		result.append(", description: ");
		result.append(description);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(')');
		return result.toString();
	}

} //DeploymentDescriptorImpl
