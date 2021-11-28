package arrays_loops_smanipulaions_ifstatement;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop2 {

	
	public static void main(String[] args) {

	
	/* Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each
	loop kullanarak bulunuz. Sonucu ekrana yazdiriniz. */
	
	
	 List <Integer> sayi = new ArrayList <Integer>();
	 
	 sayi.add(2);
	 sayi.add(5);
	 sayi.add(7);
	 sayi.add(9);
	 sayi.add(10);
	 
	 System.out.println(sayi);
	 
	 List <Integer> kareToplam=new ArrayList<Integer>();
	 System.out.println(kareToplam);
	 
	 
	 for (Integer a : sayi) {	
		
		a*=a;
		kareToplam.add(a);

	}
	 System.out.println(kareToplam);
	 
	 int toplam=0;

	 for (Integer kareler : kareToplam) {
		
		 toplam+=kareler;
		 
	}

	 System.out.println(toplam);
	
	}
}
