package teamwork;

import java.util.Scanner;

public class IfStatement1 {

	public static void main(String[] args) {

		
		/*
		 
		  Kullanicidan bir sayi alin 	
				// Girilen sayý hem 2 ile hem de 3 ile tam bölünebiliyorsa “2 ve 3’ün katý”,     // 1.durum
				// sadece 2 ile bölünebiliyorsa “2’nin katý”,                               //2
				// sadece 3 ile bölünebiliyorsa “3’ün katý”,                                 // 3
				// ne 2’ye ne de 3’e bölünmüyorsa “2 veya 3’ün katý deðil” mesajý veren program yazin        // 4. durum
		  
		 
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir tam sayý giriniz");
		double sayi=scan.nextDouble();
		
		
		    if (sayi%2==0 && sayi%3==0) {
		    	System.out.println("2 ve 3 ün katýdýr");
		
		    }
			else if (sayi%2==0) {
		             System.out.println("2 nin katýdýr");
		   } else if (sayi%3==0) { 
					
					System.out.println("sayý 3 ün katýdýr");
					}
		   else {
             System.out.println("Geçersiz giriþ yaptýnýz. lütfen geçerli bir giriþ yapýnýz.");
		   }
		
	
		scan.close();
		
	}

}
