public class Game{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter player name below");
    String response = userInput.nextLine();
    Adventurer player = new Archer(username, 15);
    Adventurer enemy = new CodeWarrior("Syntax Error", 8);
    while (!response.equals("quit")){
      System.out.println(player.getName() + " / " + player.getHP() + " / " + player.getSpecial() + " " + player.getSpecialName);
      System.out.println(enemy.getName() + " / " + enemy.getHP() + " / " + enemy.getSpecial() + " " + enemy.getSpecialName);
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      response = userInput.nextLine();
      response.toLowerCase();
      if (response.equals("a") || response.equals("attack")){
        player.attack(enemy);
      }
      if (response.equals("sp") || response.equals("special")){
        player.specialAttack(enemy);
      }
      if (response.equals("su") || response.equals("support")){
        player.support()
      }
    }
  }
}
