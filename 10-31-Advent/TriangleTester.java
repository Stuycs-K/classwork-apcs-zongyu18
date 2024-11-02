import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TriangleTester {

  public static boolean helper(int lengthA, int lengthB, int lengthC){
	return !(lengthA + lengthB <= lengthC || lengthB + lengthC <= lengthA || lengthA + lengthC <= lengthB);
  }

  public static int countTrianglesA(String filename) throws FileNotFoundException
  {
	int counter = 0;
    //2 Opening a file requires a try/catch
    try {
      File file = new File("inputTri.txt");//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
    }
	File file = new File("inputTri.txt");//1
    Scanner input = new Scanner(file);
	String lengthSet;
	String[] lengthArray = new String[3];
	while (input.hasNextLine()){
		lengthSet = input.nextLine();
		lengthArray = lengthSet.split(" ");
		if (helper(Integer.parseInt(lengthArray[0]), Integer.parseInt(lengthArray[1]), Integer.parseInt(lengthArray[2]))){
			counter++;
		} 
	}
    return counter;
  }
}


