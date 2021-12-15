package arrays_loops_smanipulaions_ifstatement;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
	
		// // Verilen bir array'den istenen degere sahip elementleri silip
		// kalaný yeni bir array olark kaydedin ve sonra yeni arrayi yazdýrýn.

		int arr[] = { 3, 5, 6, 7, 6 };

		int silinecek = 6;

		int sayac = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == silinecek) {

				sayac++;
			}

		}

		int yeniArr[] = new int[arr.length - sayac]; // tanýmladýgýmýz arrayin uzunlugunu belirtiyoruz.

		int a = 0;

		for (int i = 0; i < arr.length - 2; i++) { // 0 dan 4 e kadar

			if (arr[i] != silinecek) {

				yeniArr[a] = arr[i]; // 3 5 7
				a++;

			}

		}

		System.out.println(Arrays.toString(yeniArr));

	}

}
