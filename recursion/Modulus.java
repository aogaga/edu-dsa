
public class Modulus {

  public static void main(String[] args) {
    System.out.println(mod(13, 5));
    System.out.println(mod(27, 0));
  }

  public static int mod(int dividend, int divisor) {

    if (divisor == 0) {
      return -1;
    }
    if (dividend < divisor) {
      return dividend;
    }

    return mod((dividend - divisor), divisor);
  }

}