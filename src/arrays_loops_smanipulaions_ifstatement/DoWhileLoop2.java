package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class DoWhileLoop2 {

	public static void main(String[] args) {
	
		// Kullan�c�dan toplamak �zere pozitif say� isteyin.
		// Kullan�c� s�f�ra bas�ncaya kadar sayilar� al�p toplamaya devam edin.
		// s�f�ra bast�g�nda o ana kadar ka� say� girdigini ve girilen pozitif say�lar�n toplam�n� yazd�r�n.

				Scanner scan=new Scanner(System.in);

				int sayi=100;     // kullan�c�dan al�nan de�er-variable      // ihtiyac�m�z oan Variablelar� olu�turduk.
				int toplam=0;  // ald�g�m say�y� toplamak i�in saklama kab�na
				int sayac=0;  // girilen say� adedini tutacak variable
		
				
				do {
					System.out.println("L�tfen pozitif bir say� giriniz.\n��lemi bitirmek i�in 0'a bas�n�z.");
					sayi=scan.nextInt();
				
					
					toplam+=sayi;
					sayac++; 
					
				} while (!(sayi==0));
				
				System.out.println("Toplamda " + sayac + " say� girdiniz.");
				System.out.println("Girdiginiz say�lar�n toplam� : " + toplam);
		
		scan.close();
		
	}

}