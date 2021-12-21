package homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	        // Soru 1 : Bir TreeSet ve HashSet’e random 100 sayi ekleyin, islem surelerini kiyaslayin
			// Soru 2 : Ilk soruya 3.bir islem ekleyelim, set’i Hashset olarak olusturup elemanlari 
			//  ekleyelim ve sonra TreeSet’e cevirip yazdiralim
			// Long time=System.currentTimeMilis() method’unu kullaninýz
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Set<Integer> ts=new TreeSet<>();
		Set<Integer> hs=new HashSet<>();
		Random r=new Random(); //random sýnýfýndan random sayý getirecem.
	
		
		Long baslangicTree=System.currentTimeMillis();  // iþleme baþlama süresi 
		for (int i = 1; i <=100; i++) {
			ts.add(r.nextInt());
			}
		Long bitisTree=System.currentTimeMillis();  // iþlemi bitirme süresi 
		

		Long baslangicHash=System.currentTimeMillis();  // iþleme baþlama süresi 
		for (int i = 1; i <= 100; i++) {
			hs.add(r.nextInt());
			}
		Long bitisHash=System.currentTimeMillis();  // iþlemi bitirme süresi 
	
		
		long tsIslemSure=(bitisTree-baslangicTree);  // iþlemi ne kadar sürede yaptýðý
	    long hsIslemSure=(bitisHash-baslangicHash); // iþlemi ne kadar sürede yaptýðý
	
		
		if ( hsIslemSure > tsIslemSure ) {
			System.out.println ("TreeSet daha hýzlýdýr.");
		} else if ( tsIslemSure > hsIslemSure ) {
			System.out.println ("HashSet daha hýzlýdýr.");
		} else {
			System.out.println ("HashSet ve TreeSet ayný hýzdadýr.");
		}
		
		
		//////////////  2. SORU  /////////  Yukarýdaki iþleme 3.bir iþlem daha ekliyorum***
		
		Set<Integer> hs2=new HashSet<>();
		Set<Integer> tsYeni=new TreeSet<>();
		
		Long baslangic3=System.currentTimeMillis();  // iþleme baþlama süresi  
		for (int i = 0; i < 100; i++) {
			hs2.add(r.nextInt());    // hs2ye yine random sayýlarý atýyorum...
		}
		
		for (Integer e : hs2) {
		     tsYeni.add(e);  // Yukarýda aldýgým random sayýlarý TreeSete atýyorum...
		}
		Long bitis3=System.currentTimeMillis();  // iþlemi bitirme süresi
		
		long tshsIslemSure= (bitis3-baslangic3);  // iþlemi yapýþ süresi
		
	//System.out.println(tsYeni.containsAll(hs2));  // true
	// tsYeni ,hs2'yi içeriyor mu içermiyor mu diye saglamasý alýnabilir. Kod dogru çalýþýyor.
		
		
		System.out.println(tsIslemSure);  // 1
		System.out.println(hsIslemSure);  // 0
		System.out.println(tshsIslemSure); // 1
		
		
		
	}

}
