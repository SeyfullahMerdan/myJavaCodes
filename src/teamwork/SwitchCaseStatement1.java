package teamwork;

import java.util.Scanner;

public class SwitchCaseStatement1 {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen g�n isimlerinden birinin ba� harfini yaz�n�z.");		
		
		char harf=scan.next().toUpperCase().charAt(0);
		
		switch (harf) {
		
		
		
		   case 'P':
			System.out.println("pazartesi,persembe,pazar");
			break;
           case 'S':
			System.out.println("sali");
			break;
           case 'C':
	System.out.println("cuma cumartesi cawrsamba");
	         break;

			
		   default: 
			System.out.println("L�tfen gecerli bir hafr giriniz.");
			break;
		}
		
		
		
		
		
		
		scan.close();
		
		

	}

}
