package constructor_runner;

public class School {

	// Constructor ile basit bir e-sýnýf uygulamasý oluþturalým.
	// Bu classi variable ve methodlarýmýzý koyacagýmýz depo olarak kullanacagýz.
	
	String ad;
	String soyad;
	char cinsiyet;
	int sinif;
	String ogretmen;
	String bolum;
	
	double matNot;
	double turkceNot;
	double tarihNot;
	double fizikNot;
	double kimyaNot;
	double biyologiNot;
	double cografyaNot;
	
	static String adres="Çamlýca Mahallesi, Kýzýlay Sokak, Bina No: 89, Ankara ";
	static String mudur="Mehmet Saçlý";
	static String okul="Teknik Eðitim Okulu";
	
	
	public void ea ( double turkceNot, double tarihNot, double cografyaNot, double matNot ) { // Method oldugu için küçük harfle
		
		this.turkceNot=turkceNot;
		this.tarihNot=tarihNot;
		this.cografyaNot=cografyaNot;
		this.matNot=matNot;             
		// Kullanýcý geçersiz girerse diye if koydum
		if ( (this.turkceNot > 100 || this.turkceNot<0) ||  (this.tarihNot > 100 || this.tarihNot<0) ||
				(this.cografyaNot > 100 || this.cografyaNot<0) ||   (this.matNot > 100 || this.matNot<0	)) {
			System.out.println("Geçersiz bir not girdiniz.Lütfen Tekrar deneyiniz.");   // Kullanýcý geçersiz girerse
		} else {
		// Girmezse method çalýþacak. Notlarý ayzacak ve ortalama hesaplayacak
		System.out.println("Öðrencinin Notlarý: Türkçe: " + this.turkceNot+" Tarih: " +   this.tarihNot+" Cografya: " + this.cografyaNot+" Matematik : " +  this.matNot );
		System.out.println( "Eþit Aðýrlýk puanlarý not ortalamasý : " + ( this.turkceNot +  this.tarihNot + this.cografyaNot +  this.matNot )/4 + " 'dir." );
		}
		
	}         
		
	
    public void say (double mat, double fizik, double kimya, double biyoloji, double turkce ) { // Method oldugu için küçük harfle
		
    	// Kullanýcý geçersiz girerse diye if attým.
    	if ( (this.matNot > 100 || this.matNot<0) ||  (this.fizikNot > 100 || this.fizikNot<0) || ( this.kimyaNot >100 || this.kimyaNot<0 ) ||
				(this.biyologiNot > 100 || this.biyologiNot<0) ||   (this.turkceNot > 100 || this.turkceNot<0	)) {
    		
    		do {
    			System.out.println("Geçersiz bir not girdiniz.Lütfen Tekrar deneyiniz.");
			} while ( (this.matNot > 100 || this.matNot<0) ||  (this.fizikNot > 100 || this.fizikNot<0) || ( this.kimyaNot >100 || this.kimyaNot<0 ) ||
					(this.biyologiNot > 100 || this.biyologiNot<0) ||   (this.turkceNot > 100 || this.turkceNot<0	) );                                   
    	} 
    	
    	
    	else {
    	System.out.println("Öðrencinin Notlarý: Matematik: " + this.matNot+" Fizik: " +   this.fizikNot+" Kimya: " + this.kimyaNot
    			+" Biyoloji: " +  this.biyologiNot + " Türkçe: " +this.turkceNot);
		System.out.println( "Sayýsal puanlarý not ortalamasý : " + ( this.matNot + this.fizikNot + this.kimyaNot
			                                                               + this.biyologiNot + this.turkceNot)/5 + " 'dir." );   } 
    	}
	
	
    
    public School () { }   // default constructor // Büyük harfle

          // Constructor
	public School(String ad, String soyad, char cinsiyet, int sinif, String ogretmen, String bolum) {
		// ögrencilerin ad-soyad-cinsiyet-ögretmen ve bölüm bilgilerini girecegim constructor
		
		this.ad=ad;
		this.soyad=soyad;
		this.cinsiyet=cinsiyet;
		this.sinif=sinif;
		this.ogretmen=ogretmen;
		this.bolum=bolum;
		
		
	}
    
	
	}
