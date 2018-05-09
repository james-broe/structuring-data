import node.*;
import java.util.*;

// Write code to remove duplicates from an unsorted linked list.
// FOLLOW UP
// How would you solve this problem if a temporary buffer is not allowed?
// Hints: #9, #40


public class removeDups {

  public static void main(String[] args) {

    Node ll = new Node(2);
    ll.append(3);
    ll.append(5);
    ll.append(-5);
    ll.append(2);

    ll = removeDups(ll);
    printLinkedList(ll);

  }

  public static void printLinkedList(Node ll) {
    while (ll != null) {
      System.out.println(ll.data);
      ll = ll.next;
    }
  }

  public static Node removeDups(Node ll) {

    Node previous = ll;
    Node current = ll.next;

    HashSet<Integer> hs = new HashSet<Integer>();
    hs.add(previous.data);

    while (current != null) {

      if (hs.contains(current.data)) {
        previous.next = current.next;
      } else {
        hs.add(current.data);
        previous = current;
      }

      current = current.next;

    }

    return ll;

  }


}



///
