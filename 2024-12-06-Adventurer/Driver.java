public class Driver{
  public static void main(String[] args){
    Adventurer p1 = new Archer("Decidueye", 12);
    Adventurer p2 = new Archer("Robin Hood");
    int counter = 0;
    if (p1.getHP() == 12){
      counter++;
    }
    if(p2.getHP() == 10){
      counter++;
    }
    if (p1.getmaxHP() == 15){
      counter++;
    }
    if (p2.getmaxHP() == 15){
      counter++;
    }
    if (p1.getName().equals("Decidueye")){
      counter++;
    }
    if (p2.getName().equals("Robin Hood")){
      counter++;
    }
    if (p1.getSpecialName().equals("Arrows")){
      counter++;
    }
    if (p2.getSpecialName().equals("Arrows")){
      counter++;
    }
    if (p1.getSpecial() == 25){
      counter++;
    }
    if (p2.getSpecial() == 25){
      counter++;
    }
    if (p1.specialAttack(p2).equals("Decidueye has shot an arrow at Robin Hood dealing 2 DMG!")){
      counter++;
    }
    if (p2.getHP() == 8){
      counter++;
    }
    if (p2.support().equals("Robin Hood has healed themself for 1 HP!")){
      counter++;
    }
    if (p1.support(p2).equals("Decidueye has healed Robin Hood for 1 HP!")){
      counter++;
    }
    if (p2.getHP() == 10){
      counter++;
    }
    if (p1.attack(p2).equals("Decidueye has dealt 1 DMG to Robin Hood!")){
      counter++;
    }
    if (p2.getHP() == 9){
      counter++;
    }
    if (p1.getSpecial() == 24){
      counter++;
    }
    if (p2.getSpecial() == 25){
      counter++;
    }
    if (p1.getSpecialMax() == 25){
      counter++;
    }
    if (p1.restoreSpecial(15) == 1){
      counter++;
    }
    if (p1.getSpecial() == 25){
      counter++;
    }
    if (counter == 22){
      System.out.println("ALL TESTS PASSED");
    }
    else{
      System.out.println("FAILED: " + counter +"/22 TESTS PASSED");
    }
  }
}
