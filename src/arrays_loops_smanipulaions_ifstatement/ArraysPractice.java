package arrays_loops_smanipulaions_ifstatement;

import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {

		
		int arr[]= { 1,2,3,4,5,6,7,8,9 } ;
		int konteynir= arr[0];
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length-1; i++) {
		     
			 arr[i]=arr[i+1]; 
			
		}
		
		arr[arr.length-1]=konteynir;
		
		
		System.out.println(Arrays.toString(arr));
	
		
		
		
		
		
		
		
		
		
		

	}

}
