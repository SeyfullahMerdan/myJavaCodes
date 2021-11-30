package arrays_loops_smanipulaions_ifstatement;

public class ArraysPraktice3 {

	public static void main(String[] args) {
		
		/*
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */


		int arr[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		
		boolean simetrik=false;
		
		for (int i = 0; i < arr.length/2; i++) {
		
			if (arr[i]==arr[arr.length-1-i]) {
			
				simetrik=true;
		
			} else {
				simetrik=false;
				break;
			}
		}
		
		System.out.println(simetrik);
		
		
		// en son olan dogruyu kabul ediyor, yanlýþý buldu mu kod çalýþmayý durdurmalý.

		
	}
}
