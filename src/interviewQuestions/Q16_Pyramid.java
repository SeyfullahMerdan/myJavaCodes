package interviewQuestions;

import java.util.Scanner;

public class Q16_Pyramid {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 /*
 Ask user to enter the number of lines of a inverted half pyramid by using numbers.
 Type a program to create the inverted half pyramid.
 For example if the number of lines is 5, the pyramid will be like;

 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1

 Kullanýcýnýn  girdigi satýr sayýsý kadar sayýlarla ters yarým piramid sekli yazdýran bir program create ediniz.

 */
		
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz: ");
		int sayi=scan.nextInt();
		
		
		for (int i = 1 ; i <=sayi ; sayi--) {
			
			for (int j = 1; j <= sayi; j++) {
			
				System.out.print( j + " " );
				
			}
			System.out.println();
		}
			

	}

}
