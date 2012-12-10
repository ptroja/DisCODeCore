/**
 */
package componentmodel.impl;

import componentmodel.ComponentmodelPackage;
import componentmodel.InPort;
import componentmodel.OutPort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link componentmodel.impl.InPortImpl#getDelegatesTo <em>Delegates To</em>}</li>
 *   <li>{@link componentmodel.impl.InPortImpl#getSource <em>Source</em>}</li>
 *   <li>{@link componentmodel.impl.InPortImpl#getDelegatesFrom <em>Delegates From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InPortImpl extends PortImpl implements InPort {
	/**
	 * The cached value of the '{@link #getDelegatesTo() <em>Delegates To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<InPort> delegatesTo;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OutPort source;

	/**
	 * The cached value of the '{@link #getDelegatesFrom() <em>Delegates From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatesFrom()
	 * @generated
	 * @ordered
	 */
	protected InPort delegatesFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentmodelPackage.Literals.IN_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InPort> getDelegatesTo() {
		if (delegatesTo == null) {
			delegatesTo = new EObjectWithInverseResolvingEList<InPort>(InPort.class, this, ComponentmodelPackage.IN_PORT__DELEGATES_TO, ComponentmodelPackage.IN_PORT__DELEGATES_FROM);
		}
		return delegatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (OutPort)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentmodelPackage.IN_PORT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(OutPort newSource, NotificationChain msgs) {
		OutPort oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentmodelPackage.IN_PORT__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OutPort newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, ComponentmodelPackage.OUT_PORT__SINK, OutPort.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ComponentmodelPackage.OUT_PORT__SINK, OutPort.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentmodelPackage.IN_PORT__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort getDelegatesFrom() {
		if (delegatesFrom != null && delegatesFrom.eIsProxy()) {
			InternalEObject oldDelegatesFrom = (InternalEObject)delegatesFrom;
			delegatesFrom = (InPort)eResolveProxy(oldDelegatesFrom);
			if (delegatesFrom != oldDelegatesFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentmodelPackage.IN_PORT__DELEGATES_FROM, oldDelegatesFrom, delegatesFrom));
			}
		}
		return delegatesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort basicGetDelegatesFrom() {
		return delegatesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegatesFrom(InPort newDelegatesFrom, NotificationChain msgs) {
		InPort oldDelegatesFrom = delegatesFrom;
		delegatesFrom = newDelegatesFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentmodelPackage.IN_PORT__DELEGATES_FROM, oldDelegatesFrom, newDelegatesFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegatesFrom(InPort newDelegatesFrom) {
		if (newDelegatesFrom != delegatesFrom) {
			NotificationChain msgs = null;
			if (delegatesFrom != null)
				msgs = ((InternalEObject)delegatesFrom).eInverseRemove(this, ComponentmodelPackage.IN_PORT__DELEGATES_TO, InPort.class, msgs);
			if (newDelegatesFrom != null)
				msgs = ((InternalEObject)newDelegatesFrom).eInverseAdd(this, ComponentmodelPackage.IN_PORT__DELEGATES_TO, InPort.class, msgs);
			msgs = basicSetDelegatesFrom(newDelegatesFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentmodelPackage.IN_PORT__DELEGATES_FROM, newDelegatesFrom, newDelegatesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentmodelPackage.IN_PORT__DELEGATES_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegatesTo()).basicAdd(otherEnd, msgs);
			case ComponentmodelPackage.IN_PORT__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, ComponentmodelPackage.OUT_PORT__SINK, OutPort.class, msgs);
				return basicSetSource((OutPort)otherEnd, msgs);
			case ComponentmodelPackage.IN_PORT__DELEGATES_FROM:
				if (delegatesFrom != null)
					msgs = ((InternalEObject)delegatesFrom).eInverseRemove(this, ComponentmodelPackage.IN_PORT__DELEGATES_TO, InPort.class, msgs);
				return basicSetDelegatesFrom((InPort)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentmodelPackage.IN_PORT__DELEGATES_TO:
				return ((InternalEList<?>)getDelegatesTo()).basicRemove(otherEnd, msgs);
			case ComponentmodelPackage.IN_PORT__SOURCE:
				return basicSetSource(null, msgs);
			case ComponentmodelPackage.IN_PORT__DELEGATES_FROM:
				return basicSetDelegatesFrom(null, msgs);
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
			case ComponentmodelPackage.IN_PORT__DELEGATES_TO:
				return getDelegatesTo();
			case ComponentmodelPackage.IN_PORT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ComponentmodelPackage.IN_PORT__DELEGATES_FROM:
				if (resolve) return getDelegatesFrom();
				return basicGetDelegatesFrom();
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
			case ComponentmodelPackage.IN_PORT__DELEGATES_TO:
				getDelegatesTo().clear();
				getDelegatesTo().addAll((Collection<? extends InPort>)newValue);
				return;
			case ComponentmodelPackage.IN_PORT__SOURCE:
				setSource((OutPort)newValue);
				return;
			case ComponentmodelPackage.IN_PORT__DELEGATES_FROM:
				setDelegatesFrom((InPort)newValue);
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
			case ComponentmodelPackage.IN_PORT__DELEGATES_TO:
				getDelegatesTo().clear();
				return;
			case ComponentmodelPackage.IN_PORT__SOURCE:
				setSource((OutPort)null);
				return;
			case ComponentmodelPackage.IN_PORT__DELEGATES_FROM:
				setDelegatesFrom((InPort)null);
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
			case ComponentmodelPackage.IN_PORT__DELEGATES_TO:
				return delegatesTo != null && !delegatesTo.isEmpty();
			case ComponentmodelPackage.IN_PORT__SOURCE:
				return source != null;
			case ComponentmodelPackage.IN_PORT__DELEGATES_FROM:
				return delegatesFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //InPortImpl
