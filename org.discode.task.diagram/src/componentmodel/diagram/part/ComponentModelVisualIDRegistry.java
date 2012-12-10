package componentmodel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import componentmodel.ComponentmodelPackage;
import componentmodel.CompositeComponent;
import componentmodel.diagram.edit.parts.CompositeComponent2EditPart;
import componentmodel.diagram.edit.parts.CompositeComponentEditPart;
import componentmodel.diagram.edit.parts.CompositeComponentNameEditPart;
import componentmodel.diagram.edit.parts.InPort2EditPart;
import componentmodel.diagram.edit.parts.InPort3EditPart;
import componentmodel.diagram.edit.parts.InPortEditPart;
import componentmodel.diagram.edit.parts.InPortName2EditPart;
import componentmodel.diagram.edit.parts.InPortName3EditPart;
import componentmodel.diagram.edit.parts.InPortNameEditPart;
import componentmodel.diagram.edit.parts.OutPort2EditPart;
import componentmodel.diagram.edit.parts.OutPort3EditPart;
import componentmodel.diagram.edit.parts.OutPortEditPart;
import componentmodel.diagram.edit.parts.OutPortName2EditPart;
import componentmodel.diagram.edit.parts.OutPortName3EditPart;
import componentmodel.diagram.edit.parts.OutPortNameEditPart;
import componentmodel.diagram.edit.parts.PrimitiveComponentEditPart;
import componentmodel.diagram.edit.parts.PrimitiveComponentNameEditPart;

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
	private static final String DEBUG_KEY = "org.discode.task.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CompositeComponentEditPart.MODEL_ID.equals(view.getType())) {
				return CompositeComponentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return componentmodel.diagram.part.ComponentModelVisualIDRegistry
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
		if (ComponentmodelPackage.eINSTANCE.getCompositeComponent()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((CompositeComponent) domainElement)) {
			return CompositeComponentEditPart.VISUAL_ID;
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
		String containerModelID = componentmodel.diagram.part.ComponentModelVisualIDRegistry
				.getModelID(containerView);
		if (!CompositeComponentEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (CompositeComponentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = componentmodel.diagram.part.ComponentModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CompositeComponentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CompositeComponentEditPart.VISUAL_ID:
			if (ComponentmodelPackage.eINSTANCE.getCompositeComponent()
					.isSuperTypeOf(domainElement.eClass())) {
				return CompositeComponent2EditPart.VISUAL_ID;
			}
			if (ComponentmodelPackage.eINSTANCE.getPrimitiveComponent()
					.isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveComponentEditPart.VISUAL_ID;
			}
			if (ComponentmodelPackage.eINSTANCE.getOutPort().isSuperTypeOf(
					domainElement.eClass())) {
				return OutPortEditPart.VISUAL_ID;
			}
			if (ComponentmodelPackage.eINSTANCE.getInPort().isSuperTypeOf(
					domainElement.eClass())) {
				return InPortEditPart.VISUAL_ID;
			}
			break;
		case CompositeComponent2EditPart.VISUAL_ID:
			if (ComponentmodelPackage.eINSTANCE.getInPort().isSuperTypeOf(
					domainElement.eClass())) {
				return InPort2EditPart.VISUAL_ID;
			}
			if (ComponentmodelPackage.eINSTANCE.getOutPort().isSuperTypeOf(
					domainElement.eClass())) {
				return OutPort2EditPart.VISUAL_ID;
			}
			break;
		case PrimitiveComponentEditPart.VISUAL_ID:
			if (ComponentmodelPackage.eINSTANCE.getInPort().isSuperTypeOf(
					domainElement.eClass())) {
				return InPort3EditPart.VISUAL_ID;
			}
			if (ComponentmodelPackage.eINSTANCE.getOutPort().isSuperTypeOf(
					domainElement.eClass())) {
				return OutPort3EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = componentmodel.diagram.part.ComponentModelVisualIDRegistry
				.getModelID(containerView);
		if (!CompositeComponentEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (CompositeComponentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = componentmodel.diagram.part.ComponentModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CompositeComponentEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CompositeComponentEditPart.VISUAL_ID:
			if (CompositeComponent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeComponent2EditPart.VISUAL_ID:
			if (CompositeComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveComponentEditPart.VISUAL_ID:
			if (PrimitiveComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InPort3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutPort3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutPortEditPart.VISUAL_ID:
			if (OutPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InPortEditPart.VISUAL_ID:
			if (InPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InPort2EditPart.VISUAL_ID:
			if (InPortName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutPort2EditPart.VISUAL_ID:
			if (OutPortName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InPort3EditPart.VISUAL_ID:
			if (InPortName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutPort3EditPart.VISUAL_ID:
			if (OutPortName3EditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(CompositeComponent element) {
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
		case CompositeComponentEditPart.VISUAL_ID:
			return false;
		case OutPortEditPart.VISUAL_ID:
		case InPortEditPart.VISUAL_ID:
		case InPort2EditPart.VISUAL_ID:
		case OutPort2EditPart.VISUAL_ID:
		case InPort3EditPart.VISUAL_ID:
		case OutPort3EditPart.VISUAL_ID:
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
			return componentmodel.diagram.part.ComponentModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return componentmodel.diagram.part.ComponentModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return componentmodel.diagram.part.ComponentModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return componentmodel.diagram.part.ComponentModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return componentmodel.diagram.part.ComponentModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return componentmodel.diagram.part.ComponentModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
