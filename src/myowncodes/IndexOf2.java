package myowncodes;

import java.util.Scanner;

public class IndexOf2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
        Scanner scan=new Scanner(System.in);
		
	    System.out.println ("Lütfen bir cümle yazýnýz");
		String cumle=scan.nextLine();
		
		
		System.out.println("Lutfen bir kelime girin");
		String kelime=scan.next();
		
		
		int sozcuk=cumle.indexOf(kelime);
		
		if (sozcuk<=0) {
			System.out.println("cümlede kullanýlmamýþ");			
		} else if ( cumle.indexOf(kelime, sozcuk+1) ==-1   ) {
			System.out.println("cümlede 1 kere kullanýlmýs");
		}
		else {
			System.out.println( "girilen kelime cümlede 1 kereden fazla kullanýlmýs ");

		}
			
		
	}

}
