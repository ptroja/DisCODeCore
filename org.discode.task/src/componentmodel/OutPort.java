/**
 */
package componentmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link componentmodel.OutPort#getPropagatesFrom <em>Propagates From</em>}</li>
 *   <li>{@link componentmodel.OutPort#getSink <em>Sink</em>}</li>
 *   <li>{@link componentmodel.OutPort#getPropagatesTo <em>Propagates To</em>}</li>
 * </ul>
 * </p>
 *
 * @see componentmodel.ComponentmodelPackage#getOutPort()
 * @model
 * @generated
 */
public interface OutPort extends Port {
	/**
	 * Returns the value of the '<em><b>Propagates From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link componentmodel.OutPort#getPropagatesTo <em>Propagates To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagates From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagates From</em>' reference.
	 * @see #setPropagatesFrom(OutPort)
	 * @see componentmodel.ComponentmodelPackage#getOutPort_PropagatesFrom()
	 * @see componentmodel.OutPort#getPropagatesTo
	 * @model opposite="propagatesTo"
	 * @generated
	 */
	OutPort getPropagatesFrom();

	/**
	 * Sets the value of the '{@link componentmodel.OutPort#getPropagatesFrom <em>Propagates From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagates From</em>' reference.
	 * @see #getPropagatesFrom()
	 * @generated
	 */
	void setPropagatesFrom(OutPort value);

	/**
	 * Returns the value of the '<em><b>Sink</b></em>' reference list.
	 * The list contents are of type {@link componentmodel.InPort}.
	 * It is bidirectional and its opposite is '{@link componentmodel.InPort#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sink</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' reference list.
	 * @see componentmodel.ComponentmodelPackage#getOutPort_Sink()
	 * @see componentmodel.InPort#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<InPort> getSink();

	/**
	 * Returns the value of the '<em><b>Propagates To</b></em>' reference list.
	 * The list contents are of type {@link componentmodel.OutPort}.
	 * It is bidirectional and its opposite is '{@link componentmodel.OutPort#getPropagatesFrom <em>Propagates From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagates To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagates To</em>' reference list.
	 * @see componentmodel.ComponentmodelPackage#getOutPort_PropagatesTo()
	 * @see componentmodel.OutPort#getPropagatesFrom
	 * @model opposite="propagatesFrom"
	 * @generated
	 */
	EList<OutPort> getPropagatesTo();

} // OutPort
