/**
 * A testing class to test adding items to a binary search tree
 * and sequencing the array of the binary search tree
 * @author Madalyn Amero
 *
 */
public class TreeIteratorTesting {
	
	public int[] testArray;

	/**
	 * Constructor method to create a binary search tree and utilize a tree iterator
	 * to create our test array from the binary search tree
	 * @param bst the binary search tree to be used
	 * @param treeItr the tree iterator to be used
	 */
	public TreeIteratorTesting(BinarySearchTree bst, TreeIterator treeItr) {
		bst.add(10);
		bst.add(5);
		bst.add(12);
		bst.add(15);
		bst.add(7);
		bst.add(11);
		bst.add(0);
		bst.add(1);
		bst.add(-5);
		bst.add(-100);
		
		testArray = treeIter.SequenceArray(bst);
		checkOrder();
	}
	
	/**
	 * Checks if the returned order of the array is correct or not
	 * @return true if the order of the array is true and false if the order of the array is incorrect
	 */
	public boolean checkOrder() {
		int[] check = {-100, -5, 0, 1, 5, 7, 10, 11, 12, 15};
		for (int i = 0; i < testArray.length; i++) {
			if (testArray[i]!=check[i]) {
				return false;
			}
		}
		return true;
		
	}
}
