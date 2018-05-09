package node;

public class Node {
  public Node next = null;
  public int data;

  public Node(int d) {
    data = d;
  }

  public void append(int d) {
    Node end = new Node(d);
    Node n = this;
    while(n.next != null) {
      n = n.next;
    }
    n.next = end;
  }

  // Deletes first instance of d
  public void delete(int d) {
    Node n = this;

    if (n.data == d) {
      n = n.next;
      return;
    }

    while (n.next != null) {
      if (n.next.data == d) {
        n.next = n.next.next;
        return;
      }
      n = n.next;
    }
    return;
  }

}
