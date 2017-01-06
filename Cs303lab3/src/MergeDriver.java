import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MergeDriver {
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		int[] arr = new int[1000];
		
		int[] temp = new int[arr.length];
		
		int LowerIndex = 0;
		int HigherIndex = arr.length -1;
			try{
				Scanner scan = new Scanner (new File("input100.txt"));
		int x = 0;
		
		while(scan.hasNext()){
			
			arr[x++] = scan.nextInt();
		    
		}
		scan.close();
		//arr[4] =2;
		
		MergeSort.merge(arr, temp, LowerIndex, HigherIndex);
		System.out.println(Arrays.toString(arr));
		
		long endTime = System.currentTimeMillis();
		System.out.println("it took " + (endTime - startTime) + " milliseconds");
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}
	}

}
