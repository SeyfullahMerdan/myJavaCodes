package interviewQuestions;

import java.util.Scanner;

public class Q09_AsalSayi {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		/*
		Ask user enter a positive number and check if it is prime or not

		Kullanýcýdan pozitif bir sayý girmesini isteyin ve asal olup olmadýðýný kontrol edin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen pozitif bir sayý giriniz: ");
		int sayi=scan.nextInt();
	
		int bolen=0;
	
		
		for (int i = 2; i <= sayi; i++) {
			
			if (sayi%i==0) {
				bolen++;
			}
			
		}
		
		if (bolen==1) {
			System.out.println("Girdiginiz " + sayi + " bir asal sayýdýr.");
		} else {
			System.out.println("Girdiginiz " + sayi + " asal sayý degildir.");
		}
		
		
		
		
		
	

	}

}
