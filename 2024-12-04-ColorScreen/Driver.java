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

  public static void main(String[] args){
    System.out.println(CLEAR_SCREEN);
    partFive();
    }
  }
