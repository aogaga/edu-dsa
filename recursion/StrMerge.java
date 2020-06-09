class StrMerge{

public static void main(String [] args){
	System.out.println(mergeStr("cnt", "ace"));
}
	public static String mergeStr(String a, String b){
		if(a.isEmpty()){
			return b;
		}

		if(b.isEmpty()){
			return a;
		}


		if(a.charAt(0) > b.charAt(0)){
				return  b.substring(0, 1) + mergeStr(a, b.substring(1));
			}else{
				return a.substring(0, 1) + mergeStr(a.substring(1), b);
		
		}


	}
}