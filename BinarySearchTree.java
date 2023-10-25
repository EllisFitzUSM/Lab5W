public abstract class BinarySearchTree {
  class Node<E>() {
    E data;
    parent Node<E>;
    left Node<E>;
    right Node<E>;

    public Node<E>(E data) {
      this.data = data;
    }
  }
  
  public int data;
  public int size;
  public Node<E> root;

  public abstract boolean add(int data);

  public int getSize();
}
