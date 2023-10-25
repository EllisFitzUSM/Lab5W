/**
 * Lab5W - Testing class 
 * @author Ellis Fitzgerald
 * @version 25 October 2023
 *
 */
public class lab5 {
    /**
     * main - Tests Lab5W contents
     * @param args
     */
    public static void main(String[] args) {
        myBinarySearchTree bst = new myBinarySearchTree();
        myTreeIterator treeIter = new myTreeIterator();
        TreeIteratorTesting tester = new TreeIteratorTesting(bst, treeIter);

        int sum = 0;
        for(int i : treeIter.sequenceArray(bst)) {
            sum += i;
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / treeIter.sequenceArray(bst));
        System.out.println("Is order correct?: " tester.checkOrder());
        
    }
}
