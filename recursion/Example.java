class Example {

  public static void main(String[] args) {
    printNum(6);
  }

  private static void printNum(int n) {

    if (n == 0) {
      return;
    }

    printNum(n - 1);
    System.out.println(n + "");
  }

}