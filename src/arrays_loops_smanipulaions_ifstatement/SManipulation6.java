package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class SManipulation6 {

	public static void main(String[] args) {

		/* Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa "Sifre
		basari ile tanimlandi", sartlari saglamazsa "Islem basarisiz,Lutfen yeni bir
		sifre girin" yazdirin
			- Ilk harf buyuk harf olmali
			- Son harf kucuk harf olmali
			- Sifre bosluk icermemeli
			------- Sifre uzunlugu en az 8 karakter olmali 
			*/
			
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen ilk harf büyük,son harf küçük,boþluk içermeyen en az 8 karakterli bir þifre giriniz : ");
		String sifre=scan.next();
		
		int parola=sifre.length();

		
		if (     (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z') && 
				 (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z') &&
				 (!sifre.contains(" ")) && 
				  parola>=8                                                       )	
				  {
				System.out.println("Þifreniz baþarý ile tanýmlandý.");
			} 
		else { System.out.println("Ýþlem baþarýsýz. Lütfen yeni bir geçerli þifre girin."); }
			
		
		scan.close();
		
		
	}

}
