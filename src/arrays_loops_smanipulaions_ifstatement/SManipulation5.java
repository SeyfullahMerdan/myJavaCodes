package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class SManipulation5 {

	public static void main(String[] args) {
		
		
		// ullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
		// String Manipulation / Methods
		
		Scanner scan=new Scanner(System.in);
		System.out.println("4 harfli bir kelime giriniz.");
		String kelime=scan.next();
		
		
		if (kelime.length() != 4) {
			System.out.println("Lütfen 4 haneli bir kelime giriniz.");
			
		} else {
			System.out.println("Girilen 4 haneli kelime : " + kelime.substring(3, 4) + kelime.substring(2, 3)   + kelime.substring(1, 2)+ kelime.substring(0, 1)                       );

		}
		
		
		scan.close();
		
		
		
		
		

	}

}
