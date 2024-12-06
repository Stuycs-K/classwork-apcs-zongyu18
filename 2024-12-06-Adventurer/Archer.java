public class Archer extends Adventurer{
  public Archer(String name){
    this.super(name, 10);
  }
  public Archer(String name, int hp){
    this.name = name;
    this.HP = hp;
    this.maxHP = hp;
  }
}
