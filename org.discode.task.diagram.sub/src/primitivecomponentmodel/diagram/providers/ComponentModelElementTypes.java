package primitivecomponentmodel.diagram.providers;

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

import primitivecomponentmodel.diagram.edit.parts.EnumPropertyEditPart;
import primitivecomponentmodel.diagram.edit.parts.InPortEditPart;
import primitivecomponentmodel.diagram.edit.parts.NumericPropertyEditPart;
import primitivecomponentmodel.diagram.edit.parts.OutPortEditPart;
import primitivecomponentmodel.diagram.edit.parts.PrimitiveComponentEditPart;
import primitivecomponentmodel.diagram.part.ComponentModelDiagramEditorPlugin;

import componentmodel.ComponentmodelPackage;

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
	public static final IElementType PrimitiveComponent_1000 = getElementType("org.discode.task.diagram.sub.PrimitiveComponent_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InPort_2001 = getElementType("org.discode.task.diagram.sub.InPort_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutPort_2002 = getElementType("org.discode.task.diagram.sub.OutPort_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NumericProperty_2003 = getElementType("org.discode.task.diagram.sub.NumericProperty_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnumProperty_2004 = getElementType("org.discode.task.diagram.sub.EnumProperty_2004"); //$NON-NLS-1$

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

			elements.put(PrimitiveComponent_1000,
					ComponentmodelPackage.eINSTANCE.getPrimitiveComponent());

			elements.put(InPort_2001,
					ComponentmodelPackage.eINSTANCE.getInPort());

			elements.put(OutPort_2002,
					ComponentmodelPackage.eINSTANCE.getOutPort());

			elements.put(NumericProperty_2003,
					ComponentmodelPackage.eINSTANCE.getNumericProperty());

			elements.put(EnumProperty_2004,
					ComponentmodelPackage.eINSTANCE.getEnumProperty());
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
			KNOWN_ELEMENT_TYPES.add(PrimitiveComponent_1000);
			KNOWN_ELEMENT_TYPES.add(InPort_2001);
			KNOWN_ELEMENT_TYPES.add(OutPort_2002);
			KNOWN_ELEMENT_TYPES.add(NumericProperty_2003);
			KNOWN_ELEMENT_TYPES.add(EnumProperty_2004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PrimitiveComponentEditPart.VISUAL_ID:
			return PrimitiveComponent_1000;
		case InPortEditPart.VISUAL_ID:
			return InPort_2001;
		case OutPortEditPart.VISUAL_ID:
			return OutPort_2002;
		case NumericPropertyEditPart.VISUAL_ID:
			return NumericProperty_2003;
		case EnumPropertyEditPart.VISUAL_ID:
			return EnumProperty_2004;
		}
		return null;
	}

}
