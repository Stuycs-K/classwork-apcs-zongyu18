import java.io.*;
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

public static int dayFour(String fileName){
  try{
	  int toReturnFinal = 0;
    
	
    File file = new File("input.txt");
    Scanner input = new Scanner(file);
    
	
    while (input.hasNextLine()){
		int[] alphabet = new int[26];
		String trackerString = "";
      String line = input.nextLine();
      String[] lineArray = line.split("-");
	  for (int count = 0; count < lineArray.length - 1; count++){
		  String currString = lineArray[count];
		  for (int innerCount = 0; innerCount < currString.length(); innerCount++){
			  alphabet[currString.charAt(innerCount) - 97] += 1;
		  }
	  }
    String toReturn = "";
	for (int firstCount = 0; firstCount < 5; firstCount++){
		int toReturnHelp = 0;
		int tracker = 0;
		for (int count = 25; count >= 0; count--){
			
		  if (alphabet[count] >= toReturnHelp && !toReturn.contains("" + (char)(97+ count))){
			toReturnHelp = alphabet[count];
			tracker = count;
		  }
		}
		toReturn += (char)(tracker+97);
	}
	
	String keyValue = lineArray[lineArray.length - 1];
	
	if (keyValue.substring(4,9).equals(toReturn)){
		toReturnFinal += Integer.parseInt(keyValue.substring(0,3));
	}
  }
  return toReturnFinal;
  }
  catch (FileNotFoundException e) {
    //File not found what should you do?
    System.out.println("File not found");
     return 0;
  }
}
public static String cipher(String s, int shift){
	s = s.toLowerCase();
	shift = shift % 26;
	String toReturn = "";
	for (int count = 0; count < s.length(); count++){
		toReturn += ("" + (char)((s.charAt(count) - 97 + shift) % 27 + 97));
	}
	return toReturn;
}
/*
public static int dayFourB(String fileName){
  try{
	  int toReturnFinal = 0;
    File file = new File("input.txt");
    Scanner input = new Scanner(file);*/


  public static void main(String[] args){
    System.out.println(cipher("hi", 1));
  }
}