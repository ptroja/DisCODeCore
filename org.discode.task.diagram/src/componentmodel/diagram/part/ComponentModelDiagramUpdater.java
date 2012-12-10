package componentmodel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import componentmodel.Component;
import componentmodel.ComponentmodelPackage;
import componentmodel.CompositeComponent;
import componentmodel.InPort;
import componentmodel.OutPort;
import componentmodel.Port;
import componentmodel.PrimitiveComponent;
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
import componentmodel.diagram.providers.ComponentModelElementTypes;

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
		case CompositeComponentEditPart.VISUAL_ID:
			return getCompositeComponent_1000SemanticChildren(view);
		case CompositeComponent2EditPart.VISUAL_ID:
			return getCompositeComponent_2001SemanticChildren(view);
		case PrimitiveComponentEditPart.VISUAL_ID:
			return getPrimitiveComponent_2002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelNodeDescriptor> getCompositeComponent_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CompositeComponent modelElement = (CompositeComponent) view
				.getElement();
		LinkedList<ComponentModelNodeDescriptor> result = new LinkedList<ComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = ComponentModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CompositeComponent2EditPart.VISUAL_ID) {
				result.add(new ComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == PrimitiveComponentEditPart.VISUAL_ID) {
				result.add(new ComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			Port childElement = (Port) it.next();
			int visualID = ComponentModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutPortEditPart.VISUAL_ID) {
				result.add(new ComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == InPortEditPart.VISUAL_ID) {
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
	public static List<ComponentModelNodeDescriptor> getCompositeComponent_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CompositeComponent modelElement = (CompositeComponent) view
				.getElement();
		LinkedList<ComponentModelNodeDescriptor> result = new LinkedList<ComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			Port childElement = (Port) it.next();
			int visualID = ComponentModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InPort2EditPart.VISUAL_ID) {
				result.add(new ComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == OutPort2EditPart.VISUAL_ID) {
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
	public static List<ComponentModelNodeDescriptor> getPrimitiveComponent_2002SemanticChildren(
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
			if (visualID == InPort3EditPart.VISUAL_ID) {
				result.add(new ComponentModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == OutPort3EditPart.VISUAL_ID) {
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
		case CompositeComponentEditPart.VISUAL_ID:
			return getCompositeComponent_1000ContainedLinks(view);
		case CompositeComponent2EditPart.VISUAL_ID:
			return getCompositeComponent_2001ContainedLinks(view);
		case PrimitiveComponentEditPart.VISUAL_ID:
			return getPrimitiveComponent_2002ContainedLinks(view);
		case OutPortEditPart.VISUAL_ID:
			return getOutPort_2003ContainedLinks(view);
		case InPortEditPart.VISUAL_ID:
			return getInPort_2004ContainedLinks(view);
		case InPort2EditPart.VISUAL_ID:
			return getInPort_3001ContainedLinks(view);
		case OutPort2EditPart.VISUAL_ID:
			return getOutPort_3002ContainedLinks(view);
		case InPort3EditPart.VISUAL_ID:
			return getInPort_3003ContainedLinks(view);
		case OutPort3EditPart.VISUAL_ID:
			return getOutPort_3004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getIncomingLinks(View view) {
		switch (ComponentModelVisualIDRegistry.getVisualID(view)) {
		case CompositeComponent2EditPart.VISUAL_ID:
			return getCompositeComponent_2001IncomingLinks(view);
		case PrimitiveComponentEditPart.VISUAL_ID:
			return getPrimitiveComponent_2002IncomingLinks(view);
		case OutPortEditPart.VISUAL_ID:
			return getOutPort_2003IncomingLinks(view);
		case InPortEditPart.VISUAL_ID:
			return getInPort_2004IncomingLinks(view);
		case InPort2EditPart.VISUAL_ID:
			return getInPort_3001IncomingLinks(view);
		case OutPort2EditPart.VISUAL_ID:
			return getOutPort_3002IncomingLinks(view);
		case InPort3EditPart.VISUAL_ID:
			return getInPort_3003IncomingLinks(view);
		case OutPort3EditPart.VISUAL_ID:
			return getOutPort_3004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (ComponentModelVisualIDRegistry.getVisualID(view)) {
		case CompositeComponent2EditPart.VISUAL_ID:
			return getCompositeComponent_2001OutgoingLinks(view);
		case PrimitiveComponentEditPart.VISUAL_ID:
			return getPrimitiveComponent_2002OutgoingLinks(view);
		case OutPortEditPart.VISUAL_ID:
			return getOutPort_2003OutgoingLinks(view);
		case InPortEditPart.VISUAL_ID:
			return getInPort_2004OutgoingLinks(view);
		case InPort2EditPart.VISUAL_ID:
			return getInPort_3001OutgoingLinks(view);
		case OutPort2EditPart.VISUAL_ID:
			return getOutPort_3002OutgoingLinks(view);
		case InPort3EditPart.VISUAL_ID:
			return getInPort_3003OutgoingLinks(view);
		case OutPort3EditPart.VISUAL_ID:
			return getOutPort_3004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getCompositeComponent_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getCompositeComponent_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getPrimitiveComponent_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getOutPort_2003ContainedLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutPort_PropagatesTo_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OutPort_Sink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getInPort_2004ContainedLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InPort_DelegatesTo_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getInPort_3001ContainedLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InPort_DelegatesTo_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getOutPort_3002ContainedLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutPort_PropagatesTo_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OutPort_Sink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getInPort_3003ContainedLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InPort_DelegatesTo_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getOutPort_3004ContainedLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutPort_PropagatesTo_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OutPort_Sink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getCompositeComponent_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getPrimitiveComponent_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getOutPort_2003IncomingLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_OutPort_PropagatesTo_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getInPort_2004IncomingLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InPort_DelegatesTo_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OutPort_Sink_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getInPort_3001IncomingLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InPort_DelegatesTo_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OutPort_Sink_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getOutPort_3002IncomingLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_OutPort_PropagatesTo_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getInPort_3003IncomingLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InPort_DelegatesTo_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OutPort_Sink_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getOutPort_3004IncomingLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_OutPort_PropagatesTo_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getCompositeComponent_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getPrimitiveComponent_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getOutPort_2003OutgoingLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutPort_PropagatesTo_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OutPort_Sink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getInPort_2004OutgoingLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InPort_DelegatesTo_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getInPort_3001OutgoingLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InPort_DelegatesTo_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getOutPort_3002OutgoingLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutPort_PropagatesTo_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OutPort_Sink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getInPort_3003OutgoingLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InPort_DelegatesTo_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getOutPort_3004OutgoingLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutPort_PropagatesTo_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OutPort_Sink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_OutPort_PropagatesTo_4005(
			OutPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ComponentmodelPackage.eINSTANCE
					.getOutPort_PropagatesTo()) {
				result.add(new ComponentModelLinkDescriptor(setting
						.getEObject(), target,
						ComponentModelElementTypes.OutPortPropagatesTo_4005,
						OutPortPropagatesToEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_InPort_DelegatesTo_4002(
			InPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ComponentmodelPackage.eINSTANCE
					.getInPort_DelegatesTo()) {
				result.add(new ComponentModelLinkDescriptor(setting
						.getEObject(), target,
						ComponentModelElementTypes.InPortDelegatesTo_4002,
						InPortDelegatesToEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentModelLinkDescriptor> getIncomingFeatureModelFacetLinks_OutPort_Sink_4004(
			InPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ComponentmodelPackage.eINSTANCE
					.getOutPort_Sink()) {
				result.add(new ComponentModelLinkDescriptor(setting
						.getEObject(), target,
						ComponentModelElementTypes.OutPortSink_4004,
						OutPortSinkEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_OutPort_PropagatesTo_4005(
			OutPort source) {
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getPropagatesTo().iterator(); destinations
				.hasNext();) {
			OutPort destination = (OutPort) destinations.next();
			result.add(new ComponentModelLinkDescriptor(source, destination,
					ComponentModelElementTypes.OutPortPropagatesTo_4005,
					OutPortPropagatesToEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_InPort_DelegatesTo_4002(
			InPort source) {
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getDelegatesTo().iterator(); destinations
				.hasNext();) {
			InPort destination = (InPort) destinations.next();
			result.add(new ComponentModelLinkDescriptor(source, destination,
					ComponentModelElementTypes.InPortDelegatesTo_4002,
					InPortDelegatesToEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_OutPort_Sink_4004(
			OutPort source) {
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getSink().iterator(); destinations
				.hasNext();) {
			InPort destination = (InPort) destinations.next();
			result.add(new ComponentModelLinkDescriptor(source, destination,
					ComponentModelElementTypes.OutPortSink_4004,
					OutPortSinkEditPart.VISUAL_ID));
		}
		return result;
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
