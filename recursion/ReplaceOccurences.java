class ReplaceOccurences{
	public static void main(String [] args){
		  int[] array = new int[]{2,-3,4,-1,-7,8,3};

		  int [] newArray = replace(array, 0);

		  for(int x : newArray){
		  	System.out.print(x);
		  }

		  System.out.println("");
	}


	public static int[] replace(int [] arr, int index){

		if(arr.length == index){
			return arr;
		}

		if(arr[index] < 0){
			arr[index] = 0;
		}
		return replace(arr, index+1);
	}
}