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
	int[] lengthArray = new int[3];
	while (input.hasNextLine()){
		for (int count = 0; count < 3; count++){
			lengthArray[count] = input.nextInt();
		}
		if (helper(lengthArray[0], lengthArray[1], lengthArray[2])){
			counter++;
		}
	}
    return counter;
  }
  
  public static int countTrianglesB(String filename) throws FileNotFoundException
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
	int[] lengthArray = new int[3];
	int[][] lengthArrayDouble = new int[3][3];
	while (input.hasNextLine()){
		for (int firstCount = 0; firstCount < 3; firstCount++){
			for (int count = 0; count < 3; count++){
				lengthArray[count] = input.nextInt();
				for (int innerCount = 0; innerCount < 3; innerCount++){
					lengthArrayDouble[innerCount][count] = lengthArray[innerCount];
				}
			}
		}
		for (int testCount = 0; testCount < 3; testCount++){
			if (helper(lengthArrayDouble[testCount][0], lengthArrayDouble[testCount][1], lengthArrayDouble[testCount][2])){
				counter++;
			}   
		}
	}
    return counter;
	}
  }



