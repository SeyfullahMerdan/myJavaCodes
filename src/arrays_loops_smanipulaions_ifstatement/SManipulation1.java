package arrays_loops_smanipulaions_ifstatement;

public class SManipulation1 {

	public static void main(String[] args) {
		// String methodlarini kullanarak ” Java ogrenmek123 Cok guzel@ ”
				// “Java ogrenmek cok guzel” sekline getirin


		String str="  Java ogrenmek123 Cok guzel@  ";
		
		System.out.println(str);
		
		System.out.println(str.replaceAll("\\d", ""));
		
		System.out.println(str.trim());
		
		
		str=str.trim().replaceAll("\\d", "").replace("C","c").replace("@", "");
		
		System.out.println(str);
		
	}

}
