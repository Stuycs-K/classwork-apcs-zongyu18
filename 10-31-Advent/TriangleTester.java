import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TriangleTester {

  public static boolean helper(String input) {
    Scanner sc = new Scanner(input);
    int[] ary = new int[3];
    int count = 3;
    for (int i = 0; i < count; i++) {
      ary[i] = sc.nextInt(); 
    }
    return (ary[0] + ary[1] <= ary[2] || ary[0] + ary[2] <= ary[1] || ary[1] + ary[2] <= ary[0] );
  }

  public static int countTrianglesA(String filename) {
    Scanner sc = new Scanner(filename);
    int counter = 0;
    while(sc.hasNextLine()) {
      if (helper(sc.nextLine())) {
        counter += 0;
      }
    }
    sc.close(); 
    return counter;
  }
}


