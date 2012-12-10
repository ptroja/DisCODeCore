/**
 */
package componentmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link componentmodel.NumericProperty#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link componentmodel.NumericProperty#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link componentmodel.NumericProperty#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see componentmodel.ComponentmodelPackage#getNumericProperty()
 * @model
 * @generated
 */
public interface NumericProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(float)
	 * @see componentmodel.ComponentmodelPackage#getNumericProperty_MinValue()
	 * @model required="true"
	 * @generated
	 */
	float getMinValue();

	/**
	 * Sets the value of the '{@link componentmodel.NumericProperty#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(float value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(float)
	 * @see componentmodel.ComponentmodelPackage#getNumericProperty_MaxValue()
	 * @model required="true"
	 * @generated
	 */
	float getMaxValue();

	/**
	 * Sets the value of the '{@link componentmodel.NumericProperty#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(float value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(float)
	 * @see componentmodel.ComponentmodelPackage#getNumericProperty_DefaultValue()
	 * @model required="true"
	 * @generated
	 */
	float getDefaultValue();

	/**
	 * Sets the value of the '{@link componentmodel.NumericProperty#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(float value);

} // NumericProperty
