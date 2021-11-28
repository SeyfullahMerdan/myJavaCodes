package arrays_loops_smanipulaions_ifstatement;

import java.util.Arrays;

public class ArraysPractice2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

		
		int arr[]= { 2, 10, 15, 25, 65, 100 };
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
		     
			toplam+=arr[i];
			
		}
		
		System.out.println(toplam);
	
		
		
		int tersArr[]=new int [arr.length];
		
		for (int i = arr.length-1; i >= 0; i--) {
		
			tersArr[i]=arr[arr.length-1-i] ;
			
			
		}
		
		
		System.out.println(Arrays.toString(tersArr));
		
		
		
		
		
		
		
		
	}

}
