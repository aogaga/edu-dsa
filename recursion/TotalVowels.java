class TotalVowels{
	public static void main(String [] args){

		System.out.println(vcount("HELLo World"));
		System.out.println(vcount("AEIOUaeiou"));
		System.out.println(vcount("STR"));
	}


	public static int vcount(String str){

		if(str.isEmpty()){
			return 0;
		}

		//String vowels = "AEIOUaeiou";


		// if(vowels.contains(str.substring(0,1))){
		// 	return vcount(str.substring(1)) + 1;
		// }else{
      
		// 	return vcount(str.substring(1));
		// }

		char currentChar = Character.toUpperCase( str.charAt(0));
		if(currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U'){
			 return vcount(str.substring(1)) + 1;
		}else{
			return vcount(str.substring(1));
		}
	}
}