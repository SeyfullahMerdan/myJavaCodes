package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class DoWhileLoop3 {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan toplamak �zere pozitif say� isteyin. ��lemi bitirmek i�in 0'a basmas�n� s�yleyin.		
		// Kullan�c� yanl��l�kla negatif say� girerse o say�y� dikkate almay�n ve "negatif say� giremezsiniz" yazd�r�p basa d�n�n.
	    // Kullan�c� 0'a bast�g�nda toplam ka� pozitif say� girdigni,yanl��l�kla ka� negatif say� girdgini ve girdigi pozitif say�lar�n 
		// toplam�n�n ka� oldugunu yazd�r�n.

		
		Scanner scan=new Scanner(System.in);

		int sayi=100;     // kullan�c�dan al�nan de�er-variable             *********// ihtiyac�m�z olan Variablelar� olu�turduk.*********
		int toplam=0;  // ald�g�m say�y� toplamak i�in saklama kab�na
		int sayac=0;  // girilen say� adedini tutacak variable
        int sayacn=0; // girilen negatif say� adedini tutacak variable
		
		do {
			System.out.println("L�tfen pozitif bir tam say� giriniz.\n��lemi bitirmek i�in 0'a bas�n�z.");
			sayi=scan.nextInt();
		
			if (sayi<0) {
				sayacn++;
				System.out.println("Negatif say� giremezsiniz.");
			} else {
				toplam+=sayi;
				sayac++; 
			}
		} while (!(sayi==0));
		
		System.out.println("Toplamda " + sayacn + " negatif say� girdiniz.");
		System.out.println("Toplamda " + (sayac-1) + " say� girdiniz.");
		System.out.println("Girdiginiz say�lar�n toplam� : " + toplam);

		
		
        scan.close();
	}

}
