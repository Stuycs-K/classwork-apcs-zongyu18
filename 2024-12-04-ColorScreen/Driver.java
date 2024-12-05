public class Driver extends Text{
  public static void partFive(){
    for (int count = 1; count < 31; count++){
      if (count == 1 || count == 30){
        for (int innerCount = 1; innerCount < 81; innerCount++){
          go(count, innerCount);
          color(MAGENTA, background(MAGENTA));
          System.out.print(".");
          System.out.print(RESET);
        }
      }
      else{
        go(count, 1);
        color(MAGENTA, background(MAGENTA));
        System.out.print(".");
        System.out.print(RESET);
        go(count, 80);
        color(MAGENTA, background(MAGENTA));
        System.out.print(".");
        System.out.print(RESET);
      }
    }
  }

  public static void partSixToEight(){
    int[] arr = new int[3];
    for (int count = 0; count < 3; count++){
      int input = (int) (Math.random() * 100);
      arr[count] = input;
    }
    int increment = 0;
    for (int secondCount = 0; secondCount < 3; secondCount++){
      increment += 20;
      go(2, increment);
      if (arr[secondCount] < 25){
        color(RED, background(BLACK), BRIGHT);
      }
      else if (arr[secondCount] > 75){
        color(GREEN, background(BLACK), BRIGHT);
      }
      else{
        color(WHITE, background(BLACK));
      }
      System.out.print(arr[secondCount]);
      System.out.print(RESET);
    }
  }

  public static void partNine(){
    for (int count = 2; count < 80; count += 2){
      go(3, count);
      color(BLUE, background(BLACK));
      System.out.print("-");
      System.out.print(RESET);
    }
  }

  public static void main(String[] args){
    System.out.println(CLEAR_SCREEN);
    partFive();
    partSixToEight();
    partNine();
    go(30, 1);
  }
}
