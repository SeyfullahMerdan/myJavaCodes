package teamwork;

import java.util.Scanner;

public class IfStatement6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		// Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen bir tam say� giriniz.");
		
		int sayi=scan.nextInt();
		
		//  turnery 1. ��z�n�
		
		System.out.println( sayi%2==0 ? "�ift say�d�r" : "Tek say�d�r"   );
		
		// turnery 2. ��z�m
		
		String sonuc=(sayi%2==0) ? "�ift say�d�r" : "Tek say�d�r" ;
		System.out.println(sonuc);
		
		// if else ��z�m�
		
		if (sayi%2==0) {
			System.out.println("�ift");
		} 
		if (sayi%2!=0) {
			System.out.println("tek");

		}
		


	}

}
