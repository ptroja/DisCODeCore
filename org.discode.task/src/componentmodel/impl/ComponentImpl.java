/**
 */
package componentmodel.impl;

import componentmodel.Component;
import componentmodel.ComponentmodelPackage;
import componentmodel.Port;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link componentmodel.impl.ComponentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link componentmodel.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link componentmodel.impl.ComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link componentmodel.impl.ComponentImpl#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link componentmodel.impl.ComponentImpl#getAuthorEmail <em>Author Email</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentImpl extends EObjectImpl implements Component {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getAuthorName() <em>Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorName()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorName() <em>Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorName()
	 * @generated
	 * @ordered
	 */
	protected String authorName = AUTHOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorEmail() <em>Author Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorEmail() <em>Author Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorEmail()
	 * @generated
	 * @ordered
	 */
	protected String authorEmail = AUTHOR_EMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentmodelPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, ComponentmodelPackage.COMPONENT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentmodelPackage.COMPONENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentmodelPackage.COMPONENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorName(String newAuthorName) {
		String oldAuthorName = authorName;
		authorName = newAuthorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentmodelPackage.COMPONENT__AUTHOR_NAME, oldAuthorName, authorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorEmail() {
		return authorEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorEmail(String newAuthorEmail) {
		String oldAuthorEmail = authorEmail;
		authorEmail = newAuthorEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentmodelPackage.COMPONENT__AUTHOR_EMAIL, oldAuthorEmail, authorEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentmodelPackage.COMPONENT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
			case ComponentmodelPackage.COMPONENT__PORTS:
				return getPorts();
			case ComponentmodelPackage.COMPONENT__NAME:
				return getName();
			case ComponentmodelPackage.COMPONENT__DESCRIPTION:
				return getDescription();
			case ComponentmodelPackage.COMPONENT__AUTHOR_NAME:
				return getAuthorName();
			case ComponentmodelPackage.COMPONENT__AUTHOR_EMAIL:
				return getAuthorEmail();
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
			case ComponentmodelPackage.COMPONENT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case ComponentmodelPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ComponentmodelPackage.COMPONENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ComponentmodelPackage.COMPONENT__AUTHOR_NAME:
				setAuthorName((String)newValue);
				return;
			case ComponentmodelPackage.COMPONENT__AUTHOR_EMAIL:
				setAuthorEmail((String)newValue);
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
			case ComponentmodelPackage.COMPONENT__PORTS:
				getPorts().clear();
				return;
			case ComponentmodelPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentmodelPackage.COMPONENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ComponentmodelPackage.COMPONENT__AUTHOR_NAME:
				setAuthorName(AUTHOR_NAME_EDEFAULT);
				return;
			case ComponentmodelPackage.COMPONENT__AUTHOR_EMAIL:
				setAuthorEmail(AUTHOR_EMAIL_EDEFAULT);
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
			case ComponentmodelPackage.COMPONENT__PORTS:
				return ports != null && !ports.isEmpty();
			case ComponentmodelPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentmodelPackage.COMPONENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ComponentmodelPackage.COMPONENT__AUTHOR_NAME:
				return AUTHOR_NAME_EDEFAULT == null ? authorName != null : !AUTHOR_NAME_EDEFAULT.equals(authorName);
			case ComponentmodelPackage.COMPONENT__AUTHOR_EMAIL:
				return AUTHOR_EMAIL_EDEFAULT == null ? authorEmail != null : !AUTHOR_EMAIL_EDEFAULT.equals(authorEmail);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", authorName: ");
		result.append(authorName);
		result.append(", authorEmail: ");
		result.append(authorEmail);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
