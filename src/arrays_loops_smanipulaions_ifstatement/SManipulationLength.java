package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class SManipulationLength {

	public static void main(String[] args) {
		
		// Kullan�c�dan ismini isteyiniz. �Sminin son harfini yazd�r�n�z.

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen ad�n�z� giriniz:\nAd�n�z:");

		String isim = scan.nextLine();

		System.out.println(isim.length()); // �uanl�k char olmadan kullan�m� g�rm�yoruz. // dinamik yap� diyoruz bu
											// kal�ba.

		System.out.println(isim.substring(isim.length() - 1, isim.length()));  // 8,9 yazm�� oldum
       /// istenilen degerden ikinci degere kadar olanlar� getir dedim
		scan.close();

	}

}
