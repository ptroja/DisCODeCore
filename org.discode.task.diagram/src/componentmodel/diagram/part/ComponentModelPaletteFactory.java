package componentmodel.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import componentmodel.diagram.providers.ComponentModelElementTypes;

/**
 * @generated
 */
public class ComponentModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createComponentmodel1Group());
	}

	/**
	 * Creates "componentmodel" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponentmodel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Componentmodel1Group_title);
		paletteContainer.setId("createComponentmodel1Group"); //$NON-NLS-1$
		paletteContainer.add(createPrimitiveComponent1CreationTool());
		paletteContainer.add(createCompositeComponent2CreationTool());
		paletteContainer.add(createInPort3CreationTool());
		paletteContainer.add(createOutPort4CreationTool());
		paletteContainer.add(createDataFlow5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimitiveComponent1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PrimitiveComponent1CreationTool_title,
				Messages.PrimitiveComponent1CreationTool_desc,
				Collections
						.singletonList(ComponentModelElementTypes.PrimitiveComponent_2002));
		entry.setId("createPrimitiveComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentModelElementTypes
				.getImageDescriptor(ComponentModelElementTypes.PrimitiveComponent_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositeComponent2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CompositeComponent2CreationTool_title,
				Messages.CompositeComponent2CreationTool_desc,
				Collections
						.singletonList(ComponentModelElementTypes.CompositeComponent_2001));
		entry.setId("createCompositeComponent2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentModelElementTypes
				.getImageDescriptor(ComponentModelElementTypes.CompositeComponent_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInPort3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InPort3CreationTool_title,
				Messages.InPort3CreationTool_desc,
				Collections
						.singletonList(ComponentModelElementTypes.InPort_2004));
		entry.setId("createInPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentModelElementTypes
				.getImageDescriptor(ComponentModelElementTypes.InPort_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutPort4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OutPort4CreationTool_title,
				Messages.OutPort4CreationTool_desc,
				Collections
						.singletonList(ComponentModelElementTypes.OutPort_2003));
		entry.setId("createOutPort4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentModelElementTypes
				.getImageDescriptor(ComponentModelElementTypes.OutPort_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataFlow5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ComponentModelElementTypes.OutPortPropagatesTo_4005);
		types.add(ComponentModelElementTypes.InPortDelegatesTo_4002);
		types.add(ComponentModelElementTypes.OutPortSink_4004);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DataFlow5CreationTool_title,
				Messages.DataFlow5CreationTool_desc, types);
		entry.setId("createDataFlow5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentModelDiagramEditorPlugin
				.findImageDescriptor("/org.discode.task.edit/icons/full/obj16/DataFlow.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
