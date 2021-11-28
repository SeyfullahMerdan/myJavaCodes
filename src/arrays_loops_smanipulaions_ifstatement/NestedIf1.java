package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class NestedIf1 {

	public static void main(String[] args) {
		
		/* Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		    Kullanicidan bir sifre girmesini isteyin.
		    
		    Eger ilk harf buyuk harf ise “A” olup olmadigini
		    kontrol edin.                  Ilk harf A ise “Gecerli Sifre” degilse “Gecersiz Sifre”
		    yazdirin.   Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk
		                                                                harf z ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen bir þifre giriniz : ");
		char sifre=scan.next().charAt(0);
		
		if (sifre>='A' && sifre<='Z') {
			if (sifre=='A') {
				System.out.println("Geçerli Þifre. Þifreniz kabul edilmiþtir.");
			} else {
                System.out.println("Geçersiz Þifre. Þifreniz kabul edilmemiþtir.");
			}
			
		} 
		
		else if (sifre>='a' && sifre<='z') {

			if (sifre=='z') {
				System.out.println("Geçerli Þifre. Þifreniz kabul edilmiþtir.");

			} else {
                System.out.println("Geçersiz Þifre. Þifreniz kabul edilmemiþtir."); }
			
		}
		   else {
          System.out.println("Lütfen ilk karakteri harf olarak giriniz.");
		}
		
 scan.close();
 
	}

}
