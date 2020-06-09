class Permutations{
	public static void main(String [] args){
		char[] input = {'a', 'b', 'c'};
        permute(input, input.length);
	}

	public static void permute(char [] array , int length){

		if(length == 1){
			System.out.println(array);
			return;
		}else{

			for(int i = 0; i < length; i++){
				swap(array, i, length -1);
				permute(array, length -1);
				swap(array, i, length -1);
			}
		}
	}

	public static void swap(char [] array, int i, int j){
		char c;
		c = array[i];
		array[i] = array[j];
		array[j] = c;
	}

}