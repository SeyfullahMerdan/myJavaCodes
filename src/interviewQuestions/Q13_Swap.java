package interviewQuestions;

public class Q13_Swap {

	public static void main(String[] args) {
		
		/*
	     Write a Java Program to swap two numbers
	         
	     Swap (takas) islemini --> a=3, b=5 iken  a=5, b=3 degerlerini almasý islemidir.
	     iki yoldan yaptiginiz java kodunu yaziniz.
	     1.Yol: 3. degisken kullanarak
	     2.Yol: 3. degisken kullanmadan
	*/
		
		//1. yol

		int a= 3;
		int b= 5;
        System.out.println("Baþlangýçta a ve b sayýlarý : \n" + a + " " + b);

		int bos=0;

		bos=a;
		a=b;
		b=bos;

		bos=0;

		System.out.println("Ýþlemden sonra a ve b sayýlarý : \n" + a + " " + b);

                       System.out.println();
		 //2.yol
		 
		int sayi1=3;
		int sayi2=5;
		System.out.println("Baþlangýçta sayi1 ve sayi2: \n" + sayi1 + "\n" + sayi2);
		sayi1 = (sayi1-sayi2); // farkýný aldým. ( -2 )
		sayi2= (sayi2+sayi1); // farký ile kendisini topladým topladým ( 3 ) 
		 
		sayi1=sayi2-sayi1; // sayý2den farký çýkarýyorum (5)
		System.out.println("Ýþlemden sonra sayi1 ve sayi2 : \n" + sayi1 + "\n" + sayi2);

	}
	}