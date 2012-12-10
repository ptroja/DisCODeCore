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
 * An implementation of the model object '<em><b>Out Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link componentmodel.impl.OutPortImpl#getPropagatesFrom <em>Propagates From</em>}</li>
 *   <li>{@link componentmodel.impl.OutPortImpl#getSink <em>Sink</em>}</li>
 *   <li>{@link componentmodel.impl.OutPortImpl#getPropagatesTo <em>Propagates To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutPortImpl extends PortImpl implements OutPort {
	/**
	 * The cached value of the '{@link #getPropagatesFrom() <em>Propagates From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagatesFrom()
	 * @generated
	 * @ordered
	 */
	protected OutPort propagatesFrom;

	/**
	 * The cached value of the '{@link #getSink() <em>Sink</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSink()
	 * @generated
	 * @ordered
	 */
	protected EList<InPort> sink;

	/**
	 * The cached value of the '{@link #getPropagatesTo() <em>Propagates To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagatesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<OutPort> propagatesTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentmodelPackage.Literals.OUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort getPropagatesFrom() {
		if (propagatesFrom != null && propagatesFrom.eIsProxy()) {
			InternalEObject oldPropagatesFrom = (InternalEObject)propagatesFrom;
			propagatesFrom = (OutPort)eResolveProxy(oldPropagatesFrom);
			if (propagatesFrom != oldPropagatesFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentmodelPackage.OUT_PORT__PROPAGATES_FROM, oldPropagatesFrom, propagatesFrom));
			}
		}
		return propagatesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort basicGetPropagatesFrom() {
		return propagatesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropagatesFrom(OutPort newPropagatesFrom, NotificationChain msgs) {
		OutPort oldPropagatesFrom = propagatesFrom;
		propagatesFrom = newPropagatesFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentmodelPackage.OUT_PORT__PROPAGATES_FROM, oldPropagatesFrom, newPropagatesFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagatesFrom(OutPort newPropagatesFrom) {
		if (newPropagatesFrom != propagatesFrom) {
			NotificationChain msgs = null;
			if (propagatesFrom != null)
				msgs = ((InternalEObject)propagatesFrom).eInverseRemove(this, ComponentmodelPackage.OUT_PORT__PROPAGATES_TO, OutPort.class, msgs);
			if (newPropagatesFrom != null)
				msgs = ((InternalEObject)newPropagatesFrom).eInverseAdd(this, ComponentmodelPackage.OUT_PORT__PROPAGATES_TO, OutPort.class, msgs);
			msgs = basicSetPropagatesFrom(newPropagatesFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentmodelPackage.OUT_PORT__PROPAGATES_FROM, newPropagatesFrom, newPropagatesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InPort> getSink() {
		if (sink == null) {
			sink = new EObjectWithInverseResolvingEList<InPort>(InPort.class, this, ComponentmodelPackage.OUT_PORT__SINK, ComponentmodelPackage.IN_PORT__SOURCE);
		}
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutPort> getPropagatesTo() {
		if (propagatesTo == null) {
			propagatesTo = new EObjectWithInverseResolvingEList<OutPort>(OutPort.class, this, ComponentmodelPackage.OUT_PORT__PROPAGATES_TO, ComponentmodelPackage.OUT_PORT__PROPAGATES_FROM);
		}
		return propagatesTo;
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
			case ComponentmodelPackage.OUT_PORT__PROPAGATES_FROM:
				if (propagatesFrom != null)
					msgs = ((InternalEObject)propagatesFrom).eInverseRemove(this, ComponentmodelPackage.OUT_PORT__PROPAGATES_TO, OutPort.class, msgs);
				return basicSetPropagatesFrom((OutPort)otherEnd, msgs);
			case ComponentmodelPackage.OUT_PORT__SINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSink()).basicAdd(otherEnd, msgs);
			case ComponentmodelPackage.OUT_PORT__PROPAGATES_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropagatesTo()).basicAdd(otherEnd, msgs);
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
			case ComponentmodelPackage.OUT_PORT__PROPAGATES_FROM:
				return basicSetPropagatesFrom(null, msgs);
			case ComponentmodelPackage.OUT_PORT__SINK:
				return ((InternalEList<?>)getSink()).basicRemove(otherEnd, msgs);
			case ComponentmodelPackage.OUT_PORT__PROPAGATES_TO:
				return ((InternalEList<?>)getPropagatesTo()).basicRemove(otherEnd, msgs);
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
			case ComponentmodelPackage.OUT_PORT__PROPAGATES_FROM:
				if (resolve) return getPropagatesFrom();
				return basicGetPropagatesFrom();
			case ComponentmodelPackage.OUT_PORT__SINK:
				return getSink();
			case ComponentmodelPackage.OUT_PORT__PROPAGATES_TO:
				return getPropagatesTo();
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
			case ComponentmodelPackage.OUT_PORT__PROPAGATES_FROM:
				setPropagatesFrom((OutPort)newValue);
				return;
			case ComponentmodelPackage.OUT_PORT__SINK:
				getSink().clear();
				getSink().addAll((Collection<? extends InPort>)newValue);
				return;
			case ComponentmodelPackage.OUT_PORT__PROPAGATES_TO:
				getPropagatesTo().clear();
				getPropagatesTo().addAll((Collection<? extends OutPort>)newValue);
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
			case ComponentmodelPackage.OUT_PORT__PROPAGATES_FROM:
				setPropagatesFrom((OutPort)null);
				return;
			case ComponentmodelPackage.OUT_PORT__SINK:
				getSink().clear();
				return;
			case ComponentmodelPackage.OUT_PORT__PROPAGATES_TO:
				getPropagatesTo().clear();
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
			case ComponentmodelPackage.OUT_PORT__PROPAGATES_FROM:
				return propagatesFrom != null;
			case ComponentmodelPackage.OUT_PORT__SINK:
				return sink != null && !sink.isEmpty();
			case ComponentmodelPackage.OUT_PORT__PROPAGATES_TO:
				return propagatesTo != null && !propagatesTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutPortImpl
