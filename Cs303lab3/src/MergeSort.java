import java.util.Arrays;




public class MergeSort {
	public static  void merge(int[] array, int[] temp,int LowerIndex, int HigherIndex  ){
			if(array.length <= 100){
		insertionsort(array);
		
			}
		else
		{
		if (LowerIndex < HigherIndex){
			
			int MiddleIndex = (LowerIndex + HigherIndex)/2;
			merge(array, temp, LowerIndex, MiddleIndex);
			merge(array, temp, MiddleIndex + 1, HigherIndex);
			mergesort(array, temp, LowerIndex, MiddleIndex,HigherIndex);
		}
	}
}
	private static void insertionsort(int[] array) {
		int length = array.length;
		for  (int j = 1; j < length; j++){
			int k = array[j];
			int i = j -1;
			while ((i >= 0) && (array[i] > k)){
				array[i+1] = array[i];
				i = i -1;
				array[i+1] = k;
			}
	}
		System.out.println("program called Insertion sort" );
	}
	public static  void mergesort(int[] array, int[] temp,int LowerIndex, int MiddleIndex, int HigherIndex  ){
	int i = LowerIndex;
	int j = MiddleIndex + 1;
	
	
		for( int k = LowerIndex; k <= HigherIndex; k++){
			temp[k] = array [k];
		}
		for( int k = LowerIndex; k <= HigherIndex; k++){
			if( i > MiddleIndex)
			{
				array[k] = temp[j];
				j++;
			}
			else if( j > HigherIndex)
			{
				array[k] = temp[i];
				i++;
			}
			else if(temp[j] < temp[i])
			{
				array[k] = temp[j];
				j++;
			}
			else
			{
				
			array[k] = temp[i];
			i++;
				
			}
			System.out.println("program called Merge sort" );
		}
		//System.out.println("program called Merge sort" );
	}
	
}

