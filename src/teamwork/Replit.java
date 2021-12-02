package teamwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Replit {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/* Bir String icerisinde yinelenen karakterleri döndüren bir kod yazýniz.(mülakat Sorusu)

        Input :

       String str=“Javaisalsoeasy”

       Output: a s  */

		
		String str="Javaisalsoeasy";
	    List<String> str1=new ArrayList <>( Arrays.asList(str.split(""))   );
		
		// String split ile ayýrýp tek tek. bunlarý loopun içerisine atacagýz ayný olanlara bakacagýz.
		
		System.out.println(str1);
		
		List<String> strDuzenli=new ArrayList<>();
		
		int index=0;
	
		
	 for (int i = 0; i < str1.size()-1; i++) {
		
		for (int j = i+1; j < str1.size()-1 ; j++) {
			
			if ( str1.get(i).equals(str1.get(j))         ) {
			   
				strDuzenli.add(str1.get(i));	
			}
		}
		
	}  
		
	 System.out.println(strDuzenli);
		
	 Collections.sort(strDuzenli);
		
	 System.out.println(strDuzenli);
		
		
		
		
	}

}
