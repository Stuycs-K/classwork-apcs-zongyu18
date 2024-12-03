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
    System.out.print("\u001b[0m");
  }
}
