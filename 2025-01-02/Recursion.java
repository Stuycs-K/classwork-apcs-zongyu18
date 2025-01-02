public class Recursion{
  public static int fib(int n){
    if (n < 2){
      return n;
    }
    else{
      return fib(n - 1) + fib(n - 2);
    }
  }
  public static void main(String[] args){
    /* Testing simple cases for n
    System.out.println(fib(0));
    System.out.println(fib(1));
    System.out.println(fib(2));
    System.out.println(fib(3));
    System.out.println(fib(4));
    System.out.println(fib(5));
    System.out.println(fib(6));
    System.out.println(fib(7));
    System.out.println(fib(10));*/

    //46 is the largest n such that fib(n) fits in an int
    //System.out.println(fib(47));

    fib(Integer.parseInt(args[0])); //46
  }
}
