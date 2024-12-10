import java.util.Scanner;

public class Game{
  public static boolean helper(Adventurer player, Adventurer enemy){
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    Scanner userInput = new Scanner(System.in);
    String response = userInput.nextLine();
    response.toLowerCase();
    if (response.equals("a") || response.equals("attack")){
      System.out.println(player.attack(enemy));
      return true;
    }
    else if (response.equals("sp") || response.equals("special")){
      System.out.println(player.specialAttack(enemy));
      return true;
    }
    else if (response.equals("su") || response.equals("support")){
      System.out.println(player.support());
      return true;
    }
    else if (response.equals("quit")){
      return false;
    }
    else{
      helper(player, enemy);
    }
    return true;
  }
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter player name below");
    String response = userInput.nextLine();
    Adventurer player = new Archer(response, 15);
    Adventurer enemy = new CodeWarrior("Syntax Error", 7);
    boolean bothAlive = true;
    while (bothAlive && helper(player, enemy)){
        System.out.println("");
        System.out.println(player.getName() + " / " + player.getHP() + "HP / " + player.getSpecial() + " " + player.getSpecialName());
        System.out.println(enemy.getName() + " / " + enemy.getHP() + "HP / " + enemy.getSpecial() + " " + enemy.getSpecialName());
        System.out.println("");
      if (enemy.getHP() <= 0){
          System.out.println(player.getName() + " prevails over the defeated " + enemy.getName() + "!");
          bothAlive = false;
        }
        if (bothAlive){
          int botChoice = (int) (Math.random() * 3);
          if (botChoice == 0){
            System.out.println(enemy.attack(player));
          }
          else if (botChoice == 1){
            System.out.println(enemy.support());
          }
          else{
            System.out.println(enemy.specialAttack(player));
          }
          System.out.println("");
          System.out.println(player.getName() + " / " + player.getHP() + "HP / " + player.getSpecial() + " " + player.getSpecialName());
          System.out.println(enemy.getName() + " / " + enemy.getHP() + "HP / " + enemy.getSpecial() + " " + enemy.getSpecialName());
          System.out.println("");
          if (player.getHP() <= 0){
            System.out.println(enemy.getName() + " prevails over the defeated " + player.getName() + "!");
            bothAlive = false;
          }
        }
    }
  }
}
