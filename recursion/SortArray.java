class SortArray{
	public static void main(String [] args){
    System.out.println("Unsorted Array: ");
    
    int[] array = {40, 24, 60, 15, 10, 45, 93};

        System.out.println("Sorted Array: ");
    
      sort(array, array.length);

      for(int x: array){
      	System.out.print(x);
      	System.out.print(", ");
      	
      }

      System.out.println("");
	}

	public static void sort(int [] array, int n){
		if(n ==1){
			return;
		}


		for(int i = 0; i < n -1 ; i++){
			if(array[i] > array[i+1]){
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}

		sort(array, n-1);
	}
}