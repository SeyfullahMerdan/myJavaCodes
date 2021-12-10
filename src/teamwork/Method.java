package teamwork;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		
		
		//Soru 3 Kullanicidan iki sayi isteyin
        // sayilarin karelerini ve kuplerini 
        // toplayip yazdiran iki ayri method yazin
		// kullaniciya us sorun
        // 2 yazarsa kareleri toplamini yapan 
       //  method, 3 yazarsa kupler toplamini yapan method 
       //  calissin
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen iki say� giriniz : ");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		System.out.println("L�tfen 2 veya 3 olacak �ekilde �s giriniz.");
		
		int secim=scan.nextInt();
		
		
		switch (secim) {
		case 2:
			kareToplami(sayi1,sayi2);
			break;
        case 3:
        	kupToplami(sayi1,sayi2);
			break;	
		default:
			System.out.println("L�tfen ge�erli bir giri� yaparak tekrar deneyiniz.");	
			break;
		}
		
		System.out.println (kupToplami(sayi1,sayi2));

	}

	private static int kupToplami(int sayi1, int sayi2) {
	
		int toplamKup=0;
		
		toplamKup = (sayi1*sayi1*sayi1) + (sayi2*sayi2*sayi2) ;
		
		return toplamKup;
	}

	private static void kareToplami(int sayi1, int sayi2) {
		
		System.out.println( (sayi1*sayi1) + (sayi2*sayi2) );
		
		
	}

	
}
