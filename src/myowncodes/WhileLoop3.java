package myowncodes;

import java.util.Scanner;

public class WhileLoop3 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		// Kullanýcýdan baþlangýç ve bitiþ degerleri alýn.
		// Baþlangýç ve bitiþ degeri dahil aralarýndaki tüm çift tamsayýlarý while loop kullanarak ekrana yazdýrýn.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen baþlangýç ve bitiþ degeri giriniz.");

		int baslangic=scan.nextInt();
		int bitis=scan.nextInt();
		
		
				
		while (  baslangic<=bitis     ) {
			if (baslangic%2==0 ) {
			  System.out.print(baslangic + " ");
			}
			baslangic++;
		}
	
		
	}

}
