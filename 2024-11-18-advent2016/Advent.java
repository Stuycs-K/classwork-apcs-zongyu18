import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Advent{
  public static int dayOne(String fileName){
    int counter = 360;
    int direction = 0;
    int horizontal = 0;
    int vertical = 0;
	int indexMath = 0;
    try{
      File file = new File("input.txt");
      Scanner input = new Scanner(file);
	while (input.hasNext()){
        direction += 360;
        String value = input.next();
        if (value.substring(0, 1).equals("L")){
          direction -= 90;
        }
        else{
          direction += 90;
        }
        direction %= 360;
		String toAdd = value.substring(1, value.length() - 1);
		if (!value.contains(",")){
			toAdd = value.substring(1);
		}
        if (direction == 0){
          vertical += Integer.parseInt(toAdd);
        }
        else if (direction == 90){
          horizontal += Integer.parseInt(toAdd);
        }
        else if (direction == 180){
          vertical -= Integer.parseInt(toAdd);
        }
        else{
          horizontal -= Integer.parseInt(toAdd);
        }
      }
	return horizontal + vertical;

    } catch (FileNotFoundException e) {
      //File not found what should you do?
      System.out.println("File not found");
	     return 0;
    }
  }
  
  public static int dayOneB(String fileName){
	  int counter = 360;
    int direction = 0;
    int horizontal = 0;
    int vertical = 0;
    try{
      File file = new File("input.txt");
      Scanner input = new Scanner(file);
	 ArrayList<Integer> horizontalContainer = new ArrayList<Integer>(30);
	 ArrayList<Integer> verticalContainer = new ArrayList<Integer>(30);
	while (input.hasNext()){
		
        direction += 360;
        String value = input.next();
        if (value.substring(0, 1).equals("L")){
          direction -= 90;
        }
        else{
          direction += 90;
        }
        direction %= 360;
		String toAdd = value.substring(1, value.length() - 1);
		if (!value.contains(",")){
			toAdd = value.substring(1);
		}
        if (direction == 0){
		  for (int count = 0; count < Integer.parseInt(toAdd); count++){
			  vertical++;
			  horizontalContainer.add(horizontal);
			  verticalContainer.add(vertical);
			  for (int countInner = 0; countInner < horizontalContainer.size() - 1; countInner++){
				if (horizontal == horizontalContainer.get(countInner) && vertical == verticalContainer.get(countInner)){
					return horizontal + vertical;
				}
			}
		  }
        }
        else if (direction == 90){
			for (int count = 0; count < Integer.parseInt(toAdd); count++){
			  horizontal++;
			  horizontalContainer.add(horizontal);
			  verticalContainer.add(vertical);
			  for (int countInner = 0; countInner < horizontalContainer.size() - 1; countInner++){
				if (horizontal == horizontalContainer.get(countInner) && vertical == verticalContainer.get(countInner)){
					return horizontal + vertical;
				}
			}
		  }
        }
        else if (direction == 180){
			for (int count = 0; count < Integer.parseInt(toAdd); count++){
			  vertical--;
			  horizontalContainer.add(horizontal);
			  verticalContainer.add(vertical);
			  for (int countInner = 0; countInner < horizontalContainer.size() - 1; countInner++){
				if (horizontal == horizontalContainer.get(countInner) && vertical == verticalContainer.get(countInner)){
					return horizontal + vertical;
				}
			}
		  }
        }
        else{
			for (int count = 0; count < Integer.parseInt(toAdd); count++){
			  horizontal--;
			  horizontalContainer.add(horizontal);
			  verticalContainer.add(vertical);
			  for (int countInner = 0; countInner < horizontalContainer.size() - 1; countInner++){
				if (horizontal == horizontalContainer.get(countInner) && vertical == verticalContainer.get(countInner)){
					return horizontal + vertical;
				}
			}
		  }
        }
		
		
		
	
      }return 100;

    } catch (FileNotFoundException e) {
      //File not found what should you do?
      System.out.println("File not found");
	     return 0;
    }
  }
  
  public static String dayTwo(String fileName){
    try{
      File file = new File("input.txt");
      Scanner input = new Scanner(file);
	  int button = 5;
	  String output = "";
	while (input.hasNextLine()){
        String value = input.nextLine();
		for (int count = 0; count < value.length(); count++){
			if (value.substring(count, count + 1).equals("U") && button > 3){
				button -= 3;
			}
			else if (value.substring(count, count+1).equals("L") && (button % 3 != 1)){
				button -= 1;
			}
			else if (value.substring(count, count+1).equals("R") && (button % 3 != 0)){
				button += 1;
			}
			else if (value.substring(count, count+1).equals("D") && (button < 7)){
				button += 3;
			}
		}
		output += button;

    }
	return output;
	}	catch (FileNotFoundException e) {
      //File not found what should you do?
      System.out.println("File not found");
	     return "fail";
    }
  }
  
  public static String dayTwoB(String fileName){
    try{
      File file = new File("input.txt");
      Scanner input = new Scanner(file);
	  int buttonHorizontal = 3;
	  int buttonVertical = 1;
	  String output = "";
	while (input.hasNextLine()){
        String value = input.nextLine();
		for (int count = 0; count < value.length(); count++){
			if (value.substring(count, count+1).equals("U")){
				if (buttonVertical != 1 && buttonVertical != 5 && buttonHorizontal != 1 && 
					!(buttonHorizontal == 2 && (buttonVertical == 2 || buttonVertical == 4))){
						buttonHorizontal--;
					}
			}
			if (value.substring(count, count+1).equals("D")){
				if (buttonVertical != 1 && buttonVertical != 5 && buttonHorizontal != 5 && 
					!(buttonHorizontal == 4 && (buttonVertical == 2 || buttonVertical == 4))){
						buttonHorizontal++;
					}
			}
			if (value.substring(count, count+1).equals("L")){
				if (buttonHorizontal != 1 && buttonHorizontal != 5 && buttonVertical != 1 && 
					!(buttonVertical == 2 && (buttonHorizontal == 2 || buttonHorizontal == 4))){
						buttonVertical--;
					}
			}
			if (value.substring(count, count+1).equals("R")){
				if (buttonHorizontal != 1 && buttonHorizontal != 5 && buttonVertical != 5 && 
					!(buttonVertical == 4 && (buttonHorizontal == 2 || buttonHorizontal == 4))){
						buttonVertical++;
					}
			}
		}
		if (buttonHorizontal == 1){
			output += 1;
		}
		else if (buttonHorizontal == 2){
			output += buttonVertical;
		}
		else if (buttonHorizontal == 3){
			output += (buttonVertical + 4);
		}
		else if (buttonHorizontal == 4){
			if (buttonVertical == 2){
				output += "A";
			}
			else if (buttonVertical == 3){
				output += "B";
			}
			else{
				output += "C";
			}
		}
		else if (buttonHorizontal == 5){
			output += "D";
		}

    }
	return output;
	}	catch (FileNotFoundException e) {
      //File not found what should you do?
      System.out.println("File not found");
	     return "fail";
    }
  }

  public static void main(String[] args){
    //System.out.println(dayOne("input.txt"));
	System.out.println(dayTwoB("input.txt"));
  }
}
