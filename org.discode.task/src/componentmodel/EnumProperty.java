/**
 */
package componentmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link componentmodel.EnumProperty#getLiteralValue <em>Literal Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see componentmodel.ComponentmodelPackage#getEnumProperty()
 * @model
 * @generated
 */
public interface EnumProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Literal Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Value</em>' attribute list.
	 * @see componentmodel.ComponentmodelPackage#getEnumProperty_LiteralValue()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getLiteralValue();

} // EnumProperty
