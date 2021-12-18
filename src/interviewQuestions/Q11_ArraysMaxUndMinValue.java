package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q11_ArraysMaxUndMinValue {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
     
		/*
		 Create a function that takes an array and returns the difference between
		 and the smallest numbers.
		 Ask user to enter array elements.

		kullanýcýnýn girdigi bir array'in en buyuk elemani ile 
		en kucuk elemanýnýn  farkýný bulan bir method create ediniz.
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen girmek istediginiz arrayin uzunlugunu belirleyin: ");
		int uzunluk=scan.nextInt();
		
		
		Integer arr[]=new Integer[uzunluk];  
		
		
		System.out.println("Lütfen uzunlugunu girdiginiz Arrayin elemanlarýný giriniz: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();	
		}
		
		
		maxundmin(arr);
	

	}

	private static int maxundmin(Integer[] arr) {
		
		
		Arrays.sort(arr);
		
		int fark=0;
		
		fark=arr[arr.length-1]-arr[0];
		
       // System.out.println(fark);
		
		return fark;
		
		
	}

	
}
