package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class SManipulation4 {

	public static void main(String[] args) {
		
		
		// Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen isminizi yazýnýz");
		String isim=scan.next();
		
		System.out.println("Lütfen soyisminizi yazýnýz");
		String soyisim=scan.next();
		
		
		if ( (isim.length())>(soyisim.length()) ) {
			System.out.println("Ýsim soyisminden uzundur");
		} else if ( (isim.length())<(soyisim.length()) ) {
			System.out.println("Soyisim isimden uzundur");
		}
		else {
			System.out.println("her ikside aynýdýr");

		}
		
		
	
		scan.close();

	}

}
