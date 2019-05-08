/**
 * © Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal
 */
package ca.uqam.latece.j2ee.containerdep.EjbXml.impl;

import ca.uqam.latece.j2ee.containerdep.EjbXml.BeanDescriptor;
import ca.uqam.latece.j2ee.containerdep.EjbXml.EjbXmlPackage;
import ca.uqam.latece.j2ee.containerdep.EjbXml.EnvEntry;

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
 * An implementation of the model object '<em><b>Bean Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.BeanDescriptorImpl#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.BeanDescriptorImpl#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.BeanDescriptorImpl#getLocalHomeInterface <em>Local Home Interface</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.BeanDescriptorImpl#getLocalInterface <em>Local Interface</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.BeanDescriptorImpl#getRemoteHomeInterface <em>Remote Home Interface</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.BeanDescriptorImpl#getRemoteInterface <em>Remote Interface</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.BeanDescriptorImpl#getEnventry <em>Enventry</em>}</li>
 *   <li>{@link ca.uqam.latece.j2ee.containerdep.EjbXml.impl.BeanDescriptorImpl#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BeanDescriptorImpl extends MinimalEObjectImpl.Container implements BeanDescriptor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "© Anis Boubaker, LATECE Laboratory, University of Quebec at Montreal";

	/**
	 * The default value of the '{@link #getEjbName() <em>Ejb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbName()
	 * @generated
	 * @ordered
	 */
	protected static final String EJB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEjbName() <em>Ejb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbName()
	 * @generated
	 * @ordered
	 */
	protected String ejbName = EJB_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEjbClass() <em>Ejb Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbClass()
	 * @generated
	 * @ordered
	 */
	protected static final String EJB_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEjbClass() <em>Ejb Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbClass()
	 * @generated
	 * @ordered
	 */
	protected String ejbClass = EJB_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalHomeInterface() <em>Local Home Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalHomeInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_HOME_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalHomeInterface() <em>Local Home Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalHomeInterface()
	 * @generated
	 * @ordered
	 */
	protected String localHomeInterface = LOCAL_HOME_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalInterface() <em>Local Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalInterface() <em>Local Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalInterface()
	 * @generated
	 * @ordered
	 */
	protected String localInterface = LOCAL_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteHomeInterface() <em>Remote Home Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteHomeInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_HOME_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteHomeInterface() <em>Remote Home Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteHomeInterface()
	 * @generated
	 * @ordered
	 */
	protected String remoteHomeInterface = REMOTE_HOME_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteInterface() <em>Remote Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteInterface() <em>Remote Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteInterface()
	 * @generated
	 * @ordered
	 */
	protected String remoteInterface = REMOTE_INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnventry() <em>Enventry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnventry()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvEntry> enventry;

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
	protected BeanDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbXmlPackage.Literals.BEAN_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEjbName() {
		return ejbName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbName(String newEjbName) {
		String oldEjbName = ejbName;
		ejbName = newEjbName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbXmlPackage.BEAN_DESCRIPTOR__EJB_NAME, oldEjbName, ejbName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEjbClass() {
		return ejbClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbClass(String newEjbClass) {
		String oldEjbClass = ejbClass;
		ejbClass = newEjbClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbXmlPackage.BEAN_DESCRIPTOR__EJB_CLASS, oldEjbClass, ejbClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalHomeInterface() {
		return localHomeInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalHomeInterface(String newLocalHomeInterface) {
		String oldLocalHomeInterface = localHomeInterface;
		localHomeInterface = newLocalHomeInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbXmlPackage.BEAN_DESCRIPTOR__LOCAL_HOME_INTERFACE, oldLocalHomeInterface, localHomeInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalInterface() {
		return localInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalInterface(String newLocalInterface) {
		String oldLocalInterface = localInterface;
		localInterface = newLocalInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbXmlPackage.BEAN_DESCRIPTOR__LOCAL_INTERFACE, oldLocalInterface, localInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoteHomeInterface() {
		return remoteHomeInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteHomeInterface(String newRemoteHomeInterface) {
		String oldRemoteHomeInterface = remoteHomeInterface;
		remoteHomeInterface = newRemoteHomeInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbXmlPackage.BEAN_DESCRIPTOR__REMOTE_HOME_INTERFACE, oldRemoteHomeInterface, remoteHomeInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoteInterface() {
		return remoteInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteInterface(String newRemoteInterface) {
		String oldRemoteInterface = remoteInterface;
		remoteInterface = newRemoteInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbXmlPackage.BEAN_DESCRIPTOR__REMOTE_INTERFACE, oldRemoteInterface, remoteInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvEntry> getEnventry() {
		if (enventry == null) {
			enventry = new EObjectContainmentEList<EnvEntry>(EnvEntry.class, this, EjbXmlPackage.BEAN_DESCRIPTOR__ENVENTRY);
		}
		return enventry;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbXmlPackage.BEAN_DESCRIPTOR__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbXmlPackage.BEAN_DESCRIPTOR__ENVENTRY:
				return ((InternalEList<?>)getEnventry()).basicRemove(otherEnd, msgs);
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
			case EjbXmlPackage.BEAN_DESCRIPTOR__EJB_NAME:
				return getEjbName();
			case EjbXmlPackage.BEAN_DESCRIPTOR__EJB_CLASS:
				return getEjbClass();
			case EjbXmlPackage.BEAN_DESCRIPTOR__LOCAL_HOME_INTERFACE:
				return getLocalHomeInterface();
			case EjbXmlPackage.BEAN_DESCRIPTOR__LOCAL_INTERFACE:
				return getLocalInterface();
			case EjbXmlPackage.BEAN_DESCRIPTOR__REMOTE_HOME_INTERFACE:
				return getRemoteHomeInterface();
			case EjbXmlPackage.BEAN_DESCRIPTOR__REMOTE_INTERFACE:
				return getRemoteInterface();
			case EjbXmlPackage.BEAN_DESCRIPTOR__ENVENTRY:
				return getEnventry();
			case EjbXmlPackage.BEAN_DESCRIPTOR__DISPLAY_NAME:
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
			case EjbXmlPackage.BEAN_DESCRIPTOR__EJB_NAME:
				setEjbName((String)newValue);
				return;
			case EjbXmlPackage.BEAN_DESCRIPTOR__EJB_CLASS:
				setEjbClass((String)newValue);
				return;
			case EjbXmlPackage.BEAN_DESCRIPTOR__LOCAL_HOME_INTERFACE:
				setLocalHomeInterface((String)newValue);
				return;
			case EjbXmlPackage.BEAN_DESCRIPTOR__LOCAL_INTERFACE:
				setLocalInterface((String)newValue);
				return;
			case EjbXmlPackage.BEAN_DESCRIPTOR__REMOTE_HOME_INTERFACE:
				setRemoteHomeInterface((String)newValue);
				return;
			case EjbXmlPackage.BEAN_DESCRIPTOR__REMOTE_INTERFACE:
				setRemoteInterface((String)newValue);
				return;
			case EjbXmlPackage.BEAN_DESCRIPTOR__ENVENTRY:
				getEnventry().clear();
				getEnventry().addAll((Collection<? extends EnvEntry>)newValue);
				return;
			case EjbXmlPackage.BEAN_DESCRIPTOR__DISPLAY_NAME:
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
			case EjbXmlPackage.BEAN_DESCRIPTOR__EJB_NAME:
				setEjbName(EJB_NAME_EDEFAULT);
				return;
			case EjbXmlPackage.BEAN_DESCRIPTOR__EJB_CLASS:
				setEjbClass(EJB_CLASS_EDEFAULT);
				return;
			case EjbXmlPackage.BEAN_DESCRIPTOR__LOCAL_HOME_INTERFACE:
				setLocalHomeInterface(LOCAL_HOME_INTERFACE_EDEFAULT);
				return;
			case EjbXmlPackage.BEAN_DESCRIPTOR__LOCAL_INTERFACE:
				setLocalInterface(LOCAL_INTERFACE_EDEFAULT);
				return;
			case EjbXmlPackage.BEAN_DESCRIPTOR__REMOTE_HOME_INTERFACE:
				setRemoteHomeInterface(REMOTE_HOME_INTERFACE_EDEFAULT);
				return;
			case EjbXmlPackage.BEAN_DESCRIPTOR__REMOTE_INTERFACE:
				setRemoteInterface(REMOTE_INTERFACE_EDEFAULT);
				return;
			case EjbXmlPackage.BEAN_DESCRIPTOR__ENVENTRY:
				getEnventry().clear();
				return;
			case EjbXmlPackage.BEAN_DESCRIPTOR__DISPLAY_NAME:
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
			case EjbXmlPackage.BEAN_DESCRIPTOR__EJB_NAME:
				return EJB_NAME_EDEFAULT == null ? ejbName != null : !EJB_NAME_EDEFAULT.equals(ejbName);
			case EjbXmlPackage.BEAN_DESCRIPTOR__EJB_CLASS:
				return EJB_CLASS_EDEFAULT == null ? ejbClass != null : !EJB_CLASS_EDEFAULT.equals(ejbClass);
			case EjbXmlPackage.BEAN_DESCRIPTOR__LOCAL_HOME_INTERFACE:
				return LOCAL_HOME_INTERFACE_EDEFAULT == null ? localHomeInterface != null : !LOCAL_HOME_INTERFACE_EDEFAULT.equals(localHomeInterface);
			case EjbXmlPackage.BEAN_DESCRIPTOR__LOCAL_INTERFACE:
				return LOCAL_INTERFACE_EDEFAULT == null ? localInterface != null : !LOCAL_INTERFACE_EDEFAULT.equals(localInterface);
			case EjbXmlPackage.BEAN_DESCRIPTOR__REMOTE_HOME_INTERFACE:
				return REMOTE_HOME_INTERFACE_EDEFAULT == null ? remoteHomeInterface != null : !REMOTE_HOME_INTERFACE_EDEFAULT.equals(remoteHomeInterface);
			case EjbXmlPackage.BEAN_DESCRIPTOR__REMOTE_INTERFACE:
				return REMOTE_INTERFACE_EDEFAULT == null ? remoteInterface != null : !REMOTE_INTERFACE_EDEFAULT.equals(remoteInterface);
			case EjbXmlPackage.BEAN_DESCRIPTOR__ENVENTRY:
				return enventry != null && !enventry.isEmpty();
			case EjbXmlPackage.BEAN_DESCRIPTOR__DISPLAY_NAME:
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
		result.append(" (ejbName: ");
		result.append(ejbName);
		result.append(", ejbClass: ");
		result.append(ejbClass);
		result.append(", localHomeInterface: ");
		result.append(localHomeInterface);
		result.append(", localInterface: ");
		result.append(localInterface);
		result.append(", remoteHomeInterface: ");
		result.append(remoteHomeInterface);
		result.append(", remoteInterface: ");
		result.append(remoteInterface);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(')');
		return result.toString();
	}

} //BeanDescriptorImpl
