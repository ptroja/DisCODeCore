package componentmodel.diagram.edit.parts;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import componentmodel.diagram.edit.policies.ComponentModelTextSelectionEditPolicy;
import componentmodel.diagram.edit.policies.OpenPrimitiveDiagramEditPolicy;
import componentmodel.diagram.edit.policies.PrimitiveComponentCanonicalEditPolicy;
import componentmodel.diagram.edit.policies.PrimitiveComponentItemSemanticEditPolicy;
import componentmodel.diagram.part.ComponentModelVisualIDRegistry;

import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @generated
 */
public class PrimitiveComponentEditPart extends AbstractBorderedShapeEditPart {

	protected boolean myaddFixedChild(EditPart childEditPart) {
		/*
		if (childEditPart instanceof RectangleEditPart) {
		        ((RectangleEditPart) childEditPart).setLabel(getPrimaryShape()
		                        .getFigureEffectorLabelFigure());
		        return true;
		}
		 */
		if (childEditPart instanceof InPort2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure());

			IFigure childFigure = ((InPort2EditPart) childEditPart).getFigure();
			Rectangle childBounds = childFigure.getBounds();

			locator.setBorderItemOffset(new Dimension(childBounds.width / 2,
					childBounds.height / 2));

			getBorderedFigure().getBorderItemContainer().add(
					((InPort2EditPart) childEditPart).getFigure(), locator);

			return true;
		}
		if (childEditPart instanceof OutPort2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure());

			IFigure childFigure = ((OutPort2EditPart) childEditPart)
					.getFigure();
			Rectangle childBounds = childFigure.getBounds();

			locator.setBorderItemOffset(new Dimension(childBounds.width / 2,
					childBounds.height / 2));

			getBorderedFigure().getBorderItemContainer().add(
					((OutPort2EditPart) childEditPart).getFigure(), locator);

			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated NOT
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PrimitiveComponentNameEditPart) {
			((PrimitiveComponentNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePrimitiveComponentLabelFigure());
			return true;
		}
		if (childEditPart instanceof InPort3EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);

			IFigure childFigure = ((InPort3EditPart) childEditPart).getFigure();
			Rectangle childBounds = childFigure.getBounds();

			locator.setBorderItemOffset(new Dimension(childBounds.width / 2,
					childBounds.height / 2));

			getBorderedFigure().getBorderItemContainer().add(
					((InPort3EditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof OutPort3EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);

			IFigure childFigure = ((OutPort3EditPart) childEditPart)
					.getFigure();
			Rectangle childBounds = childFigure.getBounds();

			locator.setBorderItemOffset(new Dimension(childBounds.width / 2,
					childBounds.height / 2));

			getBorderedFigure().getBorderItemContainer().add(
					((OutPort3EditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PrimitiveComponentNameEditPart) {
			return true;
		}
		if (childEditPart instanceof InPort3EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((InPort3EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof OutPort3EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((OutPort3EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public PrimitiveComponentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						ComponentModelVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PrimitiveComponentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PrimitiveComponentCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenPrimitiveDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (ComponentModelVisualIDRegistry.getVisualID(childView)) {
				case InPort3EditPart.VISUAL_ID:
				case OutPort3EditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new PrimitiveComponentFigure();
	}

	/**
	 * @generated
	 */
	public PrimitiveComponentFigure getPrimaryShape() {
		return (PrimitiveComponentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ComponentModelVisualIDRegistry
				.getType(PrimitiveComponentNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class PrimitiveComponentFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePrimitiveComponentLabelFigure;

		/**
		 * @generated
		 */
		public PrimitiveComponentFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePrimitiveComponentLabelFigure = new WrappingLabel();

			fFigurePrimitiveComponentLabelFigure.setText("");

			GridData constraintFFigurePrimitiveComponentLabelFigure = new GridData();
			constraintFFigurePrimitiveComponentLabelFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigurePrimitiveComponentLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigurePrimitiveComponentLabelFigure.horizontalIndent = 0;
			constraintFFigurePrimitiveComponentLabelFigure.horizontalSpan = 1;
			constraintFFigurePrimitiveComponentLabelFigure.verticalSpan = 1;
			constraintFFigurePrimitiveComponentLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigurePrimitiveComponentLabelFigure.grabExcessVerticalSpace = true;
			this.add(fFigurePrimitiveComponentLabelFigure,
					constraintFFigurePrimitiveComponentLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePrimitiveComponentLabelFigure() {
			return fFigurePrimitiveComponentLabelFigure;
		}

	}

}
