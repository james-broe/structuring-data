public class removeDups {

  public static void main(String[] args) {
    System.out.println(removeDups(ll));
  }

  public static LinkedList removeDups(LinkedList ll) {
    // Use a hashtable to track duplicates and delete as you go
    // O(n)

    HashSet<Integer> set = new HashSet<Integer>();

    Node prev = null;
    Node n = ll.head;
    while (n != null) {
      if (set.contains(n.data)) {
        prev.next = n.next;
      } else {
        set.add(n.data);
        prev = n;
      }
      n = n.next;
    }

    return ll;

  }

  public static LinkedList removeDupsNoBuffer(LinkedList ll) {
    // If we have no buffer we have to have a runner
    // O(n^2)

    Node current = ll.head;

    while (current != null) {
      Node runner = current;
      while (runner.next != null) {
        if (runner.next.value == current.value) {
          runner.next = runner.next.next;
        } else {
          runner = runner.next;
        }
      }
      current = current.next;
    }

  }
}
