package primitivecomponentmodel.diagram.navigator;

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

import primitivecomponentmodel.diagram.edit.parts.EnumPropertyEditPart;
import primitivecomponentmodel.diagram.edit.parts.EnumPropertyNameEditPart;
import primitivecomponentmodel.diagram.edit.parts.InPortEditPart;
import primitivecomponentmodel.diagram.edit.parts.InPortNameEditPart;
import primitivecomponentmodel.diagram.edit.parts.NumericPropertyEditPart;
import primitivecomponentmodel.diagram.edit.parts.NumericPropertyNameEditPart;
import primitivecomponentmodel.diagram.edit.parts.OutPortEditPart;
import primitivecomponentmodel.diagram.edit.parts.OutPortNameEditPart;
import primitivecomponentmodel.diagram.edit.parts.PrimitiveComponentEditPart;
import primitivecomponentmodel.diagram.part.ComponentModelDiagramEditorPlugin;
import primitivecomponentmodel.diagram.part.ComponentModelVisualIDRegistry;
import primitivecomponentmodel.diagram.providers.ComponentModelElementTypes;
import primitivecomponentmodel.diagram.providers.ComponentModelParserProvider;

import componentmodel.OutPort;
import componentmodel.PrimitiveComponent;

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
		case PrimitiveComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://componentmodel/1.0?PrimitiveComponent", ComponentModelElementTypes.PrimitiveComponent_1000); //$NON-NLS-1$
		case InPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://componentmodel/1.0?InPort", ComponentModelElementTypes.InPort_2001); //$NON-NLS-1$
		case OutPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://componentmodel/1.0?OutPort", ComponentModelElementTypes.OutPort_2002); //$NON-NLS-1$
		case NumericPropertyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://componentmodel/1.0?NumericProperty", ComponentModelElementTypes.NumericProperty_2003); //$NON-NLS-1$
		case EnumPropertyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://componentmodel/1.0?EnumProperty", ComponentModelElementTypes.EnumProperty_2004); //$NON-NLS-1$
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
		case PrimitiveComponentEditPart.VISUAL_ID:
			return getPrimitiveComponent_1000Text(view);
		case InPortEditPart.VISUAL_ID:
			return getInPort_2001Text(view);
		case OutPortEditPart.VISUAL_ID:
			return getOutPort_2002Text(view);
		case NumericPropertyEditPart.VISUAL_ID:
			return getNumericProperty_2003Text(view);
		case EnumPropertyEditPart.VISUAL_ID:
			return getEnumProperty_2004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPrimitiveComponent_1000Text(View view) {
		PrimitiveComponent domainModelElement = (PrimitiveComponent) view
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
	private String getInPort_2001Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(
				ComponentModelElementTypes.InPort_2001,
				view.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry
						.getType(InPortNameEditPart.VISUAL_ID));
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
	private String getOutPort_2002Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(
				ComponentModelElementTypes.OutPort_2002,
				view.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry
						.getType(OutPortNameEditPart.VISUAL_ID));
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
	private String getNumericProperty_2003Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(
				ComponentModelElementTypes.NumericProperty_2003, view
						.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry
						.getType(NumericPropertyNameEditPart.VISUAL_ID));
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
	private String getEnumProperty_2004Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(
				ComponentModelElementTypes.EnumProperty_2004,
				view.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry
						.getType(EnumPropertyNameEditPart.VISUAL_ID));
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
		return PrimitiveComponentEditPart.MODEL_ID
				.equals(ComponentModelVisualIDRegistry.getModelID(view));
	}

}
