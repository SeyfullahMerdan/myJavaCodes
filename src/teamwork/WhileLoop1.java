package teamwork;

public class WhileLoop1 {

	public static void main(String[] args) {
		/* Kullan�c�dan bir isim ve bir karakter girmesini isteyin, ard�ndan d�ng�leri kullanarak karakterin isimde ka� kez tekrarland���n� kontrol edin.

       char ch1= 'a' ;                        

	   String name =�John came late" 

	   Expected Output: 


       Number of a = 2  */

		
		
		   char ch1='a' ;                        

		   String name="John came late";
		
		   
		   int sayi=0;
		   
		   int sayac=0;
		   
		   while (sayi<=name.length()-1) {
		
			   if (name.charAt(sayi)==ch1 ) {
				sayac++;
			}
			   sayi++;
			   
			   
		}
		   System.out.println(sayac);

		
		
		
		
		
	}

}
