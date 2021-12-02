package teamwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysReplit2 {

	public static void main(String[] args) {
		// Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

// Input : Coding is greate.

// Output : .etaerg si gnidoC
		
		String str=  "Coding is greate." ;
		
		String arr[]= str.split("");
		
		List <String> arr1= new ArrayList<>();
		
		System.out.println(Arrays.asList(arr));
		
		for (int i = arr.length-1 ; i >= 0; i--) {
		
			arr1.add(arr[i]);
			
		}
		
		System.out.println(arr1);
	
	
		
		
		
	}

}
