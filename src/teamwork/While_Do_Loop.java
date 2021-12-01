package teamwork;

import java.util.Scanner;

public class While_Do_Loop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		int toplam=0;
		
		System.out.println("sayi lazim");
		
		int sayi=scan.nextInt();
	
	/*	while (sayi!=0) {
			
			toplam+=sayi;
			sayi=scan.nextInt();
		}
		System.out.println(toplam); */
		
		
		
		do {
			toplam+=sayi;
			sayi=scan.nextInt();
			
		} while (sayi!=0);
		
		System.out.println(toplam);
		
		
		
		
		

	}

}
