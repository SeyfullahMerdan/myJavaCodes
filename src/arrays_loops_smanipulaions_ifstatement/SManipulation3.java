package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class SManipulation3 {

	public static void main(String[] args) {

		// soru3	Kullanicidan isim isteyin, eger isim "a" harfi iceriyorsa, girdiginiz isim a harfi iceriyor,
	//	eger "Z" harfi iceriyorsa , girdiginiz isim Z harfi iceriyor yazdirin, ikisi de yoksa girdiginiz isim a ve Z harfi icermiyor yazdirin.
						
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("isim giriniz");
		String isim=scan.next();
		
		if (isim.contains("a")) {
			System.out.println("a i�eriyor");
		} else if ( isim.contains("Z")   ) {
			System.out.println("Z harfi i�eriyor");
		}
		
		else {
			System.out.println("a ve Z harfi i�ermiyor.");

		}
		
		
		scan.close();
		
	}

}
