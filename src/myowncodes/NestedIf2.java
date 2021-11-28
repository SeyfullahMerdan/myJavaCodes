package myowncodes;

import java.util.Scanner;

public class NestedIf2 {

	public static void main(String[] args) {
        
		/*
		 * Kullan�c�dan 4 basamakli pozitif bir sayi girmesini isteyin. 
		  
		 *Girdi�i sayi 5�e b�l�n�yorsa son rakam�n� kontrol edin. Son rakam� 0 ise ekrana �5�e b�l�nen
		  �ift say�� yazd�r�n. Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.
		 
		 * Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.
		 */
		

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen 4 basamakl� pozitif bir say� giriniz: \nArd�ndan enter tu�una bas�n�z.");
		int sayi=scan.nextInt();
		
		if ( sayi<1000 || sayi>9999 ) {
			System.out.println("Girdiginiz say� 4 basamakl� pozitif bir say� degildir. L�tfen tekrardan deneyiniz");
		} else if (sayi>=1000 && sayi<=9999) {
			if (sayi%5==0) {
				if (sayi%10==0) {
					System.out.println("5'e b�l�nebilen �ift bir say�d�r");
				} else {
					System.out.println("5'e b�l�nebilen tek bir say�d�r");
				}
			
			}	else {
				System.out.println("Say� 5'e b�l�nebilen bir say� degildir. L�tfen tekrar deneyin.");
 
			}
		}
		scan.close();
	
	}    // Main

}        // Class
