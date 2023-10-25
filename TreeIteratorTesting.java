
public class TreeIteratorTesting {
	
	public int[] testArray;

	public TreeIteratorTesting(BinarySearchTree bst, TreeIterator treeItr) {
		bst.add(10);
		bst.add(5);
		bst.add(12);
		bst.add(15);
		bst.add(7);
		bst.add(11);
		bst.add(0);
		
		testArray = treeIter.SequenceArray(bst)
		checkOrder();
	}
	
	public boolean checkOrder() {
		int[] check = {0, 5, 7, 10, 11, 12, 15};
		for (int i = 0; i < testArray.length; i++) {
			if (testArray[i]!=check[i]) {
				return false;
			}
		}
		return true;
		
	}
}
