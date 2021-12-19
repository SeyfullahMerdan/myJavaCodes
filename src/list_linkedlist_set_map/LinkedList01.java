package list_linkedlist_set_map;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

	/*	Node'lari "Ali", "Veli", "Can" ve "Ayse" olan bir LinkedList olusturun.
		Kullanicidan bir isim alin. Bu isim LinkedList'de varsa silin ve kullaniciya "Bu isim 
		LinkedList'de vardi ve silindi“ diye mesaj verin.
		Bu isim LinkedList'de yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj 
		verin    */
		
		
		LinkedList<String> liste=new LinkedList<>();
		liste.add("Ali");
		liste.add("Veli");
		liste.add("Can");
		liste.add("Ayse");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz: \n");
		String isim=scan.next();
		
		System.out.println();
		
		
		if (liste.contains(isim)) {
		
		liste.remove(isim);	
		System.out.println("Bu isim listede vardý ve silindi");	
		System.out.println(liste + " mevcut liste");	
			
		} else {
			
			System.out.println("Bu isim listede yoktu");
			System.out.println("mevcut liste " + liste);
		}
		
		
		
		
	}

}
