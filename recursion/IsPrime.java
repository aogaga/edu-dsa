public class IsPrime{

	public static void main(String [] args){

		System.out.println(getPrime(9, 7));
	}

	public static boolean getPrime(int num1, int i){
		if(num1 <= 1){
			return false;
		}


		if(i == 1){
			return true;
		}

	   
	   if((num1 % i) == 0){
			return false;
		}


		return getPrime(num1, i -1);

	}
}