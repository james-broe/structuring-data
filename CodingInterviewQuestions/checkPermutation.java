import java.util.*;

// Check Permutation: Given two strings, write a method to decide if one is a
// permutation of the other

public class checkPermutation {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    char[] charArray1 = in.nextLine().toCharArray();

    char[] charArray2 = in.nextLine().toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    System.out.println(charArray1);
    System.out.println(charArray2);

    System.out.println(charArray1.equals(charArray2));

    // Could also be implemented with boolean arrays.
  }

}
