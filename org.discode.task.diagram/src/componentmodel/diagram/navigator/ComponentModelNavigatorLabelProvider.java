package componentmodel.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import componentmodel.CompositeComponent;
import componentmodel.InPort;
import componentmodel.OutPort;
import componentmodel.diagram.edit.parts.CompositeComponent2EditPart;
import componentmodel.diagram.edit.parts.CompositeComponentEditPart;
import componentmodel.diagram.edit.parts.CompositeComponentNameEditPart;
import componentmodel.diagram.edit.parts.InPort2EditPart;
import componentmodel.diagram.edit.parts.InPort3EditPart;
import componentmodel.diagram.edit.parts.InPortDelegatesToEditPart;
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
import componentmodel.diagram.edit.parts.OutPortPropagatesToEditPart;
import componentmodel.diagram.edit.parts.OutPortSinkEditPart;
import componentmodel.diagram.edit.parts.PrimitiveComponentEditPart;
import componentmodel.diagram.edit.parts.PrimitiveComponentNameEditPart;
import componentmodel.diagram.part.ComponentModelDiagramEditorPlugin;
import componentmodel.diagram.part.ComponentModelVisualIDRegistry;
import componentmodel.diagram.providers.ComponentModelElementTypes;
import componentmodel.diagram.providers.ComponentModelParserProvider;

/**
 * @generated
 */
public class ComponentModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ComponentModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ComponentModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ComponentModelNavigatorItem
				&& !isOwnView(((ComponentModelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ComponentModelNavigatorGroup) {
			ComponentModelNavigatorGroup group = (ComponentModelNavigatorGroup) element;
			return ComponentModelDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof ComponentModelNavigatorItem) {
			ComponentModelNavigatorItem navigatorItem = (ComponentModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ComponentModelVisualIDRegistry.getVisualID(view)) {
		case OutPortSinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://componentmodel/1.0?OutPort?sink", ComponentModelElementTypes.OutPortSink_4004); //$NON-NLS-1$
		case OutPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://componentmodel/1.0?OutPort", ComponentModelElementTypes.OutPort_3002); //$NON-NLS-1$
		case InPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://componentmodel/1.0?InPort", ComponentModelElementTypes.InPort_3001); //$NON-NLS-1$
		case OutPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://componentmodel/1.0?OutPort", ComponentModelElementTypes.OutPort_2003); //$NON-NLS-1$
		case PrimitiveComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://componentmodel/1.0?PrimitiveComponent", ComponentModelElementTypes.PrimitiveComponent_2002); //$NON-NLS-1$
		case InPortDelegatesToEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://componentmodel/1.0?InPort?delegatesTo", ComponentModelElementTypes.InPortDelegatesTo_4002); //$NON-NLS-1$
		case InPort3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://componentmodel/1.0?InPort", ComponentModelElementTypes.InPort_3003); //$NON-NLS-1$
		case InPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://componentmodel/1.0?InPort", ComponentModelElementTypes.InPort_2004); //$NON-NLS-1$
		case OutPortPropagatesToEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://componentmodel/1.0?OutPort?propagatesTo", ComponentModelElementTypes.OutPortPropagatesTo_4005); //$NON-NLS-1$
		case OutPort3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://componentmodel/1.0?OutPort", ComponentModelElementTypes.OutPort_3004); //$NON-NLS-1$
		case CompositeComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://componentmodel/1.0?CompositeComponent", ComponentModelElementTypes.CompositeComponent_1000); //$NON-NLS-1$
		case CompositeComponent2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://componentmodel/1.0?CompositeComponent", ComponentModelElementTypes.CompositeComponent_2001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ComponentModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ComponentModelElementTypes.isKnownElementType(elementType)) {
			image = ComponentModelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ComponentModelNavigatorGroup) {
			ComponentModelNavigatorGroup group = (ComponentModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ComponentModelNavigatorItem) {
			ComponentModelNavigatorItem navigatorItem = (ComponentModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ComponentModelVisualIDRegistry.getVisualID(view)) {
		case OutPortSinkEditPart.VISUAL_ID:
			return getOutPortSink_4004Text(view);
		case OutPort2EditPart.VISUAL_ID:
			return getOutPort_3002Text(view);
		case InPort2EditPart.VISUAL_ID:
			return getInPort_3001Text(view);
		case OutPortEditPart.VISUAL_ID:
			return getOutPort_2003Text(view);
		case PrimitiveComponentEditPart.VISUAL_ID:
			return getPrimitiveComponent_2002Text(view);
		case InPortDelegatesToEditPart.VISUAL_ID:
			return getInPortDelegatesTo_4002Text(view);
		case InPort3EditPart.VISUAL_ID:
			return getInPort_3003Text(view);
		case InPortEditPart.VISUAL_ID:
			return getInPort_2004Text(view);
		case OutPortPropagatesToEditPart.VISUAL_ID:
			return getOutPortPropagatesTo_4005Text(view);
		case OutPort3EditPart.VISUAL_ID:
			return getOutPort_3004Text(view);
		case CompositeComponentEditPart.VISUAL_ID:
			return getCompositeComponent_1000Text(view);
		case CompositeComponent2EditPart.VISUAL_ID:
			return getCompositeComponent_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getInPortDelegatesTo_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOutPort_3002Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(
				ComponentModelElementTypes.OutPort_3002,
				view.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry
						.getType(OutPortName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutPortPropagatesTo_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOutPort_3004Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(
				ComponentModelElementTypes.OutPort_3004,
				view.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry
						.getType(OutPortName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInPort_3001Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(
				ComponentModelElementTypes.InPort_3001,
				view.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry
						.getType(InPortName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutPortSink_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getInPort_2004Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(
				ComponentModelElementTypes.InPort_2004,
				view.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry
						.getType(InPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeComponent_1000Text(View view) {
		CompositeComponent domainModelElement = (CompositeComponent) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ComponentModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPrimitiveComponent_2002Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(
				ComponentModelElementTypes.PrimitiveComponent_2002, view
						.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry
						.getType(PrimitiveComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeComponent_2001Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(
				ComponentModelElementTypes.CompositeComponent_2001, view
						.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry
						.getType(CompositeComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInPort_3003Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(
				ComponentModelElementTypes.InPort_3003,
				view.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry
						.getType(InPortName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutPort_2003Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(
				ComponentModelElementTypes.OutPort_2003,
				view.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry
						.getType(OutPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CompositeComponentEditPart.MODEL_ID
				.equals(ComponentModelVisualIDRegistry.getModelID(view));
	}

}
