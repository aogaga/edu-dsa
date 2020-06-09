public class HCommonDivisor{

	public static void main(String [] args){

		System.out.println(commonDivisor(9, 7));
	}


	public static int commonDivisor(int num1, int num2){

		if(num1 == num2){
			return num1;
		}


		if(num1 > num2){
			return commonDivisor((num1 - num2) , num2);
		} else{
			return commonDivisor (num1, (num2 - num1));
		}
	}
}