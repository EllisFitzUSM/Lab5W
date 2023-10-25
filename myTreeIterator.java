/**
 * Takes in a BinarySearchTree, and similar to
 * Sequence Array Tree Iterator approach, fills out
 * the array of integers and returns it.
 * @author Taylor Brookes
 * @version 25 October 2023
 */

public class myTreeIterator implements ITreeIterator {
	/**
	 * the int array to output
	 */
	private int[] intArr = new int[size];
	/**
	 * the current index in the int array
	 */
	private int nextIndex;
	/**
	 * traverses the Binary Search Tree through the
	 * input node (starts at root node)
	 * @param node the current node of the tree
	 * @param array the updated int array to output
	 * @param index the current position in the int
	 * array index
	 * @return the int array index of the binary
	 * search tree
	 */
	private int[] helper(Node<E> node, int[] array, int index) {
		//start at the root
		//go to the left
		//add bottom left to index
		//add parent to index
		//add bottom left (right) to index
		if (node == null)
			return;
		SequenceArray(node.left);
		intArr[nextIndex++] = node.data;
		SequenceArray(node.right);
		return intArr;
	}
	/**
	 * the method to call to create an int array of
	 * the data of each node in the tree
	 * @param bst the input binary search tree
	 * @return the int array of the data of each node
	 */
	@Override
	public int[] SequenceArray(BinarySearchTree bst) {
		return helper(bst.root, intArr, 0);
	}
	

}
