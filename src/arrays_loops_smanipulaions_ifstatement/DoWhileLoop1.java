package arrays_loops_smanipulaions_ifstatement;

public class DoWhileLoop1 {

	public static void main(String[] args) {
		
		// 9'dan 190'a kadar 7'in kat� olan t�m say�lar� ekrana yazd�r�n�z.
		
		int sayi=9;
		
		do {
			if (sayi%7==0) {
				System.out.println(sayi);
			}
			sayi++;
		} while (sayi<=190);
		
	}

}
