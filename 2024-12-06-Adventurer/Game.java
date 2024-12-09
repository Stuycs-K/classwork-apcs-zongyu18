public class Game{
  public static void main(String[] args){
    Scanner user = new Scanner(System.in);
    System.out.println("Enter player name below");
    String username = userInput.nextLine();
    Adventurer player = new Archer(username, 15);
    Adventurer enemy = new CodeWarrior("Syntax Error", 8);
  }
}
