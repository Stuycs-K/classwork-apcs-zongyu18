public class Archer extends Adventurer{
  private int specialCount;
  public Archer(String name){
    super(name, 10);
    this.setSpecial(25);
    this.setmaxHP(15);
  }
  public Archer(String name, int hp){
    super(name, hp);
    this.setSpecial(25);
    this.setmaxHP(15);
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
    return this.getName() + " has dealt 1 DMG to " + other.getName() + "!";
  }
  public String support(Adventurer other){
    other.setHP(other.getHP() + 1);
    return this.getName() + " has healed " + other.getName() + " for 1 HP!";
  }
  public String support(){
    this.setHP(this.getHP() + 1);
    return this.getName() + " has healed themself for 1 HP!";
  }
  public String specialAttack(Adventurer other){
    this.setSpecial(this.getSpecial() - 1);
    other.applyDamage(2);
    return(this.getName() + " has shot an arrow at " + other.getName() + " dealing 2 DMG!");
  }
  
}
