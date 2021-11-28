package teamwork;

public class WhileLoop1 {

	public static void main(String[] args) {
		/* Kullanýcýdan bir isim ve bir karakter girmesini isteyin, ardýndan döngüleri kullanarak karakterin isimde kaç kez tekrarlandýðýný kontrol edin.

       char ch1= 'a' ;                        

	   String name =“John came late" 

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
