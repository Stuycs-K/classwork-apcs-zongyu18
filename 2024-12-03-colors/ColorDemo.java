import java.util.Scanner;

public class ColorDemo{
  public static void main(String args[]){
    System.out.print("\u001b[31m");
    System.out.println("This color is red");
    System.out.print("\u001b[32m");
    System.out.println("This color is green");
    System.out.print("\u001b[93m");
    System.out.println("This color is bright yellow");
    System.out.print("\u001b[30m");
    System.out.print("\u001b[44m");
    System.out.print("This background color is blue");
    System.out.println("\u001b[0m");
    System.out.print("\u001b[45m");
    System.out.print("This background color is magenta");
    System.out.println("\u001b[0m");
    System.out.print("\u001b[106m");
    System.out.print("\u001b[30m");
    System.out.print("This background color is bright cyan");
    System.out.println("\u001b[0m");
    System.out.print("\u001b[4;1;40;37m");
    System.out.println("This is white, bolded, and underlined text on a black background");
    System.out.println("\u001b[0m");
    System.out.print("\u001b[1;37;4m");
    System.out.print("LET'S PLAY A GAME");
    System.out.println("\u001b[0m");
    int answer = (int) (Math.random() * 101);
    int counter = 0;
    boolean incorrect = true;
    System.out.println(answer);
    while (counter < 6 && incorrect){
      counter++;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number from 0 to 100! ");
      String guess = input.nextLine();
      int guessInt = Integer.parseInt(guess);
      if (guessInt == answer){
        if (counter == 1){
          System.out.println("\u001b[93m");
          System.out.println("LUCKY WINNER! You got the answer in " + counter + " try!");
          System.out.println("\u001b[0m");
        }
        else{
          System.out.println("\u001b[92m");
          System.out.println("CORRECT! You got the answer in " + counter + " tries!");
          System.out.println("\u001b[0m");
        }
        incorrect = false;
      }
      else if (guessInt < answer){
        System.out.println("\u001b[31m");
        System.out.println("WRONG! Your answer is too low :(");
        System.out.println("\u001b[0m");
      }
      else{
        System.out.println("\u001b[31m");
        System.out.println("WRONG! Your answer is too high :(");
        System.out.println("\u001b[0m");
      }
    }
    if (incorrect){
      System.out.println("\u001b[31m");
      System.out.println("FAIL! Your six tries are over! The correct answer was " + answer +".");
      System.out.println("\u001b[0m");
    }
  }
}
