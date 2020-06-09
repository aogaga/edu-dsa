class StrReverse{

	public static void main(String [] args){
		System.out.println(reverse("Hello World"));
	}

	public static String reverse(String str){

		if(str.length() == 0 || str.isEmpty()){

			return str;
		}


		return reverse(str.substring(1)) + str.charAt(0);
	}
}