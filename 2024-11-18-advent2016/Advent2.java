import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Advent2{
  public static String daySixHelper(String fileName, int index){
  try{
    int toReturnHelp = 0;
	int tracker = 0;
    File file = new File("input.txt");
    Scanner input = new Scanner(file);
    int[] alphabet = new int[26];
    while (input.hasNextLine()){
      String line = input.nextLine();
      alphabet[line.charAt(index) - 97] += 1;
    }
    for (int count = 0; count < 26; count++){
      if (alphabet[count] > toReturnHelp){
        toReturnHelp = alphabet[count];
		tracker = count;
      }
    }
    return "" + (char)(tracker+97);
  }
  catch (FileNotFoundException e) {
    //File not found what should you do?
    System.out.println("File not found");
     return "fail";
  }
}

public static String daySix(String fileName){
  try{
    File file = new File("input.txt");
	String toReturn = "";
    Scanner input = new Scanner(file);
    for (int count = 0; count < input.nextLine().length(); count++){
		toReturn += daySixHelper(fileName, count);
	}
	return toReturn;
  }
  catch (FileNotFoundException e) {
    //File not found what should you do?
    System.out.println("File not found");
     return "fail";
  }
}

public static String daySixHelperB(String fileName, int index){
  try{
    int toReturnHelp = 10000;
	int tracker = 0;
    File file = new File("input.txt");
    Scanner input = new Scanner(file);
    int[] alphabet = new int[26];
    while (input.hasNextLine()){
      String line = input.nextLine();
      alphabet[line.charAt(index) - 97] += 1;
    }
    for (int count = 0; count < 26; count++){
      if (alphabet[count] < toReturnHelp && alphabet[count] != 0){
        toReturnHelp = alphabet[count];
		tracker = count;
      }
    }
    return "" + (char)(tracker+97);
  }
  catch (FileNotFoundException e) {
    //File not found what should you do?
    System.out.println("File not found");
     return "fail";
  }
}

public static String daySixB(String fileName){
  try{
    File file = new File("input.txt");
	String toReturn = "";
    Scanner input = new Scanner(file);
    for (int count = 0; count < input.nextLine().length(); count++){
		toReturn += daySixHelperB(fileName, count);
	}
	return toReturn;
  }
  catch (FileNotFoundException e) {
    //File not found what should you do?
    System.out.println("File not found");
     return "fail";
  }
}
	
  public static void main(String[] args){
    System.out.println(daySixB("input.txt"));
  }
}