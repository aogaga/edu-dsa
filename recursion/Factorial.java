class Factorial{
	public static void main(String [] args){
					System.out.println(f(4));
					System.out.println(f(6));
	}

	public static int f(int n){
		if(n == 1){
			return 1;
		}

		return n * f(n -1);
	}
}
