package primitivecomponentmodel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import primitivecomponentmodel.diagram.part.ComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class ComponentModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ComponentModelVisualIDRegistry.getVisualID(view)) {

			case PrimitiveComponentEditPart.VISUAL_ID:
				return new PrimitiveComponentEditPart(view);

			case InPortEditPart.VISUAL_ID:
				return new InPortEditPart(view);

			case InPortNameEditPart.VISUAL_ID:
				return new InPortNameEditPart(view);

			case OutPortEditPart.VISUAL_ID:
				return new OutPortEditPart(view);

			case OutPortNameEditPart.VISUAL_ID:
				return new OutPortNameEditPart(view);

			case NumericPropertyEditPart.VISUAL_ID:
				return new NumericPropertyEditPart(view);

			case NumericPropertyNameEditPart.VISUAL_ID:
				return new NumericPropertyNameEditPart(view);

			case EnumPropertyEditPart.VISUAL_ID:
				return new EnumPropertyEditPart(view);

			case EnumPropertyNameEditPart.VISUAL_ID:
				return new EnumPropertyNameEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
