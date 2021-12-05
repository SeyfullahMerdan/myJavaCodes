package projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import teamwork.SwitchCaseStatement1;

@SuppressWarnings("unused")
public class Kitapci {
	
    static int count=1000;
	static List <String> kitapAdi=new ArrayList<>();
	static List <String> yazarAdi=new ArrayList<>();
	static List <Double> fiyati=new ArrayList<>();
	static List <Integer> kitapNo=new ArrayList<>();
	

	public static void main(String[] args) {
		
		/*  ====================PAZAR PROJEMIZ============================== 
		 * bir kitapci icin program yazalim 
		 * kitap no 1000'den baslayacak sirali no olsun
		 * program baslayinca menu isminde bir method calissin 
		 * 1-kitap ekle 
		 * 2-numara ile kitap goruntule 
		 * 3-bilgi ile kitap goruntule 
		 * 4-numara ile kitap sil 
		 * 5-tum kitaplar listele 
		 * 6-cikis
		 ************************************
		 * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
		   yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer olmali yani bir list'te tutmamiz gerek 
		   2-kitap numarasi 1000'den baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
		    count=1000; 
		   menu isminde bir method olusturmaliyim,
		   3-kitap ekle diye bir method olusturmliyim,bu method farkli bir classda
		   4-kullanicidn kitap adi yazar adi ve fiyat bilgileri istenmeli
		 */
		
		
		System.out.println(        "        ********************SANAL KÝTABEVÝNE HOÞGELDÝNÝZ********************       "   );
		
		System.out.println("                 **********ÝÞLEMLERÝNÝZ ARTIK ÇOK KOLAY!************             ");
		
		System.out.println("    //// MENÜ ////                         ");
		
		
		menu();
		

	}

	@SuppressWarnings("resource")
	private static void menu() {
		
		Scanner scan=new Scanner(System.in);
		int secim=0;
		
		System.out.println("\nLütfen yapmak istediginiz iþlemi seçiniz. Ardýndan enter tuþuna basýnýz.\n");
			
		System.out.println( "1-)KÝTAP EKLE\n2-)NUMARA ÝLE KÝTAP GÖRÜNTÜLE\n3-)KÝTAP BÝLGÝSÝ ÝLE KÝTAP GÖRÜNTÜLE\n4-)NUMARA ÝLE KÝTAP SÝL\n5-)TÜM KÝTAPLARI LÝSTELE\n6-)ÇIKIÞ");
		   
		secim=scan.nextInt();
		
		switch (secim) {
		case 1: 
			System.out.println("\nKitap Ekleme Sekmesine Hoþgeldiniz.Lütfen Yönergeleri izleyiniz.");
			kitapekle();
		
			break;

		case 2:
			
			numarakitapgörüntüle();
			
			break;	
			
		case 3:
			
			bilgikitapgörüntüle();
			
			break;
			
		case 4:
			
			kitapsil();
			
			break;
		
		case 5:
			
			kitaplarilistele();
			
			break;
		
		case 6:
			System.out.println("\n\t\t\t********************ÇIKIÞ ÝÞLEMÝNÝZ BAÞARI ÝLE GERÇEKLEÞTÝRÝLMÝÞTÝR. TEÞEKKÜR EDER, ÝYÝ GÜNLER DÝLERÝZ********************");
			
			break;
			
		default:
			
			do {
				System.out.println("YANLIÞ BÝR GÝRÝÞ YAPTINIZ.LÜTFEN TEKRAR DENEYÝNÝZ.\n1-)KÝTAP EKLE\n2-)NUMARA ÝLE KÝTAP GÖRÜNTÜLE\n3-)KÝTAP BÝLGÝSÝ ÝLE KÝTAP GÖRÜNTÜLE\n4-)NUMARA ÝLE KÝTAP SÝL\n5-)TÜM KÝTAPLARI LÝSTELE\n6-)ÇIKIÞ");
			    secim=scan.nextInt();
			} while (secim<1 || secim>6);
			
		}
		
	
	}

