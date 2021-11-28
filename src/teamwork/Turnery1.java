package teamwork;

import java.util.Scanner;

public class Turnery1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		// Kullanýccýdan bir sayý alýnýz ve negatif veya pozitif oldugunu yazýnýz
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen bir sayý giriniz.");
		
		int sayi=scan.nextInt();
		
		// 1. çözümü
		
		System.out.println  ( sayi>0 ? "Pozitif"  : ( sayi<0 ? "negatif"  :   "sýfýrýn iþareti yoktur"    )   );
		
		// 2. çözümü
		
		
		String sonuc= (sayi>0) ? "pozitif" : "negatif" ;  // atama yaptýk
		System.out.println(sonuc);
	
	

	}

}
