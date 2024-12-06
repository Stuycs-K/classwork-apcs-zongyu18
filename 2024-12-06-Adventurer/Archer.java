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
}
