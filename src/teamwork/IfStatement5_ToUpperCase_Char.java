package teamwork;

import java.util.Scanner;

public class IfStatement5_ToUpperCase_Char {

	public static void main(String[] args) {
		
		
		/*
		 Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin
		 Ornek:  ilkHarf=P output = �Pazar, Pazartesi veya Persembe�             
	             ilkHarf=S output = �Sali�
	             ilkHarf=P output = �carsamba, cumartesi ve cuma
		 Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
		 
		 */
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen g�n isimlerinden birinin ba� harfini yaz�n�z.");		
		
		char harf=scan.next().toUpperCase().charAt(0);
		
		
		/*
		 
		 
		if (harf=='P') {
			System.out.println("PAzar,Pazartesi.Per�embe");
		}
		
		if (harf=='S') {
			System.out.println("Sal�");
		}
		
		
		if (harf=='C') {
			System.out.println("�ar�amba,Cuma,Cumartesi");
		}
		
		
		if (harf!='P' && harf!='S' && harf!='C' ) {
			System.out.println("L�tfen ge�erli bir g�n giriniz.");
		}
		 

		 
		 */
		
		
		if (harf=='P') {
			System.out.println("PAzartesi,PAzar,Per�embe");
		} 
		
		else if (harf=='S'){
			System.out.println("Sal�");
 
		}
		else if(harf=='C') {
			System.out.println("�ar�amba,Cuma,Cumartesi");

		}
		
		else {
			System.out.println("L�tfen ge�erli bir g�n ismi giriniz.");

		}
		
		
		scan.close();
		
		
		

	}

}
