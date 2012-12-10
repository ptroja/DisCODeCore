/**
 */
package componentmodel.impl;

import componentmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentmodelFactoryImpl extends EFactoryImpl implements ComponentmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentmodelFactory init() {
		try {
			ComponentmodelFactory theComponentmodelFactory = (ComponentmodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://componentmodel/1.0"); 
			if (theComponentmodelFactory != null) {
				return theComponentmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComponentmodelPackage.PRIMITIVE_COMPONENT: return createPrimitiveComponent();
			case ComponentmodelPackage.COMPOSITE_COMPONENT: return createCompositeComponent();
			case ComponentmodelPackage.IN_PORT: return createInPort();
			case ComponentmodelPackage.OUT_PORT: return createOutPort();
			case ComponentmodelPackage.NUMERIC_PROPERTY: return createNumericProperty();
			case ComponentmodelPackage.ENUM_PROPERTY: return createEnumProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveComponent createPrimitiveComponent() {
		PrimitiveComponentImpl primitiveComponent = new PrimitiveComponentImpl();
		return primitiveComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeComponent createCompositeComponent() {
		CompositeComponentImpl compositeComponent = new CompositeComponentImpl();
		return compositeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort createInPort() {
		InPortImpl inPort = new InPortImpl();
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort createOutPort() {
		OutPortImpl outPort = new OutPortImpl();
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericProperty createNumericProperty() {
		NumericPropertyImpl numericProperty = new NumericPropertyImpl();
		return numericProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumProperty createEnumProperty() {
		EnumPropertyImpl enumProperty = new EnumPropertyImpl();
		return enumProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentmodelPackage getComponentmodelPackage() {
		return (ComponentmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentmodelPackage getPackage() {
		return ComponentmodelPackage.eINSTANCE;
	}

} //ComponentmodelFactoryImpl
