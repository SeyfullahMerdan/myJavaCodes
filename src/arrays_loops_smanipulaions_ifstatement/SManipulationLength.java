package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class SManipulationLength {

	public static void main(String[] args) {
		
		// Kullanýcýdan ismini isteyiniz. ÝSminin son harfini yazdýrýnýz.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen adýnýzý giriniz:\nAdýnýz:");

		String isim = scan.nextLine();

		System.out.println(isim.length()); // þuanlýk char olmadan kullanýmý görmüyoruz. // dinamik yapý diyoruz bu
											// kalýba.

		System.out.println(isim.substring(isim.length() - 1, isim.length()));  // 8,9 yazmýþ oldum
       /// istenilen degerden ikinci degere kadar olanlarý getir dedim
		scan.close();

	}

}
