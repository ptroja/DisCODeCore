package primitivecomponentmodel.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import primitivecomponentmodel.diagram.edit.commands.EnumPropertyCreateCommand;
import primitivecomponentmodel.diagram.edit.commands.InPortCreateCommand;
import primitivecomponentmodel.diagram.edit.commands.NumericPropertyCreateCommand;
import primitivecomponentmodel.diagram.edit.commands.OutPortCreateCommand;
import primitivecomponentmodel.diagram.providers.ComponentModelElementTypes;

/**
 * @generated
 */
public class PrimitiveComponentItemSemanticEditPolicy extends
		ComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PrimitiveComponentItemSemanticEditPolicy() {
		super(ComponentModelElementTypes.PrimitiveComponent_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentModelElementTypes.InPort_2001 == req.getElementType()) {
			return getGEFWrapper(new InPortCreateCommand(req));
		}
		if (ComponentModelElementTypes.OutPort_2002 == req.getElementType()) {
			return getGEFWrapper(new OutPortCreateCommand(req));
		}
		if (ComponentModelElementTypes.NumericProperty_2003 == req
				.getElementType()) {
			return getGEFWrapper(new NumericPropertyCreateCommand(req));
		}
		if (ComponentModelElementTypes.EnumProperty_2004 == req
				.getElementType()) {
			return getGEFWrapper(new EnumPropertyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
