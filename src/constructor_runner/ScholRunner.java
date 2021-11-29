package constructor_runner;

import java.util.Scanner;

public class ScholRunner {

	@SuppressWarnings({ "unused", "static-access", "resource" })
	public static void main(String[] args) {
		// School classýndaki variablelar ile basit bir 5 ögrencilik e-sýnýf uygulamasý oluþturuyorum.
		
		School o1=new School( "Ali", "Yildiz", 'E', 11, "Zeynel Koca" , "Eþit Aðýrlýk"   );

		School o2=new School( "Cemre", "Korkmaz", 'K', 12, "Serap Aslan" , "Eþit Aðýrlýk"   );
		
		School o3=new School( "Yasemin", "Baþer", 'K', 11, "Zeynel Koca" , "Eþit Aðýrlýk"   );
		
		School o4=new School( "Ahmet", "Bilgin", 'E', 12, "Serap Aslan" , "Sayýsal"   );

		School o5=new School( "Salih", "Tümen", 'E', 12, "Serap Aslan" , "Sayýsal"   );
		
	//	 School o6=new School( "Melek", "Subaþý", 'K', 11, "Zeynel Koca" , "Sayýsal"   );  // 6. obje bu þekilde olabilir. Gerek yok 5 tane var zaten.
		
		// 5 adet obje oluþturdum. Ýçinde ad-soyad-cinsiyet-sýnýf-ögretmen-bölüm olacak þekilde parametre koydum ve diger classdaki constructora bagladým.
		
		School okulBilgi=new School ();  // parametresiz okulBilgi adýnda obje oluþturdum. Okul bilgisi olacak sadece. deger vermeyecem bu classta
		
		// Hepsini yazdýrýp nasýl göründügüne bakýyorum.
		
		System.out.println("Okul Öðrenci Listesi");
		System.out.println ( "Okul Bilgileri: **Okul Adý: " + okulBilgi.okul+" **Okul Müdürü: "+okulBilgi.mudur+" **Okul Adres:  "+okulBilgi.adres    );
		System.out.println(); // Okul bilgileri static ve deger atanmýþ. okulBilgi default degerleri alacak, School classýnda yazdýgýmýz.
		System.out.println ( o1.ad+" "+o1.soyad+" "+o1.cinsiyet+" "+o1.sinif+" "+o1.ogretmen+" " +o1.bolum);
		System.out.println ( "\n" +o2.ad+" "+o2.soyad+" "+o2.cinsiyet+" "+o2.sinif+" "+o2.ogretmen+" " +o2.bolum);  // Tek tek gördüm nasýl görünüyor
		System.out.println ( "\n" +o3.ad+" "+o3.soyad+" "+o3.cinsiyet+" "+o3.sinif+" "+o3.ogretmen+" " +o3.bolum);
		System.out.println ("\n" + o4.ad+" "+o4.soyad+" "+o4.cinsiyet+" "+o4.sinif+" "+o4.ogretmen+" " +o4.bolum);
		System.out.println ( "\n" +o5.ad+" "+o5.soyad+" "+o5.cinsiyet+" "+o5.sinif+" "+o5.ogretmen+" " +o5.bolum );
	//	 System.out.println ("\n" + o6.ad+" "+o6.soyad+" "+o6.cinsiyet+" "+o6.sinif+" "+o6.ogretmen+" " +o6.bolum);
		
		System.out.println();  // Arada boþlu býraktým
		System.out.println("Öðrenci Not Giriþ Ýþlemi");
		
		Scanner scan=new Scanner(System.in);  // Kullanýcýdan notlarý girmesini isteycegim
		System.out.println("\n"+"Lütfen "+o1.ad+ " adlý öðrencinin sýrasý ile Türkçe, Tarih, Cografya, Matematik dersi notlarýný giriniz.");
	
		o1.turkceNot=scan.nextDouble();  // notlarý kullanýcýdan aldým ve School clasýndaki variablelarýma deger verdirdim.
		o1.tarihNot=scan.nextDouble();
		o1.cografyaNot=scan.nextDouble();
		o1.matNot=scan.nextDouble();
		
		o1.ea(o1.turkceNot, o1.tarihNot, o1.cografyaNot, o1.matNot );  // School classýndaki methoda gitti ve methodu getirdi.
		
		System.out.println("\n"+"Lütfen "+o2.ad+ " adlý öðrencinin sýrasý ile Türkçe, Tarih, Cografya, Matematik dersi notlarýný giriniz.");
	
		o2.turkceNot=scan.nextDouble();  // notlarý kullanýcýdan aldým ve School clasýndaki variablelarýma deger verdirdim.
		o2.tarihNot=scan.nextDouble();
		o2.cografyaNot=scan.nextDouble();
		o2.matNot=scan.nextDouble();              // o1 nesnesi ile o2 nesnesi ayný idi. Ayný iþlemleri yaptým *****************
		
		o2.ea(o2.turkceNot, o2.tarihNot, o2.cografyaNot, o2.matNot );  // School classýndaki methoda gitti ve methodu getirdi.
		
		
		System.out.println("\n"+"Lütfen "+o3.ad+ " adlý öðrencinin sýrasý ile Türkçe, Tarih, Cografya, Matematik dersi notlarýný giriniz.");
	
		o3.turkceNot=scan.nextDouble();  // notlarý kullanýcýdan aldým ve School clasýndaki variablelarýma deger verdirdim.
		o3.tarihNot=scan.nextDouble();
		o3.cografyaNot=scan.nextDouble();
		o3.matNot=scan.nextDouble();              // o1 nesnesi ile o2 nesnesi ve o3 ayný idi. Ayný iþlemleri yaptým *****************
		
		o3.ea(o3.turkceNot, o3.tarihNot, o3.cografyaNot, o3.matNot );  // School classýndaki methoda gitti ve methodu getirdi.
		
		
		
		System.out.println("\n"+"Lütfen "+o4.ad+ " adlý öðrencinin sýrasý ile Matemaik, Fizik, Kimya, Biyoloji ve Türkçe dersi notlarýný giriniz.");
		
		o4.matNot=scan.nextDouble();     // notlarý kullanýcýdan aldým ve School clasýndaki variablelarýma deger verdirdim.
		o4.fizikNot=scan.nextDouble();         // Sayýsal 5 ders vardý. 5 tane deger aldým. 
		o4.kimyaNot=scan.nextDouble();
		o4.biyologiNot=scan.nextDouble();              
		o4.turkceNot=scan.nextDouble();
		
		o4.say(o4.matNot, o4.fizikNot, o4.kimyaNot,o4.biyologiNot,o4.turkceNot );  // School classýndaki SAY methoduna gitti ve methodu getirdi.
		
        
		System.out.println("\n"+"Lütfen "+o5.ad+ " adlý öðrencinin sýrasý ile Matemaik, Fizik, Kimya, Biyoloji ve Türkçe dersi notlarýný giriniz.");
		
		o5.matNot=scan.nextDouble();     // notlarý kullanýcýdan aldým ve School clasýndaki variablelarýma deger verdirdim.
		o5.fizikNot=scan.nextDouble();         // Sayýsal 5 ders vardý. Bu obje içinde 5 tane deger aldým. 
		o5.kimyaNot=scan.nextDouble();
		o5.biyologiNot=scan.nextDouble();              
		o5.turkceNot=scan.nextDouble();
		
		o5.say(o5.matNot, o5.fizikNot, o5.kimyaNot,o5.biyologiNot,o5.turkceNot );  // School classýndaki SAY methoduna gitti ve methodu getirdi.
		
	}

}
