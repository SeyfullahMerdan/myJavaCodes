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
		System.out.println("L�tfen bir tam say� giriniz : ");
		double sayi=scan.nextDouble();
		
		if (sayi%2==0) {
			System.out.println("Bu say� bir �ift say�d�r.");
		} else {
			System.out.println("Bu say� bir tek say�d�r.");
		}
		
		
		
		scan.close();
	
		
		
	}

}
