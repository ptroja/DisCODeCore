package componentmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import componentmodel.diagram.providers.ComponentModelElementTypes;

/**
 * @generated
 */
public class OutPortSinkItemSemanticEditPolicy extends
		ComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OutPortSinkItemSemanticEditPolicy() {
		super(ComponentModelElementTypes.OutPortSink_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
