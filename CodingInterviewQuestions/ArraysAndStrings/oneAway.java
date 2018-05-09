import java.util.*;
import java.lang.Math;

// One Away: There are three types of edits that can be performed on strings:
// insert a character, remove a character, or replace a character. Given two
// strings, write a function to check if they are one edit (or zero edits) away.

// EXAMPLE
// pale, ple -> true
// pales, pale -> true
// pale, bale -> true
// pale, bake -> false

public class oneAway {

  public static void main(String[] args) {
    System.out.println(oneAway("pale", "bake"));
  }

  public static boolean oneAway(String s1, String s2) {

    // First incorrect thought: I assume we are going to have to go through the
    // strings 3 times, to check for each of the 3 different types of edits. This
    // is constant times so is fine.
    // Coming to senses: Actually no, we only need to check if all characters
    // but 1 are the same. Which can be checked within 2 if statements in O(n)

    // Replacement case
    if (s1.length() == s2.length() ) {
      int diffCount = 0;
      for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i) != s2.charAt(i)) {
          diffCount++;
          if (diffCount > 1) {
            return false;
          }
        }
      }
      return true;
    } else if (Math.abs(s1.length() - s2.length()) <= 1) { // insertion/deletion are essentially the same
      int diffCount = 0;
      int i = 0; // Counter for s1
      int j = 0; // Counter for s2
      while (i < s1.length() && j < s2.length()) {
        System.out.println(s1.charAt(i));
        System.out.println(s2.charAt(j));
        // pales, pale -> true
        if (s1.charAt(i) != s2.charAt(j)) {
          diffCount++;
          if (s1.charAt(i + 1) == s2.charAt(j)) {
            j--;
          } else if (s1.charAt(i) == s2.charAt(j + 1)) {
            i--;
          } else {
            return false;
          }
          if (diffCount > 1) {
            return false;
          }
        }
        j++;
        i++;
      }
      return true;
    } else {
      return false;
    }
  }
}
