package componentmodel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import componentmodel.diagram.part.ComponentModelVisualIDRegistry;

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

			case CompositeComponentEditPart.VISUAL_ID:
				return new CompositeComponentEditPart(view);

			case CompositeComponent2EditPart.VISUAL_ID:
				return new CompositeComponent2EditPart(view);

			case CompositeComponentNameEditPart.VISUAL_ID:
				return new CompositeComponentNameEditPart(view);

			case PrimitiveComponentEditPart.VISUAL_ID:
				return new PrimitiveComponentEditPart(view);

			case PrimitiveComponentNameEditPart.VISUAL_ID:
				return new PrimitiveComponentNameEditPart(view);

			case OutPortEditPart.VISUAL_ID:
				return new OutPortEditPart(view);

			case OutPortNameEditPart.VISUAL_ID:
				return new OutPortNameEditPart(view);

			case InPortEditPart.VISUAL_ID:
				return new InPortEditPart(view);

			case InPortNameEditPart.VISUAL_ID:
				return new InPortNameEditPart(view);

			case InPort2EditPart.VISUAL_ID:
				return new InPort2EditPart(view);

			case InPortName2EditPart.VISUAL_ID:
				return new InPortName2EditPart(view);

			case OutPort2EditPart.VISUAL_ID:
				return new OutPort2EditPart(view);

			case OutPortName2EditPart.VISUAL_ID:
				return new OutPortName2EditPart(view);

			case InPort3EditPart.VISUAL_ID:
				return new InPort3EditPart(view);

			case InPortName3EditPart.VISUAL_ID:
				return new InPortName3EditPart(view);

			case OutPort3EditPart.VISUAL_ID:
				return new OutPort3EditPart(view);

			case OutPortName3EditPart.VISUAL_ID:
				return new OutPortName3EditPart(view);

			case OutPortPropagatesToEditPart.VISUAL_ID:
				return new OutPortPropagatesToEditPart(view);

			case InPortDelegatesToEditPart.VISUAL_ID:
				return new InPortDelegatesToEditPart(view);

			case OutPortSinkEditPart.VISUAL_ID:
				return new OutPortSinkEditPart(view);

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
