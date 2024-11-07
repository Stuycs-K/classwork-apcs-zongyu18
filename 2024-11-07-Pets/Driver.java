public class Driver{
  public static void main(String[] args) {
    Animal dog = new Animal("woof", 1, "Bob");
    dog.speak();
    Animal cat = new Animal("meow", 50, "Calico");
    cat.speak();
  }
}
