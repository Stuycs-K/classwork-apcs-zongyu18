public class Advent2{
  public static String daySixHelper(String fileName, int index){
  try{
    int toReturnHelp = 0;
    File file = new File("input.txt");
    Scanner input = new Scanner(file);
    int[] alphabet = new int[](26);
    while (input.hasNextLine()){
      String line = input.nextLine();
      alphabet[line.charAt(index) - 97)] += 1;
    }
    for (int count = 0; count < 26; count++){
      if (alphabet[count] > toReturnHelp){
        toReturnHelp = alphabet[count];
      }
    }
    return "" + (char)toReturnHelp;
  }
  catch (FileNotFoundException e) {
    //File not found what should you do?
    System.out.println("File not found");
     return "fail";
  }
}
  public static void main(String[] args){
    System.out.println(dayFour("input.txt"));
  }
}