package componentmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import componentmodel.diagram.providers.ComponentModelElementTypes;

/**
 * @generated
 */
public class InPortDelegatesToItemSemanticEditPolicy extends
		ComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InPortDelegatesToItemSemanticEditPolicy() {
		super(ComponentModelElementTypes.InPortDelegatesTo_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
