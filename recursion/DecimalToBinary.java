
public class DecimalToBinary {

  public static int decTobi(int num) {
    if (num == 0) {
      return 0;
    }

    return decTobi(num % 2);
  }

}