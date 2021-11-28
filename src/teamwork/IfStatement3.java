package teamwork;

import java.util.Scanner;

public class IfStatement3 {

	public static void main(String[] args) {
		
	/*
	  Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin
	
	  Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
      ilkHarf=S output = “Sali”
	  
	  Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin 
	/*
		 

		 Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen gün isimlerinden birinin ilk harfini giriniz : ");
		char harf=scan.next().toUpperCase().charAt(0);
		
		if (harf=='P') {
			System.out.println("Pazar,Pazartesi,Perþembe");
		}
		if (harf=='S') {
			System.out.println("Salý");
		}
		if (harf=='C') {
			System.out.println("Çarsamba,Cuma,Cumartesi");
		}
		if (harf!= 'C' && harf!='S' &&  harf!='P' ) {
			System.out.println("Gecersiz harf girdiniz .Lutfen gun isimlerinden birinin basharfini yazin");
		}
		
		
		scan.close();
		
		 
	
		 */
		
		
	    Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen gün isimlerinden birinin ilk harfini giriniz : ");
		char harf=scan.next().toUpperCase().charAt(0);
		
		
		if (harf=='P') {
			System.out.println("Pazar,Pazartesi,Persembe");
		}
		else if (harf=='S') {
			System.out.println("Sali");
		}
		else if(harf=='C') {
			System.out.println("Cuma,Cumartesi,Carsamba");
		}
		
		else {
			System.out.println ("Gecersiz giris. Lütfen gün isimlerinden birinin bas harini yazýnýz.");

		}
		
		
		
		scan.close();
		
		
		

	}

}
