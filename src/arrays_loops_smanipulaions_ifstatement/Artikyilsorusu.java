package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class Artikyilsorusu {

	public static void main(String[] args) {
		

	//  Kullan�c�dan artik yil olup olmad�g�n� kontrol etmek i�in y�l girmesini isteyin.
        // Kurallar :::
 //  4 ile b�l�nemeyen yillar art�k y�l degildir
 //  4 ile b�l�n�p 100 ile b�l�nemeyen y�llar art�k y�ld�r.
 //  4'�n kat� olmas�na ra�men 100 ile b�l�nebilen y�llardan sadece
 //       400'�n kat� olan y�llar art�k y�ld�r.
 
 
  Scanner scan=new Scanner(System.in);
  System.out.println("L�tfen bir y�l giriniz: ");
  int yil=scan.nextInt();
 
 if (yil%4!=0) {
     System.out.println("Girdiginiz y�l bir art�k y�l degildir!");         // 4 e b�l�nemeyen y�llar ay�kland�.
 } 
 
 else if (yil%4==0)           // 4e b�l�nebilen b�t�n y�llar buraya al�nd�. 4e b�l�nemeyen y�l olma ihtimali yok.
 
 {
     
     if (yil%100!=0) {                    // 4 ile b�l�nebilen y�llardan 100'e b�l�nemeyenler art�k y�ld�r kural�n� burada yakalad�.
         System.out.println("Girdiginiz y�l 100'e b�l�nemeyen bir art�k y�ld�r.");
     } 
     else if (yil%100==0 && yil%400==0) {           // 
         System.out.println("Girdiginiz y�l bir art�k y�ld�r.");  // 100 ile b�l�nebilen ve ayn� zamanda 400�n kat� olan say�lar� ald�.
     }           
     
 }
 
 else {
     System.out.println("L�tfen ge�erli bir giri� yap�n�z. Ge�ersiz giri�.");
 }
 
 scan.close();
		
		
		
		
		
		
		
		
        
		
	}

}
