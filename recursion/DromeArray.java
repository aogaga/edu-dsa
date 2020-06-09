class DromeArray{
	public static void main(String [] args){

		int [] num = new int[] {1, 2, 3, 4, 5};
		int [] num2 = {1, 2, 2, 1};
		System.out.println(palindrome(num, 0));
		System.out.println(palindrome(num2, 0));
	}

	public static boolean palindrome(int [] arr, int index){

		int mid = arr.length / 2;

		if(mid == index){
			return true;
		}


		if(arr[index] == arr[arr.length -1 - index] ){
			return palindrome(arr, index+1);
		}

		return false;
	}
}