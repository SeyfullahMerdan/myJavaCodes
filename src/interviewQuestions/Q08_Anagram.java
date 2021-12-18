package interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q08_Anagram {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		Ask user to enter  2 Srtrings.
		If the characters and the numbers of characters of the Strings are same then print "Anagram"
		otherwise, print "Not Anagram" on the console.
		Ignore cases
		For example : "Mary" and "army" and "RAMY" are Anagrams

		Kullanýcýdan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf duyarliligi olmadan
		karakterleri ve karakter sayýlarý aynýysa "Anagram" yazdýrýn,   aksi takdirde konsolda "Anagram Deðil" yazdýrýn.
		Ornek : "Pide" ve"EDÝP" anagram ifadelerdir..

		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please type two words to see if it's an Anagram or not: ");
		String str1=scan.next().toLowerCase();
		String str2=scan.next().toLowerCase();
		
		List <String> str11=new ArrayList <> ();
		List <String> str22=new ArrayList <> ();
		
		for (int i = 0; i < str1.length(); i++) {
			str11.add(str1.substring(i, i+1));
		}
		// System.out.println(str11);
		
		for (int i = 0; i < str2.length(); i++) {
			str22.add(str2.substring(i, i+1));
		}
		// System.out.println(str22);
	
		if (str11.size()==str22.size()) {
			if (str11.containsAll(str22)==true) {
				System.out.println("The words \"" + str1 + "\" and \"" + str2 + "\" you typed are Anagrams");
			} else {
				System.out.println("The words \"" + str1 + "\" and \"" + str2 + "\" you typed are not Anagrams");
			}	
		} else {
			System.out.println("The words \"" + str1 + "\" and \"" + str2 + "\" you typed are not Anagrams");
		}
		
		
	

	}

}
