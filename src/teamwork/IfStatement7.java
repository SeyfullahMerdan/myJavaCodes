package teamwork;

import java.util.Scanner;

public class IfStatement7 {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen mail adresinizi giriniz.");
		String mail=scan.next();
		
		
		if (!mail.contains("@")) {
			System.out.println("Ge�ersin mail adresi girdiniz. Bir daha deneyiniz.");
			
		} else if (!mail.contains("@gmail.com") ) {
			System.out.println("L�tfen gmail adresinzi giriniz.");

		}
		
		else if(!mail.endsWith("@gmail.com")) {
			System.out.println("yaz�mda bir sorun var. maili kontrol ediniz.");

		}
		
		else {
			System.out.println("Mail adresiniz kaydedildi.");

		}
	
		scan.close();
	}

}
