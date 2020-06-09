public class RemoveDups{

	public static void main(String [] args){

		System.out.println(deDup("Thiss iiss aa teesstt"));

		System.out.println(deDup("Helllo Woorld"));
	}

	public static String deDup(String str){

		if(str.length() == 1){
			return str;
		}

		// if(str.charAt(0) == str.charAt(1)){

		// 	return  deDup(str.substring(1));
		// }else{

		// return str.charAt(0) + deDup(str.substring(1));
		// }

		if(str.substring(0,1).equals(str.substring(1, 2))){
			return deDup(str.substring(1));
		}else{

			return str.substring(0, 1) + deDup(str.substring(1));
		}
	}
}