class Occurrences{
	public static void main(String [] args){
			System.out.println("hello");
		 int[] array = new int[]{2,3,4,1,7,8,3};
		System.out.println(occur(array, 0, 3));
	}

	public static int occur(int[] array, int index, int element){
		if(array.length == index){
			return 0;
		}

		if(array[index] == element){
			return 1 + occur(array, index+1, element);
		}else{
			return occur(array, index+1, element);
		}
	}
}