/**
 */
package componentmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link componentmodel.Component#getPorts <em>Ports</em>}</li>
 *   <li>{@link componentmodel.Component#getName <em>Name</em>}</li>
 *   <li>{@link componentmodel.Component#getDescription <em>Description</em>}</li>
 *   <li>{@link componentmodel.Component#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link componentmodel.Component#getAuthorEmail <em>Author Email</em>}</li>
 * </ul>
 * </p>
 *
 * @see componentmodel.ComponentmodelPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link componentmodel.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see componentmodel.ComponentmodelPackage#getComponent_Ports()
	 * @model containment="true" keys="name" required="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see componentmodel.ComponentmodelPackage#getComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentmodel.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see componentmodel.ComponentmodelPackage#getComponent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link componentmodel.Component#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Name</em>' attribute.
	 * @see #setAuthorName(String)
	 * @see componentmodel.ComponentmodelPackage#getComponent_AuthorName()
	 * @model
	 * @generated
	 */
	String getAuthorName();

	/**
	 * Sets the value of the '{@link componentmodel.Component#getAuthorName <em>Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Name</em>' attribute.
	 * @see #getAuthorName()
	 * @generated
	 */
	void setAuthorName(String value);

	/**
	 * Returns the value of the '<em><b>Author Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Email</em>' attribute.
	 * @see #setAuthorEmail(String)
	 * @see componentmodel.ComponentmodelPackage#getComponent_AuthorEmail()
	 * @model
	 * @generated
	 */
	String getAuthorEmail();

	/**
	 * Sets the value of the '{@link componentmodel.Component#getAuthorEmail <em>Author Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Email</em>' attribute.
	 * @see #getAuthorEmail()
	 * @generated
	 */
	void setAuthorEmail(String value);

} // Component
