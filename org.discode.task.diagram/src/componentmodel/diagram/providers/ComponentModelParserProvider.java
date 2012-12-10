package componentmodel.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import componentmodel.ComponentmodelPackage;
import componentmodel.diagram.edit.parts.CompositeComponentNameEditPart;
import componentmodel.diagram.edit.parts.InPortName2EditPart;
import componentmodel.diagram.edit.parts.InPortName3EditPart;
import componentmodel.diagram.edit.parts.InPortNameEditPart;
import componentmodel.diagram.edit.parts.OutPortName2EditPart;
import componentmodel.diagram.edit.parts.OutPortName3EditPart;
import componentmodel.diagram.edit.parts.OutPortNameEditPart;
import componentmodel.diagram.edit.parts.PrimitiveComponentNameEditPart;
import componentmodel.diagram.parsers.MessageFormatParser;
import componentmodel.diagram.part.ComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class ComponentModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser compositeComponentName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeComponentName_5001Parser() {
		if (compositeComponentName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentmodelPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeComponentName_5001Parser = parser;
		}
		return compositeComponentName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveComponentName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveComponentName_5002Parser() {
		if (primitiveComponentName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentmodelPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			primitiveComponentName_5002Parser = parser;
		}
		return primitiveComponentName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser outPortName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getOutPortName_5005Parser() {
		if (outPortName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentmodelPackage.eINSTANCE
					.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outPortName_5005Parser = parser;
		}
		return outPortName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser inPortName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getInPortName_5006Parser() {
		if (inPortName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentmodelPackage.eINSTANCE
					.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inPortName_5006Parser = parser;
		}
		return inPortName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser inPortName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getInPortName_5003Parser() {
		if (inPortName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentmodelPackage.eINSTANCE
					.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inPortName_5003Parser = parser;
		}
		return inPortName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser outPortName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getOutPortName_5004Parser() {
		if (outPortName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentmodelPackage.eINSTANCE
					.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outPortName_5004Parser = parser;
		}
		return outPortName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser inPortName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getInPortName_5007Parser() {
		if (inPortName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentmodelPackage.eINSTANCE
					.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inPortName_5007Parser = parser;
		}
		return inPortName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser outPortName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getOutPortName_5008Parser() {
		if (outPortName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentmodelPackage.eINSTANCE
					.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outPortName_5008Parser = parser;
		}
		return outPortName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CompositeComponentNameEditPart.VISUAL_ID:
			return getCompositeComponentName_5001Parser();
		case PrimitiveComponentNameEditPart.VISUAL_ID:
			return getPrimitiveComponentName_5002Parser();
		case OutPortNameEditPart.VISUAL_ID:
			return getOutPortName_5005Parser();
		case InPortNameEditPart.VISUAL_ID:
			return getInPortName_5006Parser();
		case InPortName2EditPart.VISUAL_ID:
			return getInPortName_5003Parser();
		case OutPortName2EditPart.VISUAL_ID:
			return getOutPortName_5004Parser();
		case InPortName3EditPart.VISUAL_ID:
			return getInPortName_5007Parser();
		case OutPortName3EditPart.VISUAL_ID:
			return getOutPortName_5008Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ComponentModelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ComponentModelVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ComponentModelElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
