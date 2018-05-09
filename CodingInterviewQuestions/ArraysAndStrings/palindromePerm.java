import java.util.*;

// Palindrome Permutation: Given a string, write a function to check if it is a
// permutation of a palindrome. A palindrome is a word or phrase that is the same
// forwards and backwards. A permutation is a rearrangement of letters. The
// palindrome does not need to be limited to just dictionary words.
//
// EXAMPLE
// Input: Tact Coa
// Output: True (permutations: "taco cat", "atco eta", etc.)

public class palindromePerm {

  public static void main(String[] args) {
    System.out.println(palindromePerm("racecare"));
  }

  // What is a permutation of a palindrome? A palindrome always has: an even
  // number of each letter, possibly except for letter/s in the middle. So this
  // could be solved by counting the occurence of each letter and making sure
  // all, if not, all but 1, have even numbers.

  public static boolean palindromePerm(String s) {

    if (s == null || s.length() == 0) {
      return true;
    }
    s = s.toLowerCase();

    int[] ascii = new int[128];

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        continue;
      } else {
        ascii[(int) s.charAt(i)]++;
      }

    }

    int oddCount = 0;

    for (int j : ascii) {
      if (j%2 != 0) {
        oddCount++;
        if (oddCount > 1) {
          return false;
        }
      }
    }
    return true;
  }

}
