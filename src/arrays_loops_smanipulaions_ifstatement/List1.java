package arrays_loops_smanipulaions_ifstatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
	
		  /*
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

    	
    List <String> isimler= new ArrayList <String> (List.of("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
    List <String> isimler1= new ArrayList <> (Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));	
    	
    isimler.set(2, "Furkan");   // elemanlarý degiþtirme.
	isimler.set(7, "Kemal");	

	System.out.println(isimler);
		
	}

}
