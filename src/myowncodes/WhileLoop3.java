package myowncodes;

import java.util.Scanner;

public class WhileLoop3 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		// Kullan�c�dan ba�lang�� ve biti� degerleri al�n.
		// Ba�lang�� ve biti� degeri dahil aralar�ndaki t�m �ift tamsay�lar� while loop kullanarak ekrana yazd�r�n.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen ba�lang�� ve biti� degeri giriniz.");

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
