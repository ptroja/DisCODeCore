/**
 */
package componentmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link componentmodel.PrimitiveComponent#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see componentmodel.ComponentmodelPackage#getPrimitiveComponent()
 * @model
 * @generated
 */
public interface PrimitiveComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link componentmodel.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see componentmodel.ComponentmodelPackage#getPrimitiveComponent_Properties()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Property> getProperties();

} // PrimitiveComponent
