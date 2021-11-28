package teamwork;

import java.util.Scanner;

public class IfStatement2 {

	public static void main(String[] args) {

		
		
		 //Soru 25-2) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
		
		/*
		 
		  
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Lutfen bir tam sayi giriniz");
		 double sayi=scan.nextDouble();
		 
		 
		if (sayi%2==0) {
		System.out.println("girdiginiz sayi cift bir sayi");
		}
		
		if (sayi%2==1) {
			System.out.println("girdiginiz sayi tek bir sayi");
			}
		
		*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir tam sayý giriniz : ");
		double sayi=scan.nextDouble();
		
		if (sayi%2==0) {
			System.out.println("Bu sayý bir çift sayýdýr.");
		} else {
			System.out.println("Bu sayý bir tek sayýdýr.");
		}
		
		
		
		scan.close();
	
		
		
	}

}
