public class MyPalindrome{
	public static void main(String [] args){
		// String str = "MADAM";

		// System.out.println(str.substring(0,1));
		// System.out.println(str.substring(str.length() -1));
		//  System.out.println(str.substring(1, str.length() -1));

		// System.out.println(str.substring(str.length() -1));
	 //     System.out.println(str.substring(0).equals(str.substring(str.length())));
		//  System.out.println("MADAM");
		 System.out.println(palindrome("Dad"));
		 System.out.println(isPalindrone("Dad"));
	}


	public static boolean palindrome(String str){

		if(str.length() <= 1){
			return true;
		}

		String lastChar = str.substring(str.length() -1);
		if(str.substring(0, 1).equals(lastChar)){
			return palindrome(str.substring(1, (str.length() -1)));
		}else{

			return false;
		}
	}

	public static boolean isPalindrone(String str){
		if(str.length() == 0 || str.length() == 1 ){
			return true;
		}

		if(str.charAt(0) == str.charAt(str.length() -1)){
			return isPalindrone(str.substring(1, str.length() -1));
		}else{
			return false;
		}
	}

}