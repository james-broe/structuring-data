// UNFINISHED!

import java.util.*;
import java.lang.Math;

// Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0,
// its entire row and column are set to 0.

public class zeroMatrix {

  public static void main(String[] args) {
    System.out.println(zeroMatrix({{1,2},{2,3}}));
  }

  public static boolean zeroMatrix(int[][] m) {

    int[] rows = new int[m.length()];
    int[] cols = new int[m[0].length()];

    for (int r = 0; r < m.length(); r++) {
      for (int c = 0; c < m[0].length(); c++) {
        if (m[r][c] == 0)
      }
    }

  }
}