	private static void kitapekle() {
		

		
		int karar=0;
		String kitap="";
		String yazar="";
	    double ücret=0;
		int toplamEklenen=0;
	    
		
		do {
		  
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Lütfen eklemek istediginiz kitabýn adýný giriniz : ");
			kitap=scan.nextLine().toUpperCase();
			
			System.out.println("Lütfen kitabýn yazarýný giriniz : ");
			yazar=scan.nextLine().toUpperCase();
			
			System.out.println("Lütfen kitabýn fiyatýný giriniz : ");
			ücret=scan.nextDouble();
			
			
			kitapAdi.add(kitap);
			yazarAdi.add(yazar);
			fiyati.add(ücret);
		    kitapNo.add(count);
			
		    System.out.println("\nEklenen Kitap Bilgileri : "+"\n\nKitap No:"+kitapNo.get(toplamEklenen)  +"    "+"\nKitap Adý:"+kitap+"    "+"\nKitap Yazarý:"+yazar+"    "+"\nKitap Ücret:"+ücret+"$\n");
		    
		    count++;
			
			System.out.println("\nKitap eklemeye devam etmek için 1\nÝþlemi sonlandýrmak için 2'yi tuþlayýnýz.\n");
			karar=scan.nextInt();
		
			toplamEklenen++;
			
			
		} while (karar==1);
		
		
		
		
		  System.out.println("Kitap ekleme iþlemi baþarý ile gerçekleþtirildi.Teþekkürler.\n");	
		
		  menu();

	}	

	@SuppressWarnings("resource")
	private static void kitaplarilistele() {
		
		System.out.println("**********KÝTAP LÝSTESÝ**************\n");
		Scanner scan=new Scanner(System.in);
	
		if (kitapNo.size()>0) {
			
			System.out.println(" KÝTAP NO        KÝTAP ADI        KÝTABIN YAZARI        KÝTABIN FÝYATI " );
			for (int i = 0; i < kitapNo.size(); i++) {
				
				//System.out.println(" KÝTAP NO        KÝTAP ADI        KÝTABIN YAZARI        KÝTABIN FÝYATI " );
				System.out.println(kitapNo.get(i) + "        "  +  kitapAdi.get(i) + "        " + yazarAdi.get(i) + "         " + fiyati.get(i) );
				
			}
				
			System.out.println("\nMenüye dönmek için 1\nÇýkýþ yapmak için 2 tuþlayýn.");
			int karar=scan.nextInt();
			
			switch (karar) {
			case 1:
				menu();
				break;
			case 2:
				System.out.println("\n********************ÇIKIÞ ÝÞLEMÝNÝZ BAÞARI ÝLE GERÇEKLEÞTÝRÝLMÝÞTÝR. TEÞEKKÜR EDER, ÝYÝ GÜNLER DÝLERÝZ********************");
				break;
			default:
				
				do {
					System.out.println("\nYANLIÞ BÝR GÝRÝÞ YAPTINIZ.LÜTFEN TEKRAR DENEYÝNÝZ.\nMenüye dönmek için 1\\nÇýkýþ yapmak için 2 tuþlayýn.\n");
				    karar=scan.nextInt();
				} while (karar<1 || karar>2);
				
				break;
			}
			
		} 
		
		
		if (kitapNo.size()<=0) {
			System.out.println("\nHenüz eklenmiþ bir kitap bulunmamaktadýr. \n\n\n");
			
			System.out.println("\nMenüye dönmek için 1\nÇýkýþ yapmak için 2 tuþlayýn.\n");
			int karar2=scan.nextInt();
			
			switch (karar2) {
			case 1:
				menu();
				break;
			case 2:
				System.out.println("\n********************ÇIKIÞ ÝÞLEMÝNÝZ BAÞARI ÝLE GERÇEKLEÞTÝRÝLMÝÞTÝR. TEÞEKKÜR EDER, ÝYÝ GÜNLER DÝLERÝZ********************");
				break;
			default:
				
				do {
					System.out.println("\nYANLIÞ BÝR GÝRÝÞ YAPTINIZ.LÜTFEN TEKRAR DENEYÝNÝZ.\nMenüye dönmek için 1\\nÇýkýþ yapmak için 2 tuþlayýn.\n");
				    karar2=scan.nextInt();
				} while (karar2<1 || karar2>2);
				
				break;
			}
			
		}
		
		
	
		
	}

