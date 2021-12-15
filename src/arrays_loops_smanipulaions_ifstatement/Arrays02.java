package arrays_loops_smanipulaions_ifstatement;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		// Verilen arrayi tersten yazdýrýn.

		String arr1[] = { "java her yerde" };
		String arr = "";

		for (int i = 0; i < arr1.length; i++) {
			arr += arr1[i];
		}

		String arrYeni[] = arr.split("");

		System.out.println(Arrays.toString(arrYeni)); // [j, a, v, a,  , h, e, r,  , y, e, r, d, e]

		String arrTers = "";

		for (int i = arrYeni.length - 1; i >= 0; i--) {
			arrTers += arrYeni[i];
		}

		System.out.println(arrTers);

	}
}