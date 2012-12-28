/**
 */
package componentmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see componentmodel.ComponentmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://componentmodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentmodelPackage eINSTANCE = componentmodel.impl.ComponentmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link componentmodel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentmodel.impl.ComponentImpl
	 * @see componentmodel.impl.ComponentmodelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AUTHOR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Author Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AUTHOR_EMAIL = 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link componentmodel.impl.PrimitiveComponentImpl <em>Primitive Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentmodel.impl.PrimitiveComponentImpl
	 * @see componentmodel.impl.ComponentmodelPackageImpl#getPrimitiveComponent()
	 * @generated
	 */
	int PRIMITIVE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT__PORTS = COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT__AUTHOR_NAME = COMPONENT__AUTHOR_NAME;

	/**
	 * The feature id for the '<em><b>Author Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT__AUTHOR_EMAIL = COMPONENT__AUTHOR_EMAIL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT__PROPERTIES = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link componentmodel.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentmodel.impl.CompositeComponentImpl
	 * @see componentmodel.impl.ComponentmodelPackageImpl#getCompositeComponent()
	 * @generated
	 */
	int COMPOSITE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__PORTS = COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__AUTHOR_NAME = COMPONENT__AUTHOR_NAME;

	/**
	 * The feature id for the '<em><b>Author Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__AUTHOR_EMAIL = COMPONENT__AUTHOR_EMAIL;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__COMPONENTS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link componentmodel.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentmodel.impl.PortImpl
	 * @see componentmodel.impl.ComponentmodelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Type Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link componentmodel.impl.InPortImpl <em>In Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentmodel.impl.InPortImpl
	 * @see componentmodel.impl.ComponentmodelPackageImpl#getInPort()
	 * @generated
	 */
	int IN_PORT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__TYPE = PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Type Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__TYPE_PACKAGE = PORT__TYPE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__DESCRIPTION = PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Delegates To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__DELEGATES_TO = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__SOURCE = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delegates From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__DELEGATES_FROM = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link componentmodel.impl.OutPortImpl <em>Out Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentmodel.impl.OutPortImpl
	 * @see componentmodel.impl.ComponentmodelPackageImpl#getOutPort()
	 * @generated
	 */
	int OUT_PORT = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__TYPE = PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Type Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__TYPE_PACKAGE = PORT__TYPE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__DESCRIPTION = PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Propagates From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__PROPAGATES_FROM = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__SINK = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Propagates To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__PROPAGATES_TO = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link componentmodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentmodel.impl.PropertyImpl
	 * @see componentmodel.impl.ComponentmodelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link componentmodel.impl.NumericPropertyImpl <em>Numeric Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentmodel.impl.NumericPropertyImpl
	 * @see componentmodel.impl.ComponentmodelPackageImpl#getNumericProperty()
	 * @generated
	 */
	int NUMERIC_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_PROPERTY__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_PROPERTY__MIN_VALUE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_PROPERTY__MAX_VALUE = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_PROPERTY__DEFAULT_VALUE = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Numeric Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link componentmodel.impl.EnumPropertyImpl <em>Enum Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentmodel.impl.EnumPropertyImpl
	 * @see componentmodel.impl.ComponentmodelPackageImpl#getEnumProperty()
	 * @generated
	 */
	int ENUM_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PROPERTY__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PROPERTY__LITERAL_VALUE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link componentmodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see componentmodel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link componentmodel.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see componentmodel.Component#getPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Ports();

	/**
	 * Returns the meta object for the attribute '{@link componentmodel.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentmodel.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link componentmodel.Component#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see componentmodel.Component#getDescription()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Description();

	/**
	 * Returns the meta object for the attribute '{@link componentmodel.Component#getAuthorName <em>Author Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Name</em>'.
	 * @see componentmodel.Component#getAuthorName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_AuthorName();

	/**
	 * Returns the meta object for the attribute '{@link componentmodel.Component#getAuthorEmail <em>Author Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Email</em>'.
	 * @see componentmodel.Component#getAuthorEmail()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_AuthorEmail();

	/**
	 * Returns the meta object for class '{@link componentmodel.PrimitiveComponent <em>Primitive Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Component</em>'.
	 * @see componentmodel.PrimitiveComponent
	 * @generated
	 */
	EClass getPrimitiveComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link componentmodel.PrimitiveComponent#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see componentmodel.PrimitiveComponent#getProperties()
	 * @see #getPrimitiveComponent()
	 * @generated
	 */
	EReference getPrimitiveComponent_Properties();

	/**
	 * Returns the meta object for class '{@link componentmodel.CompositeComponent <em>Composite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Component</em>'.
	 * @see componentmodel.CompositeComponent
	 * @generated
	 */
	EClass getCompositeComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link componentmodel.CompositeComponent#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see componentmodel.CompositeComponent#getComponents()
	 * @see #getCompositeComponent()
	 * @generated
	 */
	EReference getCompositeComponent_Components();

	/**
	 * Returns the meta object for class '{@link componentmodel.InPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Port</em>'.
	 * @see componentmodel.InPort
	 * @generated
	 */
	EClass getInPort();

	/**
	 * Returns the meta object for the reference list '{@link componentmodel.InPort#getDelegatesTo <em>Delegates To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegates To</em>'.
	 * @see componentmodel.InPort#getDelegatesTo()
	 * @see #getInPort()
	 * @generated
	 */
	EReference getInPort_DelegatesTo();

	/**
	 * Returns the meta object for the reference '{@link componentmodel.InPort#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see componentmodel.InPort#getSource()
	 * @see #getInPort()
	 * @generated
	 */
	EReference getInPort_Source();

	/**
	 * Returns the meta object for the reference '{@link componentmodel.InPort#getDelegatesFrom <em>Delegates From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegates From</em>'.
	 * @see componentmodel.InPort#getDelegatesFrom()
	 * @see #getInPort()
	 * @generated
	 */
	EReference getInPort_DelegatesFrom();

	/**
	 * Returns the meta object for class '{@link componentmodel.OutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Port</em>'.
	 * @see componentmodel.OutPort
	 * @generated
	 */
	EClass getOutPort();

	/**
	 * Returns the meta object for the reference '{@link componentmodel.OutPort#getPropagatesFrom <em>Propagates From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Propagates From</em>'.
	 * @see componentmodel.OutPort#getPropagatesFrom()
	 * @see #getOutPort()
	 * @generated
	 */
	EReference getOutPort_PropagatesFrom();

	/**
	 * Returns the meta object for the reference list '{@link componentmodel.OutPort#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sink</em>'.
	 * @see componentmodel.OutPort#getSink()
	 * @see #getOutPort()
	 * @generated
	 */
	EReference getOutPort_Sink();

	/**
	 * Returns the meta object for the reference list '{@link componentmodel.OutPort#getPropagatesTo <em>Propagates To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Propagates To</em>'.
	 * @see componentmodel.OutPort#getPropagatesTo()
	 * @see #getOutPort()
	 * @generated
	 */
	EReference getOutPort_PropagatesTo();

	/**
	 * Returns the meta object for class '{@link componentmodel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see componentmodel.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link componentmodel.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see componentmodel.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for the attribute '{@link componentmodel.Port#getTypePackage <em>Type Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Package</em>'.
	 * @see componentmodel.Port#getTypePackage()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_TypePackage();

	/**
	 * Returns the meta object for the attribute '{@link componentmodel.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentmodel.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link componentmodel.Port#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see componentmodel.Port#getDescription()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Description();

	/**
	 * Returns the meta object for class '{@link componentmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see componentmodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link componentmodel.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentmodel.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link componentmodel.Property#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see componentmodel.Property#getDescription()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Description();

	/**
	 * Returns the meta object for class '{@link componentmodel.NumericProperty <em>Numeric Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Property</em>'.
	 * @see componentmodel.NumericProperty
	 * @generated
	 */
	EClass getNumericProperty();

	/**
	 * Returns the meta object for the attribute '{@link componentmodel.NumericProperty#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see componentmodel.NumericProperty#getMinValue()
	 * @see #getNumericProperty()
	 * @generated
	 */
	EAttribute getNumericProperty_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link componentmodel.NumericProperty#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see componentmodel.NumericProperty#getMaxValue()
	 * @see #getNumericProperty()
	 * @generated
	 */
	EAttribute getNumericProperty_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link componentmodel.NumericProperty#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see componentmodel.NumericProperty#getDefaultValue()
	 * @see #getNumericProperty()
	 * @generated
	 */
	EAttribute getNumericProperty_DefaultValue();

	/**
	 * Returns the meta object for class '{@link componentmodel.EnumProperty <em>Enum Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Property</em>'.
	 * @see componentmodel.EnumProperty
	 * @generated
	 */
	EClass getEnumProperty();

	/**
	 * Returns the meta object for the attribute list '{@link componentmodel.EnumProperty#getLiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Literal Value</em>'.
	 * @see componentmodel.EnumProperty#getLiteralValue()
	 * @see #getEnumProperty()
	 * @generated
	 */
	EAttribute getEnumProperty_LiteralValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentmodelFactory getComponentmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link componentmodel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentmodel.impl.ComponentImpl
		 * @see componentmodel.impl.ComponentmodelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__DESCRIPTION = eINSTANCE.getComponent_Description();

		/**
		 * The meta object literal for the '<em><b>Author Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__AUTHOR_NAME = eINSTANCE.getComponent_AuthorName();

		/**
		 * The meta object literal for the '<em><b>Author Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__AUTHOR_EMAIL = eINSTANCE.getComponent_AuthorEmail();

		/**
		 * The meta object literal for the '{@link componentmodel.impl.PrimitiveComponentImpl <em>Primitive Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentmodel.impl.PrimitiveComponentImpl
		 * @see componentmodel.impl.ComponentmodelPackageImpl#getPrimitiveComponent()
		 * @generated
		 */
		EClass PRIMITIVE_COMPONENT = eINSTANCE.getPrimitiveComponent();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_COMPONENT__PROPERTIES = eINSTANCE.getPrimitiveComponent_Properties();

		/**
		 * The meta object literal for the '{@link componentmodel.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentmodel.impl.CompositeComponentImpl
		 * @see componentmodel.impl.ComponentmodelPackageImpl#getCompositeComponent()
		 * @generated
		 */
		EClass COMPOSITE_COMPONENT = eINSTANCE.getCompositeComponent();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMPONENT__COMPONENTS = eINSTANCE.getCompositeComponent_Components();

		/**
		 * The meta object literal for the '{@link componentmodel.impl.InPortImpl <em>In Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentmodel.impl.InPortImpl
		 * @see componentmodel.impl.ComponentmodelPackageImpl#getInPort()
		 * @generated
		 */
		EClass IN_PORT = eINSTANCE.getInPort();

		/**
		 * The meta object literal for the '<em><b>Delegates To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PORT__DELEGATES_TO = eINSTANCE.getInPort_DelegatesTo();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PORT__SOURCE = eINSTANCE.getInPort_Source();

		/**
		 * The meta object literal for the '<em><b>Delegates From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PORT__DELEGATES_FROM = eINSTANCE.getInPort_DelegatesFrom();

		/**
		 * The meta object literal for the '{@link componentmodel.impl.OutPortImpl <em>Out Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentmodel.impl.OutPortImpl
		 * @see componentmodel.impl.ComponentmodelPackageImpl#getOutPort()
		 * @generated
		 */
		EClass OUT_PORT = eINSTANCE.getOutPort();

		/**
		 * The meta object literal for the '<em><b>Propagates From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PORT__PROPAGATES_FROM = eINSTANCE.getOutPort_PropagatesFrom();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PORT__SINK = eINSTANCE.getOutPort_Sink();

		/**
		 * The meta object literal for the '<em><b>Propagates To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PORT__PROPAGATES_TO = eINSTANCE.getOutPort_PropagatesTo();

		/**
		 * The meta object literal for the '{@link componentmodel.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentmodel.impl.PortImpl
		 * @see componentmodel.impl.ComponentmodelPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>Type Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE_PACKAGE = eINSTANCE.getPort_TypePackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DESCRIPTION = eINSTANCE.getPort_Description();

		/**
		 * The meta object literal for the '{@link componentmodel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentmodel.impl.PropertyImpl
		 * @see componentmodel.impl.ComponentmodelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

		/**
		 * The meta object literal for the '{@link componentmodel.impl.NumericPropertyImpl <em>Numeric Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentmodel.impl.NumericPropertyImpl
		 * @see componentmodel.impl.ComponentmodelPackageImpl#getNumericProperty()
		 * @generated
		 */
		EClass NUMERIC_PROPERTY = eINSTANCE.getNumericProperty();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_PROPERTY__MIN_VALUE = eINSTANCE.getNumericProperty_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_PROPERTY__MAX_VALUE = eINSTANCE.getNumericProperty_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_PROPERTY__DEFAULT_VALUE = eINSTANCE.getNumericProperty_DefaultValue();

		/**
		 * The meta object literal for the '{@link componentmodel.impl.EnumPropertyImpl <em>Enum Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentmodel.impl.EnumPropertyImpl
		 * @see componentmodel.impl.ComponentmodelPackageImpl#getEnumProperty()
		 * @generated
		 */
		EClass ENUM_PROPERTY = eINSTANCE.getEnumProperty();

		/**
		 * The meta object literal for the '<em><b>Literal Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_PROPERTY__LITERAL_VALUE = eINSTANCE.getEnumProperty_LiteralValue();

	}

} //ComponentmodelPackage
