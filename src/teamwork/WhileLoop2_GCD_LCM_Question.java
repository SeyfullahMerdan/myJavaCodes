package teamwork;

public class WhileLoop2_GCD_LCM_Question {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan 2 tamsayý girmesini ve ardýndan GCD (En Büyük Ortak Bölen) ve
		 * LCM'yi (En Küçük Ortak Kat) bulmasýný isteyin. Input : 30 40 Beklenen Cikti:
		 * copied! Beklenen Cikti:
		 * 
		 * 30 ve 40 icin GCD = 10 3     0 ve 40 icin LCM = 120
		 */

		int sayi1 = 30;
		int sayi2 = 40;

		int sayac = 1;
		int ebob = 1;
		int ekok = 1;
	
		     while (sayac <= 30) { // 1 , 2 , 5, 10 ebob =10

			if (sayi1 % sayac == 0 && sayi2 % sayac == 0) {

				ebob = sayac;}
			
			    sayac++; }
		
		     System.out.println(ebob); 
		      
		     while (sayac>=0) {
			
		    		  ekok=sayi1*sayi2/ebob;
               sayac++; }
		      
	          System.out.println(ekok); 
		      
		     
		

	
	
	}
}