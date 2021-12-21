package interviewQuestions;

import java.util.Scanner;

public class Q15_Pyramid {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * 
		 * Ask user to enter the number of lines of a half pyramid. Type a program to
		 * create the half pyramid. For exampleif the number of lines is 5, the pyramid
		 * will be like;
		 *
		 * * * * * * * * * * *
		 * 
		 * Kullanýcýnýn girdigi satýr sayýsý kadar yarým piramid sekli yazdýran bir
		 * program create ediniz.
		 * 
		 * 
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number for see the pyramid: ");
		int satir=scan.nextInt();
		
		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");	
			}
			System.out.println("*");	
		}
		
		
	}

}
