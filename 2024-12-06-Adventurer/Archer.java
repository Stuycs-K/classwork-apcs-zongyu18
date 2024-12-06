public class Archer extends Adventurer{
  public Archer(String name){
    this.super(name, 10);
  }
  public Archer(String name, int hp){
    this.name = name;
    this.HP = hp;
    this.maxHP = hp;
  }
  public String getSpecialName(){
    return "Arrows";
  }
  public int getSpecial(){
    return specialCount;
  }
  public void setSpecial(int n){
    this.specialCount = n;
    if (n > this.getSpecialMax()){
      this.specialCount = 25;
    }
  }
  public int getSpecialMax(){
    return 25;
  }
  public String attack (Adventurer other){
    return "You have dealt 1 DMG!";
  }
  public String support(Adventurer other){
    return "You have healed 1 HP!";
  }
  public String support(){
    return "You have health yourself for 1 HP!";
  }
  public String specialAttack(Adventurer other){
    this.setSpecial(this.getSpecial() - 1);
    return("You have shot an arrow dealing 2 DMG!");
  }
}
