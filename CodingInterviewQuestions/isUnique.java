// Is Unique: Implement an algorithm to determine if a string has all unique
// characters. What if you cannot use additional data structures?
import java.util.*;

public class isUnique {

  public static void main(String[] args) {

    // Brute force solution: check every char against every other char => O(n^2)

    // Sorting solution: Sort the char array in O(nlogn) time, go through array
    // in O(n) checking consecutive chars. => O(nlogn)

    // Binary array solution: there are a limited number of chars, create an
    // array the same size as the max ascii/unicode value and check if a value
    // is turned on twice. => O(n)

    // TODO: Sorting solution.

    Scanner in = new Scanner(System.in);

    char[] charArray = in.nextLine().toCharArray();

    if (charArray.length == 0) {
      System.out.println("true");
      return;
    }

    Arrays.sort(charArray);

    char prev = charArray[0];

    for (int i = 1; i < charArray.length; i++) {
      if (charArray[i] == prev) {
        System.out.println("false");
        return;
      }
      prev = charArray[i];
    }

    System.out.println("true");

  }

}
