package teamwork;

import java.util.Scanner;

public class IfStatement1 {

	public static void main(String[] args) {

		
		/*
		 
		  Kullanicidan bir sayi alin 	
				// Girilen say� hem 2 ile hem de 3 ile tam b�l�nebiliyorsa �2 ve 3��n kat��,     // 1.durum
				// sadece 2 ile b�l�nebiliyorsa �2�nin kat��,                               //2
				// sadece 3 ile b�l�nebiliyorsa �3��n kat��,                                 // 3
				// ne 2�ye ne de 3�e b�l�nm�yorsa �2 veya 3��n kat� de�il� mesaj� veren program yazin        // 4. durum
		  
		 
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir tam say� giriniz");
		double sayi=scan.nextDouble();
		
		
		    if (sayi%2==0 && sayi%3==0) {
		    	System.out.println("2 ve 3 �n kat�d�r");
		
		    }
			else if (sayi%2==0) {
		             System.out.println("2 nin kat�d�r");
		   } else if (sayi%3==0) { 
					
					System.out.println("say� 3 �n kat�d�r");
					}
		   else {
             System.out.println("Ge�ersiz giri� yapt�n�z. l�tfen ge�erli bir giri� yap�n�z.");
		   }
		
	
		scan.close();
		
	}

}
