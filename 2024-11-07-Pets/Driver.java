// speak() is overridden in the child class but not the parent, same with getName()
//Therefore, the String "The Mighty"  is added before the original getName() method
public class Driver{
  public static void main(String[] args) {
    Animal dog = new Animal("woof", 1, "Bob");
    dog.speak();
    Animal cat = new Animal("meow", 50, "Calico");
    cat.speak();
    Bird Charlie = new Bird("chirp", 16, "Charlie", 5.6, "green");
    Charlie.speak();
  }
}