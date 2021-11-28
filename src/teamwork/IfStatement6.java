package teamwork;

import java.util.Scanner;

public class IfStatement6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		// Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen bir tam sayý giriniz.");
		
		int sayi=scan.nextInt();
		
		//  turnery 1. çözünü
		
		System.out.println( sayi%2==0 ? "Çift sayýdýr" : "Tek sayýdýr"   );
		
		// turnery 2. çözüm
		
		String sonuc=(sayi%2==0) ? "Çift sayýdýr" : "Tek sayýdýr" ;
		System.out.println(sonuc);
		
		// if else çözümü
		
		if (sayi%2==0) {
			System.out.println("çift");
		} 
		if (sayi%2!=0) {
			System.out.println("tek");

		}
		


	}

}
