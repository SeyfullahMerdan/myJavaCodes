package teamwork;

import java.util.ArrayList;
import java.util.List;

public class ArraysReplit {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Write a return method to reverse number.

    // Input : 12345

    // Output : 54321

		int arr[]= {1,2,3,4,5} ;
		
		List <Integer> arr1= new ArrayList <> ();
		
		for (int i = arr.length-1 ; i >= 0; i--) {
		
		arr1.add(arr[i]);
					
			
		}
		
		System.out.print( arr1 );

		
		
	}

}
