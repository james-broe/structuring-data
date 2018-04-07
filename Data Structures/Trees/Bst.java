import java.util.*;

public class Bst {

  class Node {
    int data;
    Node parent;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      parent = null;
      left = null;
      right = null;
    }
  }


  public static Node root;

  public Bst() {
    this.root = null;
  }

  public void addHelper()

  public void add(int value) {
    Node current = root;
    if (current == null) {
      root = new Node(value);
      return;
    }
    if (value < current.value) {
      if (current.left == null) {
        current.left = new Node(value);
        current.left.parent = current;
        return;
      }
      current.left.add(value);
      return;
    }
    if (value > this.value) {
      if (current.right == null) {
        current.right = new Node(value);
        current.right.parent = current;
        return;
      }
      this.right.add(value);
      return;
    }
  }

  public int remove(int value) {
    Node current = root;
    if (current.value == value) {
      Node returnNode = current;
      current = null;
      return returnNode;
    }
    if (current == null) {
      return null;
    }
    if (value < current.value) {
      if (current.left == null) {
        return null;
      }
      current.left.remove(value);
      return;
    }
    if (value > current.value) {
      if (current.right == null) {
        current.right = new Bst();
        current.right.value = value;
        return;
      }
      current.right.add(value);
      return;
    }
  }

  public static void main(String[] args) {
    Bst meme = new Bst();
    meme.add(2);
    meme.add(3);
    meme.add(49);
    System.out.println(meme.remove(3));
    System.out.println(meme.remove(49));
    System.out.println(meme.remove(2));
  }
}