	private static void kitapsil() {
		
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);

		int no=0;
	    int karar=0;
		int toplamSilinen=0;
	    int index=0;
		
	    if (kitapNo.size()<=0) {
			System.out.println("\nHenüz eklenmiþ bir kitap bulunmamaktadýr. \n\n\n");
			
			System.out.println("\nMenüye dönmek için 1\nÇýkýþ yapmak için 2 tuþlayýn.\n");
			int karar3=scan.nextInt();
			
			switch (karar3) {
			case 1:
				menu();
				break;
			case 2:
				System.out.println("\n********************ÇIKIÞ ÝÞLEMÝNÝZ BAÞARI ÝLE GERÇEKLEÞTÝRÝLMÝÞTÝR. TEÞEKKÜR EDER, ÝYÝ GÜNLER DÝLERÝZ********************");
				break;
			default:
				
				do {
					System.out.println("\nYANLIÞ BÝR GÝRÝÞ YAPTINIZ.LÜTFEN TEKRAR DENEYÝNÝZ.\nMenüye dönmek için 1\\nÇýkýþ yapmak için 2 tuþlayýn.\n");
				    karar3=scan.nextInt();
				} while (karar3<1 || karar3>2);
				
				break;
			}
			
		}
		
	    
	    if (kitapNo.size()>0) {
	    
		do {
		  
		
			
			System.out.println("Lütfen silmek istediginiz kitabýn nosunu giriniz : ");
			no=scan.nextInt();
			
			index=kitapNo.indexOf(no);
			
			// System.out.println(index);
			
			 System.out.println("\nSilinen Kitap Bilgileri : "+"\n\nKitap No:"+kitapNo.get(index)  +"    "+"\nKitap Adý:"+kitapAdi.get(kitapNo.get(index))
			  +"    "+"\nKitap Yazarý:"+yazarAdi.get(kitapNo.get(index))+"    "+"\nKitap Ücret:"+fiyati.get(kitapNo.get(index))+"\n");
		
		
			kitapNo.remove(index);
			yazarAdi.remove(index);
			kitapAdi.remove(index);
			fiyati.remove(index);

			System.out.println("\nKitap silmeye devam etmek için 1\nÝþlemi sonlandýrmak için 2'yi tuþlayýnýz.\n");
			karar=scan.nextInt();
		
			toplamSilinen++;
			
			
		} while (karar==1);
		
		
		
		
		  System.out.println("\nKitap silme iþlemi baþarý ile gerçekleþtirildi. Teþekkürler. ");	
		
		  menu();
	    }
	
		
	}

	private static void bilgikitapgörüntüle() {
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		 
		 String kitapismi="";
         String yazarismi="";
         
         int karar5=0;
         int toplamGörüntülenen=0;
		 int index5=0;
		
		
		if (kitapNo.size()<=0) {
			System.out.println("\nHenüz eklenmiþ bir kitap bulunmamaktadýr. \n\n\n");
			
			System.out.println("\nMenüye dönmek için 1\nÇýkýþ yapmak için 2 tuþlayýn.");
			int karar4=scan.nextInt();
			
			switch (karar4) {
			case 1:
				menu();
				break;
			case 2:
				System.out.println("\n********************ÇIKIÞ ÝÞLEMÝNÝZ BAÞARI ÝLE GERÇEKLEÞTÝRÝLMÝÞTÝR. TEÞEKKÜR EDER, ÝYÝ GÜNLER DÝLERÝZ********************");
				break;
			default:
				
				do {
					System.out.println("\nYANLIÞ BÝR GÝRÝÞ YAPTINIZ.LÜTFEN TEKRAR DENEYÝNÝZ.\nMenüye dönmek için 1\\nÇýkýþ yapmak için 2 tuþlayýn.\n");
				    karar4=scan.nextInt();
				} while (karar4<1 || karar4>2);
				
				break;
			}
			
		}
		
		
		 if (kitapNo.size()>0) {
		
		
		

				do {
					  
					
					System.out.println("Lütfen görüntülemek istediginiz kitabýn adýný giriniz : ");
					
					kitapismi=scan.nextLine().toUpperCase();
					
					index5=kitapAdi.indexOf(kitapismi);
					
					
					System.out.println(index5);
					
				System.out.println("\nGörüntülenen Kitap Bilgileri: "+"\n\nKitap No: "+kitapNo.get(index5)  +"    "+"\nKitap Adý: "+kitapAdi.get(index5)
				  +"    "+"\nKitap Yazarý: "+yazarAdi.get(index5)+"    "+"\nKitap Ücret: "+fiyati.get(index5)+"\n");
				
		

					System.out.println("\nBaþka kitap görüntülemek için 1\nÝþlemi sonlandýrýp menüye dönmek için 2'yi tuþlayýnýz. ");
					karar5=scan.nextInt();
				
					toplamGörüntülenen++;
					
					
				} while (karar5==1);
				
				
				
				
				  System.out.println("\nKitap görüntüleme iþlemi baþarý ile gerçekleþtirildi. Menüye yönlendiriliyorsunuz.\n ");	
				
				  menu();
		
		
		
		
		 }
	}

	private static void numarakitapgörüntüle() {
		
          @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
          int index2=0;
          int no2=0;
          int karar7=0;
          int toplamGörüntülenen=0;
		
		
		if (kitapNo.size()<=0) {
			System.out.println("Henüz eklenmiþ bir kitap bulunmamaktadýr. \n\n\n");
			
			System.out.println("\nMenüye dönmek için 1\nÇýkýþ yapmak için 2 tuþlayýn.");
			int karar6=scan.nextInt();
			
			switch (karar6) {
			case 1:
				menu();
				break;
			case 2:
				System.out.println("\n********************ÇIKIÞ ÝÞLEMÝNÝZ BAÞARI ÝLE GERÇEKLEÞTÝRÝLMÝÞTÝR. TEÞEKKÜR EDER, ÝYÝ GÜNLER DÝLERÝZ********************");
				break;
			default:
				
				do {
					System.out.println("\nYANLIÞ BÝR GÝRÝÞ YAPTINIZ.LÜTFEN TEKRAR DENEYÝNÝZ.\nMenüye dönmek için 1\\nÇýkýþ yapmak için 2 tuþlayýn.\n");
				    karar6=scan.nextInt();
				} while (karar6<1 || karar6>2);
				
				break;
			}
			
		}
		
		
		
		 if (kitapNo.size()>0) {
		
		
		
				do {
					  
					
					
					System.out.println("Lütfen görüntülemek istediginiz kitabýn nosunu giriniz : ");
					no2=scan.nextInt();
					
					index2=kitapNo.indexOf(no2);
					
					// System.out.println(index2);
					
					 System.out.println("\nGörüntülenen Kitap Bilgileri: "+"\n\nKitap No: "+kitapNo.get(index2)  +"    "+"\nKitap Adý: "+kitapAdi.get(index2)
					  +"    "+"\nKitap Yazarý: "+yazarAdi.get(index2)+"    "+"\nKitap Ücret: "+fiyati.get(index2)+"\n");
				
		

					System.out.println("\nBaþka kitap görüntülemek için 1\nÝþlemi sonlandýrýp menüye dönmek için 2'yi tuþlayýnýz. ");
					karar7=scan.nextInt();
				
					toplamGörüntülenen++;
					
					
				} while (karar7==1);
				
				
				
				
				  System.out.println("\nKitap görüntüleme iþlemi baþarý ile gerçekleþtirildi. Teþekkürler.\n ");	
				
				  menu();
		
	
		
		 }
		
	}


}
