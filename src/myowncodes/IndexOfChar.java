  package myowncodes;

import java.util.Scanner;

public class IndexOfChar {

	public static void main(String[] args) {
		
		
	  /*
	   	System.out.println("L�tfen bir c�mle giriniz");
		String cumle=scan.nextLine();
		System.out.println("L�tfen bir harf giriniz");
		char karakter=scan.next().charAt(0);
		
		
		int harf=cumle.indexOf(karakter);
		
		if (harf>=0) {
			System.out.println("Girdiginiz harf c�mlede vard�r");
		} else {
			System.out.println("Girdiginiz harf c�mlede yoktur");	
		}
	   
	   */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println ("L�tfen bir c�mle yaz�n�z");
		String cumle2=scan.nextLine();
		System.out.println("Lutfen bir harf girin");
		char krk=scan.next().charAt(0);
		
		int harfi=cumle2.indexOf(krk);
		
		
		if (harfi>=0) {
			System.out.println("harf vard�r");
		} else {
			System.out.println("harf yoktur");
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
