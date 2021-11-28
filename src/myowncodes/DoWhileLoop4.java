package myowncodes;

import java.util.Scanner;

public class DoWhileLoop4 {

	public static void main(String[] args) {
		
		// Kullanýcýdan toplamak için sayý isteyin. Toplam 500'e ulaþýncaya kadar devam istemeyi ettirin.
		// Toplam 500'e ulaþtýgýnda veya geçtiðinde toplamý ve kaç sayý girildigini yazdýrýn.

		
		Scanner scan=new Scanner(System.in);
		
		int sayi=0;
		int sayac=0;
		int toplam=0;
		
		do {
			System.out.println("Lütfen toplamak için bir sayý giriniz.\nArdýndan enter yapýnýz.");
			
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
			
			
		} while (toplam<=500);
		
		System.out.println("Toplamda "+sayac+" sayý girdiniz.");
		System.out.println("Girdiginiz sayýlarýn toplamý : "+toplam+"'dýr.");
		
		scan.close();
	}

}
