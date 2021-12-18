package interviewQuestions;

import java.util.Scanner;

public class Q12_Palindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		Crteate a program checks if a String is PALINDROME or not.
		If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
		For Example : "madam" or "nurses run" .


		Kuulanýcýnýn girdiði bir  String'in PALINDROME olup olmadýðýný kontrol eden bir method create ediniz
		polindrome :Palindrom, tersten okunuþu da ayný olan cümle
		ornek : Ey edip Adana`da pide ye,  Traþ niçin þart
		 */


		Scanner scan=new Scanner(System.in);
		System.out.println("Please write a sentence to see if it is a palindrome or not:");
		String sentence=scan.nextLine().toLowerCase().replaceAll("\\s", "");
		
		StringBuilder str = new StringBuilder(sentence);
		StringBuilder strRev=str.reverse();
		
		
		String sentenceR=strRev.toString();
	
		
		if (sentenceR.equalsIgnoreCase(sentence)) {
			System.out.println("This sentence \"" + sentence + "\" is a palindrome");
		} else {
			System.out.println("This sentence \"" + sentence + "\" is not a palindrome");
		}


	}
		
	}
