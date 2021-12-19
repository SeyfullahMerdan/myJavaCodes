package list_linkedlist_set_map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		/*
		 * Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program
		 * yaziniz … (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz) Orn :
		 * [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil) output:
		 * [23,40]
		 */

		
		
		List <Integer> liste=new ArrayList<>();
		liste.add(2);
		liste.add(13);
		liste.add(56);
		liste.add(23);
		liste.add(45);
		liste.add(14);
		liste.add(40);
		System.out.println(liste);
		
		
		Iterator ite=liste.iterator();
		
		while (ite.hasNext()) {
		
		int ls=(int) ite.next();
		if (ls<20 || ls>40) {
			ite.remove();
		}	
				
		}
		System.out.println(liste);
		
		
		
		
		
		
		
	}

}
