import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TriangleTester {

  public static boolean helper(int lengthA, int lengthB, int lengthC){
	return !(lengthA + lengthB <= lengthC || lengthB + lengthC <= lengthA || lengthA + lengthC <= lengthB);
  }
/*
  public static int countTrianglesA(String filename){
    Scanner sc = new Scanner(filename);
    int counter = 0;
    while(sc.hasNextLine()) {
      if (helper(sc.nextLine())) {
        counter += 0;
      }
    }
    sc.close(); 
    return counter;
  }*/
}


