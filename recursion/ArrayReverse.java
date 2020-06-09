class ArrayReverse{
	public static void main(String [] args){
		int[] array = {1,2,3,4,5,6,7};

		for(int z : array){
			System.out.print(z);
		}

		System.out.println();

		int [] result = reverse(array, 0);

		

		for(int x : result){
			System.out.print(x);
		}

		System.out.println();
	}

	public static int[] reverse(int [] arr, int index){
		int mid = arr.length /2;
		if(mid == index){
			return arr;
		}

		int elemetAtCurrentIndex = arr[index];
		int elementAtLastIndex = arr[arr.length - 1- index];
		arr[index] = elementAtLastIndex;
		arr[arr.length - 1- index] = elemetAtCurrentIndex;

		return reverse(arr, index+1);
	}
}


