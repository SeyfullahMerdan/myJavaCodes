package myowncodes;

import java.util.Scanner;

public class EqualsIgnoreCase {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen ad�n�z� giriniz.");
		String ad=scan.nextLine();
		
		
		System.out.println("L�tfen soy ad�n�z� giriniz.");
		String soyad=scan.nextLine();
		
		
		
		String adsoyad=ad+soyad;
		
		System.out.println(adsoyad);     
		
		System.out.println(adsoyad==(ad+soyad));
		
		System.out.println((ad+soyad).equalsIgnoreCase(adsoyad));
		
		
		////////////////////////////////////////////
	
		
		
		
		
		
		System.out.println("L�tfen annenizin k�zl�k soyismini giriniz");
		String ansoyad=scan.next();
		
		String ansoyadi=ansoyad;
		
		System.out.println("Annenizin k�zl�k soy isminin son harfi a�ag�daki gibidir \n: " + ansoyadi.charAt(ansoyadi.length()-1)   );
		
		// System.out.println("Annenizin k�zl�k soy isminin son harfi a�ag�daki gibidir \n: " + ansoyadi.length()-1) );
        // yukar�dakinde hata verdi, char i�inde kullan�p dinamik yap� yapacag�z
		
		
		
		System.out.println("L�tfen memleketinizi yaz�n�z");
		String memleket=scan.next();
		
		String sehir=memleket;
		
		System.out.println("Memleketinizin son harfi : " + sehir.charAt(sehir.length()-1));
		
		
	
		System.out.println("l�tfen en sevdiginizin cizgi film karakterinin ismini giriniz");
		String girilenKarakter=scan.next();
		
		String karakter=girilenKarakter;
		
		System.out.println("En sevdiginizin karakterin son harfi : \n " + karakter.charAt(karakter.length()-1));
		
		
		
		
	}

}
