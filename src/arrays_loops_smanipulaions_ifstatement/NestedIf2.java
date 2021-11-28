package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class NestedIf2 {

	public static void main(String[] args) {
        
		/*
		 * Kullanýcýdan 4 basamakli pozitif bir sayi girmesini isteyin. 
		  
		 *Girdiði sayi 5’e bölünüyorsa son rakamýný kontrol edin. Son rakamý 0 ise ekrana “5’e bölünen
		  çift sayý” yazdýrýn. Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn.
		 
		 * Girdiði password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn.
		 */
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 4 basamaklý pozitif bir sayý giriniz: \nArdýndan enter tuþuna basýnýz.");
		int sayi=scan.nextInt();
		
		if ( sayi<1000 || sayi>9999 ) {
			System.out.println("Girdiginiz sayý 4 basamaklý pozitif bir sayý degildir. Lütfen tekrardan deneyiniz");
		} else if (sayi>=1000 && sayi<=9999) {
			if (sayi%5==0) {
				if (sayi%10==0) {
					System.out.println("5'e bölünebilen çift bir sayýdýr");
				} else {
					System.out.println("5'e bölünebilen tek bir sayýdýr");
				}
			
			}	else {
				System.out.println("Sayý 5'e bölünebilen bir sayý degildir. Lütfen tekrar deneyin.");
 
			}
		}
		scan.close();
	
	}    // Main

}        // Class
