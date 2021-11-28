package myowncodes;

import java.util.Scanner;

public class DoWhileLoop2 {

	public static void main(String[] args) {
	
		// Kullanýcýdan toplamak üzere pozitif sayý isteyin.
		// Kullanýcý sýfýra basýncaya kadar sayilarý alýp toplamaya devam edin.
		// sýfýra bastýgýnda o ana kadar kaç sayý girdigini ve girilen pozitif sayýlarýn toplamýný yazdýrýn.

				Scanner scan=new Scanner(System.in);

				int sayi=100;     // kullanýcýdan alýnan deðer-variable      // ihtiyacýmýz oan Variablelarý oluþturduk.
				int toplam=0;  // aldýgým sayýyý toplamak için saklama kabýna
				int sayac=0;  // girilen sayý adedini tutacak variable
		
				
				do {
					System.out.println("Lütfen pozitif bir sayý giriniz.\nÝþlemi bitirmek için 0'a basýnýz.");
					sayi=scan.nextInt();
				
					
					toplam+=sayi;
					sayac++; 
					
				} while (!(sayi==0));
				
				System.out.println("Toplamda " + sayac + " sayý girdiniz.");
				System.out.println("Girdiginiz sayýlarýn toplamý : " + toplam);
		
		scan.close();
		
	}

}