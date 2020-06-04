class Factorial {
	public static void main(String[] args) {
		System.out.println(f(4));
		System.out.println(f(5));

		System.out.println("-------------------");
		System.out.println(fi(4));
		System.out.println(fi(5));
	}

	public static int f(int n) {
		if (n == 1) {
			return 1;
		}

		return n * f(n - 1);
	}

	public static int fi(int n) {
		int result = 1;

		for (int i = 1; i <= n; i++) {
			result = result * i;
		}

		return result;
	}
}
