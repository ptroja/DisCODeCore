package primitivecomponentmodel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import primitivecomponentmodel.diagram.edit.parts.EnumPropertyEditPart;
import primitivecomponentmodel.diagram.edit.parts.EnumPropertyNameEditPart;
import primitivecomponentmodel.diagram.edit.parts.InPortEditPart;
import primitivecomponentmodel.diagram.edit.parts.InPortNameEditPart;
import primitivecomponentmodel.diagram.edit.parts.NumericPropertyEditPart;
import primitivecomponentmodel.diagram.edit.parts.NumericPropertyNameEditPart;
import primitivecomponentmodel.diagram.edit.parts.OutPortEditPart;
import primitivecomponentmodel.diagram.edit.parts.OutPortNameEditPart;
import primitivecomponentmodel.diagram.edit.parts.PrimitiveComponentEditPart;

import componentmodel.ComponentmodelPackage;
import componentmodel.PrimitiveComponent;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ComponentModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.discode.task.diagram.sub/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PrimitiveComponentEditPart.MODEL_ID.equals(view.getType())) {
				return PrimitiveComponentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return primitivecomponentmodel.diagram.part.ComponentModelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ComponentModelDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComponentmodelPackage.eINSTANCE.getPrimitiveComponent()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((PrimitiveComponent) domainElement)) {
			return PrimitiveComponentEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = primitivecomponentmodel.diagram.part.ComponentModelVisualIDRegistry
				.getModelID(containerView);
		if (!PrimitiveComponentEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PrimitiveComponentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = primitivecomponentmodel.diagram.part.ComponentModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PrimitiveComponentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PrimitiveComponentEditPart.VISUAL_ID:
			if (ComponentmodelPackage.eINSTANCE.getInPort().isSuperTypeOf(
					domainElement.eClass())) {
				return InPortEditPart.VISUAL_ID;
			}
			if (ComponentmodelPackage.eINSTANCE.getOutPort().isSuperTypeOf(
					domainElement.eClass())) {
				return OutPortEditPart.VISUAL_ID;
			}
			if (ComponentmodelPackage.eINSTANCE.getNumericProperty()
					.isSuperTypeOf(domainElement.eClass())) {
				return NumericPropertyEditPart.VISUAL_ID;
			}
			if (ComponentmodelPackage.eINSTANCE.getEnumProperty()
					.isSuperTypeOf(domainElement.eClass())) {
				return EnumPropertyEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = primitivecomponentmodel.diagram.part.ComponentModelVisualIDRegistry
				.getModelID(containerView);
		if (!PrimitiveComponentEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PrimitiveComponentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = primitivecomponentmodel.diagram.part.ComponentModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PrimitiveComponentEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PrimitiveComponentEditPart.VISUAL_ID:
			if (InPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NumericPropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumPropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InPortEditPart.VISUAL_ID:
			if (InPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutPortEditPart.VISUAL_ID:
			if (OutPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NumericPropertyEditPart.VISUAL_ID:
			if (NumericPropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumPropertyEditPart.VISUAL_ID:
			if (EnumPropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(PrimitiveComponent element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case PrimitiveComponentEditPart.VISUAL_ID:
			return false;
		case InPortEditPart.VISUAL_ID:
		case OutPortEditPart.VISUAL_ID:
		case NumericPropertyEditPart.VISUAL_ID:
		case EnumPropertyEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return primitivecomponentmodel.diagram.part.ComponentModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return primitivecomponentmodel.diagram.part.ComponentModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return primitivecomponentmodel.diagram.part.ComponentModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return primitivecomponentmodel.diagram.part.ComponentModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return primitivecomponentmodel.diagram.part.ComponentModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return primitivecomponentmodel.diagram.part.ComponentModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
