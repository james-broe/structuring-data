import java.util.*;

// URLify: Write a method to replace all spaces in a string with '%20'. You may
// assume that the string has sufficient space at the end to hold the additional
// characters, and that you are given the "true" length of the string. (Note: If
// implementing in Java, please use a character array so that you can perform this
// operation in place.)

// EXAMPLE
// Input: "Mr John Smith ", 13
// Output: "Mr%20John%20Smith"

public class urlify {

  public static void main(String[] args) {
    System.out.println(urlify("My name is James      ", 16));
  }

  public static String urlify(String s, int n) {

    char[] charArray = s.toCharArray();
    int length = charArray.length;

    int index = length - 1;

    for (int i = 0; i < n; i++) {
      if (charArray[n - 1 - i] == ' ') {
        charArray[index--] = '0';
        charArray[index--] = '2';
        charArray[index--] = '%';
      } else {
        charArray[index--] = charArray[n - 1 - i];
      }
      // System.out.println(new String(charArray));
    }

    return(new String(charArray));

  }

}
