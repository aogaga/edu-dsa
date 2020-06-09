class FirstOccurence{
	public static void main(String [] args){
		int [] nums = {2, 3, 4, 1, 7, 8, 3};
		System.out.println(find(nums, 3, 0));
	}

	public static int find(int[] array, int val, int index){

		if(array.length == index){
			return -1;
		}
		
		if(array[index] == val){
			return index;
		}

		return find(array, val, index + 1);
	}
}