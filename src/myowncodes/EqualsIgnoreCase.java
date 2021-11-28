package myowncodes;

import java.util.Scanner;

public class EqualsIgnoreCase {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen adýnýzý giriniz.");
		String ad=scan.nextLine();
		
		
		System.out.println("Lütfen soy adýnýzý giriniz.");
		String soyad=scan.nextLine();
		
		
		
		String adsoyad=ad+soyad;
		
		System.out.println(adsoyad);     
		
		System.out.println(adsoyad==(ad+soyad));
		
		System.out.println((ad+soyad).equalsIgnoreCase(adsoyad));
		
		
		////////////////////////////////////////////
	
		
		
		
		
		
		System.out.println("Lütfen annenizin kýzlýk soyismini giriniz");
		String ansoyad=scan.next();
		
		String ansoyadi=ansoyad;
		
		System.out.println("Annenizin kýzlýk soy isminin son harfi aþagýdaki gibidir \n: " + ansoyadi.charAt(ansoyadi.length()-1)   );
		
		// System.out.println("Annenizin kýzlýk soy isminin son harfi aþagýdaki gibidir \n: " + ansoyadi.length()-1) );
        // yukarýdakinde hata verdi, char içinde kullanýp dinamik yapý yapacagýz
		
		
		
		System.out.println("Lütfen memleketinizi yazýnýz");
		String memleket=scan.next();
		
		String sehir=memleket;
		
		System.out.println("Memleketinizin son harfi : " + sehir.charAt(sehir.length()-1));
		
		
	
		System.out.println("lütfen en sevdiginizin cizgi film karakterinin ismini giriniz");
		String girilenKarakter=scan.next();
		
		String karakter=girilenKarakter;
		
		System.out.println("En sevdiginizin karakterin son harfi : \n " + karakter.charAt(karakter.length()-1));
		
		
		
		
	}

}
