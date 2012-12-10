package componentmodel.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import componentmodel.ComponentmodelPackage;
import componentmodel.diagram.edit.parts.CompositeComponent2EditPart;
import componentmodel.diagram.edit.parts.CompositeComponentEditPart;
import componentmodel.diagram.edit.parts.InPort2EditPart;
import componentmodel.diagram.edit.parts.InPort3EditPart;
import componentmodel.diagram.edit.parts.InPortDelegatesToEditPart;
import componentmodel.diagram.edit.parts.InPortEditPart;
import componentmodel.diagram.edit.parts.OutPort2EditPart;
import componentmodel.diagram.edit.parts.OutPort3EditPart;
import componentmodel.diagram.edit.parts.OutPortEditPart;
import componentmodel.diagram.edit.parts.OutPortPropagatesToEditPart;
import componentmodel.diagram.edit.parts.OutPortSinkEditPart;
import componentmodel.diagram.edit.parts.PrimitiveComponentEditPart;
import componentmodel.diagram.part.ComponentModelDiagramEditorPlugin;

/**
 * @generated
 */
public class ComponentModelElementTypes {

	/**
	 * @generated
	 */
	private ComponentModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType CompositeComponent_1000 = getElementType("org.discode.task.diagram.CompositeComponent_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeComponent_2001 = getElementType("org.discode.task.diagram.CompositeComponent_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PrimitiveComponent_2002 = getElementType("org.discode.task.diagram.PrimitiveComponent_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutPort_2003 = getElementType("org.discode.task.diagram.OutPort_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InPort_2004 = getElementType("org.discode.task.diagram.InPort_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InPort_3001 = getElementType("org.discode.task.diagram.InPort_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutPort_3002 = getElementType("org.discode.task.diagram.OutPort_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InPort_3003 = getElementType("org.discode.task.diagram.InPort_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutPort_3004 = getElementType("org.discode.task.diagram.OutPort_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutPortPropagatesTo_4005 = getElementType("org.discode.task.diagram.OutPortPropagatesTo_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InPortDelegatesTo_4002 = getElementType("org.discode.task.diagram.InPortDelegatesTo_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutPortSink_4004 = getElementType("org.discode.task.diagram.OutPortSink_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ComponentModelDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(CompositeComponent_1000,
					ComponentmodelPackage.eINSTANCE.getCompositeComponent());

			elements.put(CompositeComponent_2001,
					ComponentmodelPackage.eINSTANCE.getCompositeComponent());

			elements.put(PrimitiveComponent_2002,
					ComponentmodelPackage.eINSTANCE.getPrimitiveComponent());

			elements.put(OutPort_2003,
					ComponentmodelPackage.eINSTANCE.getOutPort());

			elements.put(InPort_2004,
					ComponentmodelPackage.eINSTANCE.getInPort());

			elements.put(InPort_3001,
					ComponentmodelPackage.eINSTANCE.getInPort());

			elements.put(OutPort_3002,
					ComponentmodelPackage.eINSTANCE.getOutPort());

			elements.put(InPort_3003,
					ComponentmodelPackage.eINSTANCE.getInPort());

			elements.put(OutPort_3004,
					ComponentmodelPackage.eINSTANCE.getOutPort());

			elements.put(OutPortPropagatesTo_4005,
					ComponentmodelPackage.eINSTANCE.getOutPort_PropagatesTo());

			elements.put(InPortDelegatesTo_4002,
					ComponentmodelPackage.eINSTANCE.getInPort_DelegatesTo());

			elements.put(OutPortSink_4004,
					ComponentmodelPackage.eINSTANCE.getOutPort_Sink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(CompositeComponent_1000);
			KNOWN_ELEMENT_TYPES.add(CompositeComponent_2001);
			KNOWN_ELEMENT_TYPES.add(PrimitiveComponent_2002);
			KNOWN_ELEMENT_TYPES.add(OutPort_2003);
			KNOWN_ELEMENT_TYPES.add(InPort_2004);
			KNOWN_ELEMENT_TYPES.add(InPort_3001);
			KNOWN_ELEMENT_TYPES.add(OutPort_3002);
			KNOWN_ELEMENT_TYPES.add(InPort_3003);
			KNOWN_ELEMENT_TYPES.add(OutPort_3004);
			KNOWN_ELEMENT_TYPES.add(OutPortPropagatesTo_4005);
			KNOWN_ELEMENT_TYPES.add(InPortDelegatesTo_4002);
			KNOWN_ELEMENT_TYPES.add(OutPortSink_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CompositeComponentEditPart.VISUAL_ID:
			return CompositeComponent_1000;
		case CompositeComponent2EditPart.VISUAL_ID:
			return CompositeComponent_2001;
		case PrimitiveComponentEditPart.VISUAL_ID:
			return PrimitiveComponent_2002;
		case OutPortEditPart.VISUAL_ID:
			return OutPort_2003;
		case InPortEditPart.VISUAL_ID:
			return InPort_2004;
		case InPort2EditPart.VISUAL_ID:
			return InPort_3001;
		case OutPort2EditPart.VISUAL_ID:
			return OutPort_3002;
		case InPort3EditPart.VISUAL_ID:
			return InPort_3003;
		case OutPort3EditPart.VISUAL_ID:
			return OutPort_3004;
		case OutPortPropagatesToEditPart.VISUAL_ID:
			return OutPortPropagatesTo_4005;
		case InPortDelegatesToEditPart.VISUAL_ID:
			return InPortDelegatesTo_4002;
		case OutPortSinkEditPart.VISUAL_ID:
			return OutPortSink_4004;
		}
		return null;
	}

}
