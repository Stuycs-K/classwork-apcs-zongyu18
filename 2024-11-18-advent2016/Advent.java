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

  public static void main(String[] args){
    //System.out.println(dayOne("input.txt"));
	System.out.println(dayOneB("input.txt"));
  }
}
