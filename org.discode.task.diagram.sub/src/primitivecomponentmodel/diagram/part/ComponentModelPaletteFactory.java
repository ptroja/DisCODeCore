package primitivecomponentmodel.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import primitivecomponentmodel.diagram.providers.ComponentModelElementTypes;

/**
 * @generated
 */
public class ComponentModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createPrimitiveComponentModel1Group());
	}

	/**
	 * Creates "PrimitiveComponentModel" palette tool group
	 * @generated
	 */
	private PaletteContainer createPrimitiveComponentModel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.PrimitiveComponentModel1Group_title);
		paletteContainer.setId("createPrimitiveComponentModel1Group"); //$NON-NLS-1$
		paletteContainer.add(createInPort1CreationTool());
		paletteContainer.add(createOutPort2CreationTool());
		paletteContainer.add(createNumericProperty3CreationTool());
		paletteContainer.add(createEnumProperty4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInPort1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InPort1CreationTool_title,
				Messages.InPort1CreationTool_desc,
				Collections
						.singletonList(ComponentModelElementTypes.InPort_2101));
		entry.setId("createInPort1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentModelElementTypes
				.getImageDescriptor(ComponentModelElementTypes.InPort_2101));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutPort2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OutPort2CreationTool_title,
				Messages.OutPort2CreationTool_desc,
				Collections
						.singletonList(ComponentModelElementTypes.OutPort_2102));
		entry.setId("createOutPort2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentModelElementTypes
				.getImageDescriptor(ComponentModelElementTypes.OutPort_2102));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNumericProperty3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.NumericProperty3CreationTool_title,
				Messages.NumericProperty3CreationTool_desc,
				Collections
						.singletonList(ComponentModelElementTypes.NumericProperty_2103));
		entry.setId("createNumericProperty3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentModelElementTypes
				.getImageDescriptor(ComponentModelElementTypes.NumericProperty_2103));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumProperty4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EnumProperty4CreationTool_title,
				Messages.EnumProperty4CreationTool_desc,
				Collections
						.singletonList(ComponentModelElementTypes.EnumProperty_2104));
		entry.setId("createEnumProperty4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentModelElementTypes
				.getImageDescriptor(ComponentModelElementTypes.EnumProperty_2104));
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
}