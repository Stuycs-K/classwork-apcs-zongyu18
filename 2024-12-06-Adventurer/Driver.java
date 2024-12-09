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
    if (counter == 1){
      System.out.println("ALL TESTS PASSED");
    }
    else{
      System.out.println("FAILED: " + counter +"/1 TESTS PASSED");
    }
  }
}
