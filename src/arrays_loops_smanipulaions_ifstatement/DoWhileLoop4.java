package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class DoWhileLoop4 {

	public static void main(String[] args) {
		
		// Kullan�c�dan toplamak i�in say� isteyin. Toplam 500'e ula��ncaya kadar devam istemeyi ettirin.
		// Toplam 500'e ula�t�g�nda veya ge�ti�inde toplam� ve ka� say� girildigini yazd�r�n.

		
		Scanner scan=new Scanner(System.in);
		
		int sayi=0;
		int sayac=0;
		int toplam=0;
		
		do {
			System.out.println("L�tfen toplamak i�in bir say� giriniz.\nArd�ndan enter yap�n�z.");
			
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
			
			
		} while (toplam<=500);
		
		System.out.println("Toplamda "+sayac+" say� girdiniz.");
		System.out.println("Girdiginiz say�lar�n toplam� : "+toplam+"'d�r.");
		
		scan.close();
	}

}
