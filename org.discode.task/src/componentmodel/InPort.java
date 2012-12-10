/**
 */
package componentmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link componentmodel.InPort#getDelegatesTo <em>Delegates To</em>}</li>
 *   <li>{@link componentmodel.InPort#getSource <em>Source</em>}</li>
 *   <li>{@link componentmodel.InPort#getDelegatesFrom <em>Delegates From</em>}</li>
 * </ul>
 * </p>
 *
 * @see componentmodel.ComponentmodelPackage#getInPort()
 * @model
 * @generated
 */
public interface InPort extends Port {
	/**
	 * Returns the value of the '<em><b>Delegates To</b></em>' reference list.
	 * The list contents are of type {@link componentmodel.InPort}.
	 * It is bidirectional and its opposite is '{@link componentmodel.InPort#getDelegatesFrom <em>Delegates From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegates To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegates To</em>' reference list.
	 * @see componentmodel.ComponentmodelPackage#getInPort_DelegatesTo()
	 * @see componentmodel.InPort#getDelegatesFrom
	 * @model opposite="delegatesFrom"
	 * @generated
	 */
	EList<InPort> getDelegatesTo();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link componentmodel.OutPort#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OutPort)
	 * @see componentmodel.ComponentmodelPackage#getInPort_Source()
	 * @see componentmodel.OutPort#getSink
	 * @model opposite="sink"
	 * @generated
	 */
	OutPort getSource();

	/**
	 * Sets the value of the '{@link componentmodel.InPort#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OutPort value);

	/**
	 * Returns the value of the '<em><b>Delegates From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link componentmodel.InPort#getDelegatesTo <em>Delegates To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegates From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegates From</em>' reference.
	 * @see #setDelegatesFrom(InPort)
	 * @see componentmodel.ComponentmodelPackage#getInPort_DelegatesFrom()
	 * @see componentmodel.InPort#getDelegatesTo
	 * @model opposite="delegatesTo"
	 * @generated
	 */
	InPort getDelegatesFrom();

	/**
	 * Sets the value of the '{@link componentmodel.InPort#getDelegatesFrom <em>Delegates From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegates From</em>' reference.
	 * @see #getDelegatesFrom()
	 * @generated
	 */
	void setDelegatesFrom(InPort value);

} // InPort
