package arrays_loops_smanipulaions_ifstatement;

import java.util.Scanner;

public class Artikyilsorusu {

	public static void main(String[] args) {
		

	//  Kullanýcýdan artik yil olup olmadýgýný kontrol etmek için yýl girmesini isteyin.
        // Kurallar :::
 //  4 ile bölünemeyen yillar artýk yýl degildir
 //  4 ile bölünüp 100 ile bölünemeyen yýllar artýk yýldýr.
 //  4'ün katý olmasýna raðmen 100 ile bölünebilen yýllardan sadece
 //       400'ün katý olan yýllar artýk yýldýr.
 
 
  Scanner scan=new Scanner(System.in);
  System.out.println("Lütfen bir yýl giriniz: ");
  int yil=scan.nextInt();
 
 if (yil%4!=0) {
     System.out.println("Girdiginiz yýl bir artýk yýl degildir!");         // 4 e bölünemeyen yýllar ayýklandý.
 } 
 
 else if (yil%4==0)           // 4e bölünebilen bütün yýllar buraya alýndý. 4e bölünemeyen yýl olma ihtimali yok.
 
 {
     
     if (yil%100!=0) {                    // 4 ile bölünebilen yýllardan 100'e bölünemeyenler artýk yýldýr kuralýný burada yakaladý.
         System.out.println("Girdiginiz yýl 100'e bölünemeyen bir artýk yýldýr.");
     } 
     else if (yil%100==0 && yil%400==0) {           // 
         System.out.println("Girdiginiz yýl bir artýk yýldýr.");  // 100 ile bölünebilen ve ayný zamanda 400ün katý olan sayýlarý aldý.
     }           
     
 }
 
 else {
     System.out.println("Lütfen geçerli bir giriþ yapýnýz. Geçersiz giriþ.");
 }
 
 scan.close();
		
		
		
		
		
		
		
		
        
		
	}

}
