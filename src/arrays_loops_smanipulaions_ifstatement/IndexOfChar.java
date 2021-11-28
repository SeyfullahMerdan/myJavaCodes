  package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class IndexOfChar {

	public static void main(String[] args) {
		
		
	  /*
	   	System.out.println("Lütfen bir cümle giriniz");
		String cumle=scan.nextLine();
		System.out.println("Lütfen bir harf giriniz");
		char karakter=scan.next().charAt(0);
		
		
		int harf=cumle.indexOf(karakter);
		
		if (harf>=0) {
			System.out.println("Girdiginiz harf cümlede vardýr");
		} else {
			System.out.println("Girdiginiz harf cümlede yoktur");	
		}
	   
	   */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println ("Lütfen bir cümle yazýnýz");
		String cumle2=scan.nextLine();
		System.out.println("Lutfen bir harf girin");
		char krk=scan.next().charAt(0);
		
		int harfi=cumle2.indexOf(krk);
		
		
		if (harfi>=0) {
			System.out.println("harf vardýr");
		} else {
			System.out.println("harf yoktur");
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
