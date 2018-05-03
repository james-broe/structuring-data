import java.util.*;

public class rearrange {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    TreeMap<Integer, ArrayList<String>> tm = new TreeMap<Integer, ArrayList<String>>();

    char j = in.next();

    while (j != "q") {

      int n = (int) j;
      String s = in.nextLine().trim();

      if (tm.get(n) != null) {
        tm.get(n).add(s);
      } else {
        tm.put(n, new ArrayList<String>() {{ add(s); }});
      }

      j = in.next();

    }

    // Looping through a tree map method 1

    Set set = tm.entrySet();

    Iterator i = set.iterator();

    while (i.hasNext()) {
      Map.Entry entry = (Map.Entry) i.next();
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // Looping through a tree map method 2

    // for (Map.Entry<Integer, String> entry : tm.entrySet()) {
    //     System.out.println(entry.getKey() + " " + entry.getValue());
    // }

  }

}
