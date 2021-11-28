package myowncodes;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		// For loop ve While loop kullanarak 4 basamaklý sayýlardan 15 ve 20 ve 90'na tam bölünebilen sayýlarý yazdýrýn.
		
		
		int sayi=1000;
		
		while (sayi<=9999) {
			
			if (sayi%15==0 && sayi%20==0 && sayi%90==0) {
				System.out.println("15 , 20 ve 90 sayýsýna tam bölünebilen sayýlar : " + sayi);
			}
			sayi++;
		}
		
		
		
		
		
		

	}

}
