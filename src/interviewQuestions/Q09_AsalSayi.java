package interviewQuestions;

import java.util.Scanner;

public class Q09_AsalSayi {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		/*
		Ask user enter a positive number and check if it is prime or not

		Kullan�c�dan pozitif bir say� girmesini isteyin ve asal olup olmad���n� kontrol edin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen pozitif bir say� giriniz: ");
		int sayi=scan.nextInt();
	
		int bolen=0;
	
		
		for (int i = 2; i <= sayi; i++) {
			
			if (sayi%i==0) {
				bolen++;
			}
			
		}
		
		if (bolen==1) {
			System.out.println("Girdiginiz " + sayi + " bir asal say�d�r.");
		} else {
			System.out.println("Girdiginiz " + sayi + " asal say� degildir.");
		}
		
		
		
		
		
	

	}

}
