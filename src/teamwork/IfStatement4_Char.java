package teamwork;

import java.util.Scanner;

public class IfStatement4_Char {

	public static void main(String[] args) {
		//büyük harfelri küçük, küçük harfleri büyük
		
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String cumle = scan.nextLine();
        String karakter = "";
        for (int i = 0; i <= cumle.length() - 1; i++) {
            if (cumle.charAt(i) >= 'A' && cumle.charAt(i) <= 'Z') {
                karakter += cumle.substring(i, i + 1).toLowerCase();
            } else if (cumle.charAt(i) >= 'a' && cumle.charAt(i) <= 'z') {
                karakter += cumle.substring(i, i + 1).toUpperCase();
            } else {
                karakter += cumle.charAt(i);
            }
        }
        System.out.println(karakter);
		
        scan.close();
		}
	}
