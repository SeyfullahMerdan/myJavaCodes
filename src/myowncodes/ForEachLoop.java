package myowncodes;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		// Bir String olu�turunuz. bu Stringdeki characterleri foreachloop kullanarak yazd�r�n�z. ipucu: split

		
		String str = "Java �greniyorum ve mutluyum";
		
		String arr[]= str.split("");
		
		System.out.println(Arrays.toString(arr));
		
		
		for (String string : arr) {
			
			System.out.print(string + ",");
			
		}
		
	}

}
