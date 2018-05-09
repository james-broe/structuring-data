import java.util.*;
import java.lang.Math;

// String Compression: Implement a method to perform basic string compression using the
// counts of repeated characters. For example, the string aabcccccaaa would become
// a2blc5a3. If the "compressed" string would not become smaller than the original string,
// your method should return the original string. You can assume the string has only
// uppercase and lowercase letters (a - z).


public class stringCompression {

  public static void main(String[] args) {
    System.out.println(stringCompression("paaaaleemll"));
  }

  public static String stringCompression(String s) {

    StringBuilder compressed = new StringBuilder();

    int charCount = 0;
    for (int i = 0; i < s.length(); i++) {
      if ( i + 1 != s.length() ) {
        if (s.charAt(i) == s.charAt(i+1)) {
          charCount++;
        }
      }
      if ( i + 1 == s.length() || s.charAt(i) != s.charAt(i+1)) {
        compressed.append(s.charAt(i));
        compressed.append(charCount);
        charCount = 1;
      }
    }
    // return compressed.length() < s.length() ? compressed.toString() : s;
    return compressed.toString().length() == s.length() ? s : compressed.toString();
  }
}
