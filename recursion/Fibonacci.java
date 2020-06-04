
public class Fibonacci {
  public static void main(String[] args) {
    int input = 5;
    int i = 0;
    while (i < input) {
      System.out.println(fib(i));
      i++;
    }

  }

  public static int fib(int n) {
    if (n <= 1) {
      return n;
    }

    return (fib(n - 1) + fib(n - 2));

  }
}