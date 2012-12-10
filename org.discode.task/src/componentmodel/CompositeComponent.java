/**
 */
package componentmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link componentmodel.CompositeComponent#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see componentmodel.ComponentmodelPackage#getCompositeComponent()
 * @model
 * @generated
 */
public interface CompositeComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link componentmodel.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see componentmodel.ComponentmodelPackage#getCompositeComponent_Components()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Component> getComponents();

} // CompositeComponent
