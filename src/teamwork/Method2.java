package teamwork;

import java.util.Scanner;

public class Method2 {

	
		 @SuppressWarnings("resource")
		public static void main(String[] args) {
             // SORU2 Kullanicidan iki sayi isteyin
             // sayilarin karelerini ve kuplerini 
             // toplayan iki ayri method yazin
             // kullaniciya us sorun
     
     Scanner scan=new Scanner(System.in);
     
     System.out.println("Lutfen iki sayi giriniz");
     
     int sayi1=scan.nextInt();
     int sayi2=scan.nextInt();
     
     kareleriToplami(sayi1, sayi2);
     kupleriToplami(sayi1, sayi2);
     
     System.out.println("Kareler toplamini istiyorsaniz 1'e, kupler toplamini istiyorsaniz 2'e basin");
     
     int tercih=scan.nextInt();
     
     if (tercih==1) {
         System.out.println(kareleriToplami(sayi1, sayi2));
         
     }else if(tercih==2) {
         System.out.println(kupleriToplami(sayi1, sayi2));
         
     }else {
         System.out.println("Lutfen 1 ya da 2 giriniz");
     }
 }
 public static int kupleriToplami(int sayi1, int sayi2) {
     
     int kupleriToplami=(sayi1*sayi1*sayi1) + (sayi2*sayi2*sayi2);
     return kupleriToplami;
     
 }
 public static int kareleriToplami(int sayi1 , int sayi2) {
     
     int kareleriToplami=(sayi1*sayi1) + (sayi2*sayi2);
     return kareleriToplami;
     
     
 }
}
	
	