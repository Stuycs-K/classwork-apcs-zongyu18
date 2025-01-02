public class Recursion{
  public static int fib(n){
    if (n < 2){
      return n;
    }
    else{
      return fib(n - 1) + fib(n - 2);
    }
  }
  public static void main(String[] args){

  }
}
