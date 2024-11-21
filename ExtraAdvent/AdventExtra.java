import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class AdventExtra{
  public static String reverse(String s){
    String toReturn = "";
    for (int count = s.length() - 1; count >= 0; count--){
      toReturn += s.charAt(count);
    }
	return toReturn;
  }
  public static boolean daySevenHelper(String toRead){
	  boolean truthValue = false;
	  String checker = "";
	  for (int count = 0; count < toRead.length(); count++){
		  if (truthValue){
			  if (toRead.substring(count, count + 1).equals("]")){
				  for (int innerCount = 0; innerCount <= checker.length() - 4; innerCount++){
					  if (checker.substring(innerCount, innerCount + 4).equals(reverse(checker.substring(innerCount, innerCount+4))) 
			&& !checker.substring(innerCount, innerCount+1).equals(checker.substring(innerCount+1,innerCount+2))){
						  return false;
					  }
				  }
				  checker = "";
				  truthValue = false;
			  }
			  else{
				  checker += toRead.substring(count, count + 1);
			  }
		  }
		  else{
			  if (toRead.substring(count, count + 1).equals("[")){
				  truthValue = true;
			  }
		  }
	  }
	  
	for (int count = 0; count <= toRead.length() - 4; count++){
		if (toRead.substring(count, count + 4).equals(reverse(toRead.substring(count, count+4))) 
			&& !toRead.substring(count, count+1).equals(toRead.substring(count+1,count+2))){
				return true;
			}
	}
      return false;
    
  }
  
  public static int daySeven(String filename){
	  try{
		  int toReturn = 0;
		  File file = new File("input.txt");
		  Scanner input = new Scanner(file);
		  while (input.hasNextLine()){
			  if (daySevenHelper(input.nextLine())){
				  toReturn++;
			  }
		  }
		  return toReturn;
	  }catch (FileNotFoundException e) {
    //File not found what should you do?
    System.out.println("File not found");
     return 10;
  }
  }
  
  public static boolean daySevenHelperB(String toRead){
	  boolean truthValue = false;
	  String checker = "";
	  String brackets = "";
	  String outsideBrackets = "";
	  for (int count = 0; count < toRead.length(); count++){
		  if (truthValue){
			  if (toRead.substring(count, count + 1).equals("]")){
				  for (int innerCount = 0; innerCount <= checker.length() - 3; innerCount++){
					  if (checker.substring(innerCount, innerCount + 3).equals(reverse(checker.substring(innerCount, innerCount+3))) 
			&& !checker.substring(innerCount, innerCount+1).equals(checker.substring(innerCount+1,innerCount+2))){
						  brackets += checker.substring(innerCount, innerCount+3) + " ";
					  }
				  }
				  checker = "";
				  truthValue = false;
			  }
			  else{
				  checker += toRead.substring(count, count + 1);
			  }
		  }
		  else{
			  if (toRead.substring(count, count + 1).equals("[")){
				  truthValue = true;
			  }
		  }
	  }
	  truthValue = false;
	for (int count = 0; count < toRead.length() - 3; count++){
	
		if (truthValue && toRead.substring(count, count + 3).equals(reverse(toRead.substring(count, count+3))) 
			&& !toRead.substring(count, count+1).equals(toRead.substring(count+1,count+2))){
			outsideBrackets += toRead.charAt(count + 1) + toRead.charAt(count) + toRead.charAt(count+1) + " ";
		}
		
	}
     for (int count = 0; count < outsideBrackets.length(); count += 4){
		 if (brackets.contains(outsideBrackets.substring(count, count +4))){
			 return true;
		 }
	 }
	 return false;
    
  }
  public static int daySevenB(String filename){
	  try{
		  int toReturn = 0;
		  File file = new File("input.txt");
		  Scanner input = new Scanner(file);
		  while (input.hasNextLine()){
			  if (daySevenHelperB(input.nextLine())){
				  toReturn++;
			  }
		  }
		  return toReturn;
	  }catch (FileNotFoundException e) {
    //File not found what should you do?
    System.out.println("File not found");
     return 10;
  }
  }
  
  public static void main(String[] args){
	  System.out.println(daySevenB("input.txt"));
  }
}
  
  

