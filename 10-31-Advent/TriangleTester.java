import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TriangleTester {

  public static boolean helper(String input){
	File temp = new File(input);
    Scanner file = new Scanner(temp);
    String[] lengths = new String[3];
    for (int count = 0; count < 3; count++) {
      lengths[count] = file.next(); 
    }
	file.close();
	return true;
  //  return (lengths[0] + lengths[1] <= lengths[2] || lengths[0] + lengths[2] <= lengths[1] || lengths[1] + lengths[2] <= lengths[0] );
  
  }

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
  }
}


