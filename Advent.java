import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Advent{
  public static int dayOne(String fileName){
    int counter = 360;
    int direction = 0;
    int horizontal = 0;
    int vertical = 0;
    try{
      File file = new File("input.txt");
      Scanner input = new Scanner(file);
      while (input.hasNext()){
        if (input.next().substring(0, 1).equals("L")){
          direction -= 90;
        }
        else{
          direction += 90;
        }
      }
    }
  }
}
