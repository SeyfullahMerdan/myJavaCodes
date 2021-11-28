package teamwork;

import java.util.Scanner;

public class IfStatement5_ToUpperCase_Char {

	public static void main(String[] args) {
		
		
		/*
		 Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin
		 Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
	             ilkHarf=S output = “Sali”
	             ilkHarf=P output = “carsamba, cumartesi ve cuma
		 Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
		 
		 */
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen gün isimlerinden birinin baþ harfini yazýnýz.");		
		
		char harf=scan.next().toUpperCase().charAt(0);
		
		
		/*
		 
		 
		if (harf=='P') {
			System.out.println("PAzar,Pazartesi.Perþembe");
		}
		
		if (harf=='S') {
			System.out.println("Salý");
		}
		
		
		if (harf=='C') {
			System.out.println("Çarþamba,Cuma,Cumartesi");
		}
		
		
		if (harf!='P' && harf!='S' && harf!='C' ) {
			System.out.println("Lütfen geçerli bir gün giriniz.");
		}
		 

		 
		 */
		
		
		if (harf=='P') {
			System.out.println("PAzartesi,PAzar,Perþembe");
		} 
		
		else if (harf=='S'){
			System.out.println("Salý");
 
		}
		else if(harf=='C') {
			System.out.println("Çarþamba,Cuma,Cumartesi");

		}
		
		else {
			System.out.println("Lütfen geçerli bir gün ismi giriniz.");

		}
		
		
		scan.close();
		
		
		

	}

}
