package constructor_runner;

public class School {

	// Constructor ile basit bir e-s�n�f uygulamas� olu�tural�m.
	// Bu classi variable ve methodlar�m�z� koyacag�m�z depo olarak kullanacag�z.
	
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
	
	static String adres="�aml�ca Mahallesi, K�z�lay Sokak, Bina No: 89, Ankara ";
	static String mudur="Mehmet Sa�l�";
	static String okul="Teknik E�itim Okulu";
	
	
	public void ea ( double turkceNot, double tarihNot, double cografyaNot, double matNot ) { // Method oldugu i�in k���k harfle
		
		this.turkceNot=turkceNot;
		this.tarihNot=tarihNot;
		this.cografyaNot=cografyaNot;
		this.matNot=matNot;             
		// Kullan�c� ge�ersiz girerse diye if koydum
		if ( (this.turkceNot > 100 || this.turkceNot<0) ||  (this.tarihNot > 100 || this.tarihNot<0) ||
				(this.cografyaNot > 100 || this.cografyaNot<0) ||   (this.matNot > 100 || this.matNot<0	)) {
			System.out.println("Ge�ersiz bir not girdiniz.L�tfen Tekrar deneyiniz.");   // Kullan�c� ge�ersiz girerse
		} else {
		// Girmezse method �al��acak. Notlar� ayzacak ve ortalama hesaplayacak
		System.out.println("��rencinin Notlar�: T�rk�e: " + this.turkceNot+" Tarih: " +   this.tarihNot+" Cografya: " + this.cografyaNot+" Matematik : " +  this.matNot );
		System.out.println( "E�it A��rl�k puanlar� not ortalamas� : " + ( this.turkceNot +  this.tarihNot + this.cografyaNot +  this.matNot )/4 + " 'dir." );
		}
		
	}         
		
	
    public void say (double mat, double fizik, double kimya, double biyoloji, double turkce ) { // Method oldugu i�in k���k harfle
		
    	// Kullan�c� ge�ersiz girerse diye if att�m.
    	if ( (this.matNot > 100 || this.matNot<0) ||  (this.fizikNot > 100 || this.fizikNot<0) || ( this.kimyaNot >100 || this.kimyaNot<0 ) ||
				(this.biyologiNot > 100 || this.biyologiNot<0) ||   (this.turkceNot > 100 || this.turkceNot<0	)) {
    		
    		do {
    			System.out.println("Ge�ersiz bir not girdiniz.L�tfen Tekrar deneyiniz.");
			} while ( (this.matNot > 100 || this.matNot<0) ||  (this.fizikNot > 100 || this.fizikNot<0) || ( this.kimyaNot >100 || this.kimyaNot<0 ) ||
					(this.biyologiNot > 100 || this.biyologiNot<0) ||   (this.turkceNot > 100 || this.turkceNot<0	) );                                   
    	} 
    	
    	
    	else {
    	System.out.println("��rencinin Notlar�: Matematik: " + this.matNot+" Fizik: " +   this.fizikNot+" Kimya: " + this.kimyaNot
    			+" Biyoloji: " +  this.biyologiNot + " T�rk�e: " +this.turkceNot);
		System.out.println( "Say�sal puanlar� not ortalamas� : " + ( this.matNot + this.fizikNot + this.kimyaNot
			                                                               + this.biyologiNot + this.turkceNot)/5 + " 'dir." );   } 
    	}
	
	
    
    public School () { }   // default constructor // B�y�k harfle

          // Constructor
	public School(String ad, String soyad, char cinsiyet, int sinif, String ogretmen, String bolum) {
		// �grencilerin ad-soyad-cinsiyet-�gretmen ve b�l�m bilgilerini girecegim constructor
		
		this.ad=ad;
		this.soyad=soyad;
		this.cinsiyet=cinsiyet;
		this.sinif=sinif;
		this.ogretmen=ogretmen;
		this.bolum=bolum;
		
		
	}
    
	
	}
