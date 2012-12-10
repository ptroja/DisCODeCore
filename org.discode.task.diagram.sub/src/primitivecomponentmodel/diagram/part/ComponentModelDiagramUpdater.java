package primitivecomponentmodel.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import primitivecomponentmodel.diagram.edit.parts.EnumPropertyEditPart;
import primitivecomponentmodel.diagram.edit.parts.InPortEditPart;
import primitivecomponentmodel.diagram.edit.parts.NumericPropertyEditPart;
import primitivecomponentmodel.diagram.edit.parts.OutPortEditPart;
import primitivecomponentmodel.diagram.edit.parts.PrimitiveComponentEditPart;

import componentmodel.Port;
import componentmodel.PrimitiveComponent;
import componentmodel.Property;

/**
 * @generated
 */
public class ComponentModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ComponentModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (ComponentModelVisualIDRegistry.getVisualID(view)) {
		case PrimitiveComponentEditPart.VISUAL_ID:
			return getPrimitiveComponent_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelNodeDescriptor> getPrimitiveComponent_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		PrimitiveComponent modelElement = (PrimitiveComponent) view
				.getElement();
		LinkedList<ComponentModelNodeDescriptor> result = new LinkedList<ComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			Port childElement = (Port) it.next();
			int visualID = ComponentModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InPortEditPart.VISUAL_ID) {
				result.add(new ComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == OutPortEditPart.VISUAL_ID) {
				result.add(new ComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getProperties().iterator(); it
				.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = ComponentModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == NumericPropertyEditPart.VISUAL_ID) {
				result.add(new ComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == EnumPropertyEditPart.VISUAL_ID) {
				result.add(new ComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getContainedLinks(View view) {
		switch (ComponentModelVisualIDRegistry.getVisualID(view)) {
		case PrimitiveComponentEditPart.VISUAL_ID:
			return getPrimitiveComponent_1000ContainedLinks(view);
		case InPortEditPart.VISUAL_ID:
			return getInPort_2001ContainedLinks(view);
		case OutPortEditPart.VISUAL_ID:
			return getOutPort_2002ContainedLinks(view);
		case NumericPropertyEditPart.VISUAL_ID:
			return getNumericProperty_2003ContainedLinks(view);
		case EnumPropertyEditPart.VISUAL_ID:
			return getEnumProperty_2004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getIncomingLinks(View view) {
		switch (ComponentModelVisualIDRegistry.getVisualID(view)) {
		case InPortEditPart.VISUAL_ID:
			return getInPort_2001IncomingLinks(view);
		case OutPortEditPart.VISUAL_ID:
			return getOutPort_2002IncomingLinks(view);
		case NumericPropertyEditPart.VISUAL_ID:
			return getNumericProperty_2003IncomingLinks(view);
		case EnumPropertyEditPart.VISUAL_ID:
			return getEnumProperty_2004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (ComponentModelVisualIDRegistry.getVisualID(view)) {
		case InPortEditPart.VISUAL_ID:
			return getInPort_2001OutgoingLinks(view);
		case OutPortEditPart.VISUAL_ID:
			return getOutPort_2002OutgoingLinks(view);
		case NumericPropertyEditPart.VISUAL_ID:
			return getNumericProperty_2003OutgoingLinks(view);
		case EnumPropertyEditPart.VISUAL_ID:
			return getEnumProperty_2004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getPrimitiveComponent_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getInPort_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getOutPort_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getNumericProperty_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getEnumProperty_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getInPort_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getOutPort_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getNumericProperty_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getEnumProperty_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getInPort_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getOutPort_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getNumericProperty_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getEnumProperty_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<ComponentModelNodeDescriptor> getSemanticChildren(View view) {
			return ComponentModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ComponentModelLinkDescriptor> getContainedLinks(View view) {
			return ComponentModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ComponentModelLinkDescriptor> getIncomingLinks(View view) {
			return ComponentModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ComponentModelLinkDescriptor> getOutgoingLinks(View view) {
			return ComponentModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
