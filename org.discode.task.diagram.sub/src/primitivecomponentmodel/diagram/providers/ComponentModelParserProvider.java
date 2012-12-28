package primitivecomponentmodel.diagram.providers;

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

import primitivecomponentmodel.diagram.edit.parts.EnumPropertyNameEditPart;
import primitivecomponentmodel.diagram.edit.parts.InPortNameEditPart;
import primitivecomponentmodel.diagram.edit.parts.NumericPropertyNameEditPart;
import primitivecomponentmodel.diagram.edit.parts.OutPortNameEditPart;
import primitivecomponentmodel.diagram.parsers.MessageFormatParser;
import primitivecomponentmodel.diagram.part.ComponentModelVisualIDRegistry;

import componentmodel.ComponentmodelPackage;

/**
 * @generated
 */
public class ComponentModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser inPortName_5102Parser;

	/**
	 * @generated
	 */
	private IParser getInPortName_5102Parser() {
		if (inPortName_5102Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentmodelPackage.eINSTANCE
					.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inPortName_5102Parser = parser;
		}
		return inPortName_5102Parser;
	}

	/**
	 * @generated
	 */
	private IParser outPortName_5103Parser;

	/**
	 * @generated
	 */
	private IParser getOutPortName_5103Parser() {
		if (outPortName_5103Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentmodelPackage.eINSTANCE
					.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outPortName_5103Parser = parser;
		}
		return outPortName_5103Parser;
	}

	/**
	 * @generated
	 */
	private IParser numericPropertyName_5104Parser;

	/**
	 * @generated
	 */
	private IParser getNumericPropertyName_5104Parser() {
		if (numericPropertyName_5104Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentmodelPackage.eINSTANCE
					.getProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			numericPropertyName_5104Parser = parser;
		}
		return numericPropertyName_5104Parser;
	}

	/**
	 * @generated
	 */
	private IParser enumPropertyName_5105Parser;

	/**
	 * @generated
	 */
	private IParser getEnumPropertyName_5105Parser() {
		if (enumPropertyName_5105Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentmodelPackage.eINSTANCE
					.getProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumPropertyName_5105Parser = parser;
		}
		return enumPropertyName_5105Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case InPortNameEditPart.VISUAL_ID:
			return getInPortName_5102Parser();
		case OutPortNameEditPart.VISUAL_ID:
			return getOutPortName_5103Parser();
		case NumericPropertyNameEditPart.VISUAL_ID:
			return getNumericPropertyName_5104Parser();
		case EnumPropertyNameEditPart.VISUAL_ID:
			return getEnumPropertyName_5105Parser();
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
