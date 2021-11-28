package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class DoWhileLoop3 {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan toplamak üzere pozitif sayý isteyin. Ýþlemi bitirmek için 0'a basmasýný söyleyin.		
		// Kullanýcý yanlýþlýkla negatif sayý girerse o sayýyý dikkate almayýn ve "negatif sayý giremezsiniz" yazdýrýp basa dönün.
	    // Kullanýcý 0'a bastýgýnda toplam kaç pozitif sayý girdigni,yanlýþlýkla kaç negatif sayý girdgini ve girdigi pozitif sayýlarýn 
		// toplamýnýn kaç oldugunu yazdýrýn.

		
		Scanner scan=new Scanner(System.in);

		int sayi=100;     // kullanýcýdan alýnan deðer-variable             *********// ihtiyacýmýz olan Variablelarý oluþturduk.*********
		int toplam=0;  // aldýgým sayýyý toplamak için saklama kabýna
		int sayac=0;  // girilen sayý adedini tutacak variable
        int sayacn=0; // girilen negatif sayý adedini tutacak variable
		
		do {
			System.out.println("Lütfen pozitif bir tam sayý giriniz.\nÝþlemi bitirmek için 0'a basýnýz.");
			sayi=scan.nextInt();
		
			if (sayi<0) {
				sayacn++;
				System.out.println("Negatif sayý giremezsiniz.");
			} else {
				toplam+=sayi;
				sayac++; 
			}
		} while (!(sayi==0));
		
		System.out.println("Toplamda " + sayacn + " negatif sayý girdiniz.");
		System.out.println("Toplamda " + (sayac-1) + " sayý girdiniz.");
		System.out.println("Girdiginiz sayýlarýn toplamý : " + toplam);

		
		
        scan.close();
	}

}
