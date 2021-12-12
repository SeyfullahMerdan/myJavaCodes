package arrays_loops_smanipulaions_ifstatement;

public class SManipulation2 {

	public static void main(String[] args) {

		
		//String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
		//String str1 = “$13.99”
		//String str2 = “$10.55”
 		//ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
		
		String str1="$13.99";
	    String str2="$10.55";
		
	    str1=str1.replace("$", ""); // önce replace ile $ yok ettim 
	    str2=str2.replace("$", "");
	    
		double toplam=Double.valueOf(str1)+Double.valueOf(str2);
		// double value of ile sayýya çevirip matematiksel iþleme soktuk
		System.out.println(toplam);
		
		
		
		
		
	}

}
