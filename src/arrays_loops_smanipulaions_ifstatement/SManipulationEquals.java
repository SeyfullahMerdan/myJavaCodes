package arrays_loops_smanipulaions_ifstatement;

public class SManipulationEquals {

	public static void main(String[] args) {
		
		
		String str1= "ALI TOPU AT";
		
		String str2= "ali";
		String str3= "topu";
		String str4= "at" ;
		
		
		System.out.println(str1==str2+" "+str3+" "+str4);
		
		System.out.println(str1.equals(str2+" "+str3+" "+str4));
		
		System.out.println(str1.equalsIgnoreCase(str2+" "+str3+" "+str4));
		// true veriyor çünükü ignore case yaparak içerige baktýk.

		
	}

}
