package teamwork;

import java.util.Scanner;

public class Turnery1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		// Kullan�cc�dan bir say� al�n�z ve negatif veya pozitif oldugunu yaz�n�z
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen bir say� giriniz.");
		
		int sayi=scan.nextInt();
		
		// 1. ��z�m�
		
		System.out.println  ( sayi>0 ? "Pozitif"  : ( sayi<0 ? "negatif"  :   "s�f�r�n i�areti yoktur"    )   );
		
		// 2. ��z�m�
		
		
		String sonuc= (sayi>0) ? "pozitif" : "negatif" ;  // atama yapt�k
		System.out.println(sonuc);
	
	

	}

}
