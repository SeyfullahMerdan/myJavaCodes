package constructor_runner;

import java.util.Scanner;

public class ScholRunner {

	@SuppressWarnings({ "unused", "static-access", "resource" })
	public static void main(String[] args) {
		// School class�ndaki variablelar ile basit bir 5 �grencilik e-s�n�f uygulamas� olu�turuyorum.
		
		School o1=new School( "Ali", "Yildiz", 'E', 11, "Zeynel Koca" , "E�it A��rl�k"   );

		School o2=new School( "Cemre", "Korkmaz", 'K', 12, "Serap Aslan" , "E�it A��rl�k"   );
		
		School o3=new School( "Yasemin", "Ba�er", 'K', 11, "Zeynel Koca" , "E�it A��rl�k"   );
		
		School o4=new School( "Ahmet", "Bilgin", 'E', 12, "Serap Aslan" , "Say�sal"   );

		School o5=new School( "Salih", "T�men", 'E', 12, "Serap Aslan" , "Say�sal"   );
		
	//	 School o6=new School( "Melek", "Suba��", 'K', 11, "Zeynel Koca" , "Say�sal"   );  // 6. obje bu �ekilde olabilir. Gerek yok 5 tane var zaten.
		
		// 5 adet obje olu�turdum. ��inde ad-soyad-cinsiyet-s�n�f-�gretmen-b�l�m olacak �ekilde parametre koydum ve diger classdaki constructora baglad�m.
		
		School okulBilgi=new School ();  // parametresiz okulBilgi ad�nda obje olu�turdum. Okul bilgisi olacak sadece. deger vermeyecem bu classta
		
		// Hepsini yazd�r�p nas�l g�r�nd�g�ne bak�yorum.
		
		System.out.println("Okul ��renci Listesi");
		System.out.println ( "Okul Bilgileri: **Okul Ad�: " + okulBilgi.okul+" **Okul M�d�r�: "+okulBilgi.mudur+" **Okul Adres:  "+okulBilgi.adres    );
		System.out.println(); // Okul bilgileri static ve deger atanm��. okulBilgi default degerleri alacak, School class�nda yazd�g�m�z.
		System.out.println ( o1.ad+" "+o1.soyad+" "+o1.cinsiyet+" "+o1.sinif+" "+o1.ogretmen+" " +o1.bolum);
		System.out.println ( "\n" +o2.ad+" "+o2.soyad+" "+o2.cinsiyet+" "+o2.sinif+" "+o2.ogretmen+" " +o2.bolum);  // Tek tek g�rd�m nas�l g�r�n�yor
		System.out.println ( "\n" +o3.ad+" "+o3.soyad+" "+o3.cinsiyet+" "+o3.sinif+" "+o3.ogretmen+" " +o3.bolum);
		System.out.println ("\n" + o4.ad+" "+o4.soyad+" "+o4.cinsiyet+" "+o4.sinif+" "+o4.ogretmen+" " +o4.bolum);
		System.out.println ( "\n" +o5.ad+" "+o5.soyad+" "+o5.cinsiyet+" "+o5.sinif+" "+o5.ogretmen+" " +o5.bolum );
	//	 System.out.println ("\n" + o6.ad+" "+o6.soyad+" "+o6.cinsiyet+" "+o6.sinif+" "+o6.ogretmen+" " +o6.bolum);
		
		System.out.println();  // Arada bo�lu b�rakt�m
		System.out.println("��renci Not Giri� ��lemi");
		
		Scanner scan=new Scanner(System.in);  // Kullan�c�dan notlar� girmesini isteycegim
		System.out.println("\n"+"L�tfen "+o1.ad+ " adl� ��rencinin s�ras� ile T�rk�e, Tarih, Cografya, Matematik dersi notlar�n� giriniz.");
	
		o1.turkceNot=scan.nextDouble();  // notlar� kullan�c�dan ald�m ve School clas�ndaki variablelar�ma deger verdirdim.
		o1.tarihNot=scan.nextDouble();
		o1.cografyaNot=scan.nextDouble();
		o1.matNot=scan.nextDouble();
		
		o1.ea(o1.turkceNot, o1.tarihNot, o1.cografyaNot, o1.matNot );  // School class�ndaki methoda gitti ve methodu getirdi.
		
		System.out.println("\n"+"L�tfen "+o2.ad+ " adl� ��rencinin s�ras� ile T�rk�e, Tarih, Cografya, Matematik dersi notlar�n� giriniz.");
	
		o2.turkceNot=scan.nextDouble();  // notlar� kullan�c�dan ald�m ve School clas�ndaki variablelar�ma deger verdirdim.
		o2.tarihNot=scan.nextDouble();
		o2.cografyaNot=scan.nextDouble();
		o2.matNot=scan.nextDouble();              // o1 nesnesi ile o2 nesnesi ayn� idi. Ayn� i�lemleri yapt�m *****************
		
		o2.ea(o2.turkceNot, o2.tarihNot, o2.cografyaNot, o2.matNot );  // School class�ndaki methoda gitti ve methodu getirdi.
		
		
		System.out.println("\n"+"L�tfen "+o3.ad+ " adl� ��rencinin s�ras� ile T�rk�e, Tarih, Cografya, Matematik dersi notlar�n� giriniz.");
	
		o3.turkceNot=scan.nextDouble();  // notlar� kullan�c�dan ald�m ve School clas�ndaki variablelar�ma deger verdirdim.
		o3.tarihNot=scan.nextDouble();
		o3.cografyaNot=scan.nextDouble();
		o3.matNot=scan.nextDouble();              // o1 nesnesi ile o2 nesnesi ve o3 ayn� idi. Ayn� i�lemleri yapt�m *****************
		
		o3.ea(o3.turkceNot, o3.tarihNot, o3.cografyaNot, o3.matNot );  // School class�ndaki methoda gitti ve methodu getirdi.
		
		
		
		System.out.println("\n"+"L�tfen "+o4.ad+ " adl� ��rencinin s�ras� ile Matemaik, Fizik, Kimya, Biyoloji ve T�rk�e dersi notlar�n� giriniz.");
		
		o4.matNot=scan.nextDouble();     // notlar� kullan�c�dan ald�m ve School clas�ndaki variablelar�ma deger verdirdim.
		o4.fizikNot=scan.nextDouble();         // Say�sal 5 ders vard�. 5 tane deger ald�m. 
		o4.kimyaNot=scan.nextDouble();
		o4.biyologiNot=scan.nextDouble();              
		o4.turkceNot=scan.nextDouble();
		
		o4.say(o4.matNot, o4.fizikNot, o4.kimyaNot,o4.biyologiNot,o4.turkceNot );  // School class�ndaki SAY methoduna gitti ve methodu getirdi.
		
        
		System.out.println("\n"+"L�tfen "+o5.ad+ " adl� ��rencinin s�ras� ile Matemaik, Fizik, Kimya, Biyoloji ve T�rk�e dersi notlar�n� giriniz.");
		
		o5.matNot=scan.nextDouble();     // notlar� kullan�c�dan ald�m ve School clas�ndaki variablelar�ma deger verdirdim.
		o5.fizikNot=scan.nextDouble();         // Say�sal 5 ders vard�. Bu obje i�inde 5 tane deger ald�m. 
		o5.kimyaNot=scan.nextDouble();
		o5.biyologiNot=scan.nextDouble();              
		o5.turkceNot=scan.nextDouble();
		
		o5.say(o5.matNot, o5.fizikNot, o5.kimyaNot,o5.biyologiNot,o5.turkceNot );  // School class�ndaki SAY methoduna gitti ve methodu getirdi.
		
	}

}
