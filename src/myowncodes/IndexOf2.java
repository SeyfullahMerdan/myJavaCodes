package myowncodes;

import java.util.Scanner;

public class IndexOf2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
        Scanner scan=new Scanner(System.in);
		
	    System.out.println ("L�tfen bir c�mle yaz�n�z");
		String cumle=scan.nextLine();
		
		
		System.out.println("Lutfen bir kelime girin");
		String kelime=scan.next();
		
		
		int sozcuk=cumle.indexOf(kelime);
		
		if (sozcuk<=0) {
			System.out.println("c�mlede kullan�lmam��");			
		} else if ( cumle.indexOf(kelime, sozcuk+1) ==-1   ) {
			System.out.println("c�mlede 1 kere kullan�lm�s");
		}
		else {
			System.out.println( "girilen kelime c�mlede 1 kereden fazla kullan�lm�s ");

		}
			
		
	}

}
