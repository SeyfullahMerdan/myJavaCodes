package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class SManipulation4 {

	public static void main(String[] args) {
		
		
		// Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen isminizi yaz�n�z");
		String isim=scan.next();
		
		System.out.println("L�tfen soyisminizi yaz�n�z");
		String soyisim=scan.next();
		
		
		if ( (isim.length())>(soyisim.length()) ) {
			System.out.println("�sim soyisminden uzundur");
		} else if ( (isim.length())<(soyisim.length()) ) {
			System.out.println("Soyisim isimden uzundur");
		}
		else {
			System.out.println("her ikside ayn�d�r");

		}
		
		
	
		scan.close();

	}

}
