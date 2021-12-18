package interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_DublicatedElements {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		/*
        Create  a list by getting the list elements from user
        if there is duplicated elements remove them from the list.
​
        Kullanıcıdan aldıgınız elemanlardan oluşan bir listede tekrarlanan elemanları silen bir program create ediniz.
        */

		Scanner scan=new Scanner(System.in);
		List <String> lst=new ArrayList <>();
		int secim=0;
		
		do {
			System.out.println("Lütfen listeye eklemek için String olan bir element giriniz: " );
			String element=scan.next();
			lst.add(element);
	
			System.out.println("İşlemi sonlandırmak için 1, devam etmek için 0 tuşuna basınız");
			secim=scan.nextInt();

		} while (secim!=1);
		
		
		tekrarsiz(lst);
		System.out.println(tekrarsiz(lst));

	}

	
	private static List<String> tekrarsiz(List<String> lst) {
		
		List <String> lstTekrarsiz=new ArrayList<>();
		
		for (int i = 0; i < lst.size(); i++) {
			if (!lstTekrarsiz.contains(lst.get(i))) {
			   lstTekrarsiz.add(lst.get(i));
			}
		}
	
		
		return lstTekrarsiz;	
	}

	
	
	
}
