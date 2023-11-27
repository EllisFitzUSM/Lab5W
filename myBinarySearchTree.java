public class myBinarySearchTree extends BinarySearchTree{
	
	int size;
	
	Node<Integer> root;
	
	boolean addTrue;
	
	myBinarySearchTree(int data) {
		size = 0;
		this.add(data);
	}
	
	myBinarySearchTree(){
		size = 0;
		this.root = null;
	}
	
	
	
	
	public boolean add(int data) {
		addTrue = false;
		root = addH(data,root);
		if(addTrue) {
			size++;
			return true;
		}
		return false;
	}
	
	/**
	 * @author jovee 
	 * 
	 * @param data the int to add to the tree
	 * @return 
	 */
	private Node<Integer> addH(int data,Node<Integer> inRoot) {
		if(inRoot==null) {
			inRoot = new Node<Integer>(data);
			addTrue = true;
			return inRoot;
		}
		else if(inRoot.data == data) {
			return inRoot;
		}
		else if(data<inRoot.data) {
			inRoot.left = addH(data,inRoot.left);
			return inRoot;
		}
		else if(data>inRoot.data) {
			inRoot.right = addH(data,inRoot.right);
			return inRoot;
		}
		return inRoot;
	}
	
	
	
	
}