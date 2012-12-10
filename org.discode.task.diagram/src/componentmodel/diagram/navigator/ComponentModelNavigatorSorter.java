package componentmodel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import componentmodel.diagram.part.ComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class ComponentModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4007;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ComponentModelNavigatorItem) {
			ComponentModelNavigatorItem item = (ComponentModelNavigatorItem) element;
			return ComponentModelVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
