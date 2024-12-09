public class Archer extends Adventurer{
  public Archer(String name){
    this.super(name, 10);
  }
  public Archer(String name, int hp){
    super.setName(name);
    super.setHP(hp);
    super.setmaxHP(hp);
    this.setSpecial(25);
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
    other.applyDamage(1);
    return "You have dealt 1 DMG to " + other.getName() + "!";
  }
  public String support(Adventurer other){
    other.setHP(other.getHP() + 1);
    return "You have healed " + other.getName() " for 1 HP!";
  }
  public String support(){
    this.setHP(this.getHP() + 1);
    return "You have healed yourself for 1 HP!";
  }
  public String specialAttack(Adventurer other){
    this.setSpecial(this.getSpecial() - 1);
    other.applyDamage(2);
    return("You have shot an arrow at " + other.getName() + " dealing 2 DMG!");
  }
}
