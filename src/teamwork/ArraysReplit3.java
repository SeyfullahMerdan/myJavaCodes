package teamwork;

public class ArraysReplit3 {

	public static void main(String[] args) {
		/* Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

        input : ade1r4d3

        output : 8

         Hint :
         Use Character.isDigit()
         Integer.valueOf()     */

		
		str("ade1r4d3");
		
		
	}

	private static void str(String string) {
		
		int toplam=0;
		
		for (int i = 0; i < string.length(); i++) {
			
			if ( Character.isDigit(string.charAt(i))) {
				
				toplam+=Integer.parseInt(string.substring(i,i+1));
				
				
			}
			
		}
		
		System.out.println(toplam);
		
	}

}
