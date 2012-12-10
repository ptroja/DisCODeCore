package componentmodel.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import componentmodel.diagram.edit.commands.CompositeComponentCreateCommand;
import componentmodel.diagram.edit.commands.InPortCreateCommand;
import componentmodel.diagram.edit.commands.OutPortCreateCommand;
import componentmodel.diagram.edit.commands.PrimitiveComponentCreateCommand;
import componentmodel.diagram.providers.ComponentModelElementTypes;

/**
 * @generated
 */
public class CompositeComponentItemSemanticEditPolicy extends
		ComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeComponentItemSemanticEditPolicy() {
		super(ComponentModelElementTypes.CompositeComponent_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentModelElementTypes.CompositeComponent_2001 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeComponentCreateCommand(req));
		}
		if (ComponentModelElementTypes.PrimitiveComponent_2002 == req
				.getElementType()) {
			return getGEFWrapper(new PrimitiveComponentCreateCommand(req));
		}
		if (ComponentModelElementTypes.OutPort_2003 == req.getElementType()) {
			return getGEFWrapper(new OutPortCreateCommand(req));
		}
		if (ComponentModelElementTypes.InPort_2004 == req.getElementType()) {
			return getGEFWrapper(new InPortCreateCommand(req));
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
