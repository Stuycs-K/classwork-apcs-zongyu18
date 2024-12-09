public class Game{
  public static boolean helper(){
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    String response = userInput.nextLine();
    response.toLowerCase();
    if (response.equals("a") || response.equals("attack")){
      player.attack(enemy);
    }
    else if (response.equals("sp") || response.equals("special")){
      player.specialAttack(enemy);
    }
    else if (response.equals("su") || response.equals("support")){
      player.support()
    }
    else if (response.equals("quit")){
      return false;
    }
    else{
      helper();
    }
    return true;
  }
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter player name below");
    String response = userInput.nextLine();
    Adventurer player = new Archer(username, 15);
    Adventurer enemy = new CodeWarrior("Syntax Error", 8);
    boolean toContinue = true;
    while (helper()){
      System.out.println(player.getName() + " / " + player.getHP() + " / " + player.getSpecial() + " " + player.getSpecialName);
      System.out.println(enemy.getName() + " / " + enemy.getHP() + " / " + enemy.getSpecial() + " " + enemy.getSpecialName);
      if (enemy.getHP() <= 0){
        System.out.println(player.getName() + "prevails over the defeated " + enemy.getName() + "!");
      }
      int botChoice = (int) (Math.random() * 3);
      if (botChoice == 0){
        enemy.attack(player);
      }
      else if (botChoice == 1){
        enemy.support();
      }
      else{
        enemy.specialAttack(player);
      }
      if (player.getHP() <= 0){
        System.out.println(enemy.getName() + "prevails over the defeated " + player.getName() + "!");
      }
    }
  }
}
