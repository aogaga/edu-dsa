
public class Exponent {

  public static void main(String[] args) {
    System.out.println(exp(4, 3));
  }

  public static int exp(int num, int pow) {
    if (pow == 1) {
      return num;
    }

    return num * exp(num, (pow - 1));
  }
}