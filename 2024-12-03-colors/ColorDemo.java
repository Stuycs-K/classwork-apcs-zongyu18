public class ColorDemo{
  public static void main(String args[]){
    System.out.print("\u001b[31m");
    System.out.println("This color is red");
    System.out.print("\u001b[32m");
    System.out.println("This color is orange");
    System.out.print("\u001b[93m");
    System.out.println("This color is bright yellow");
    System.out.print("\u001b[30m");
    System.out.print("\u001b[44m");
    System.out.println("This background color is blue");
    System.out.print("\u001b[45m");
    System.out.println("This background color is magenta");
    System.out.print("\u001b[106m");
    System.out.println("This background color is bright cyan");
    System.out.print("\u001b[4; 1; 100; 37]");
    System.out.println("This is white, bolded, and underlined text on a black background");
    System.out.print("u001b[0m");
  }
}
