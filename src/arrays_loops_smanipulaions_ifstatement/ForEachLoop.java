package arrays_loops_smanipulaions_ifstatement;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		// Bir String oluþturunuz. bu Stringdeki characterleri foreachloop kullanarak yazdýrýnýz. ipucu: split

		
		String str = "Java ögreniyorum ve mutluyum";
		
		String arr[]= str.split("");
		
		System.out.println(Arrays.toString(arr));
		
		
		for (String string : arr) {
			
			System.out.print(string + ",");
			
		}
		
	}

}
