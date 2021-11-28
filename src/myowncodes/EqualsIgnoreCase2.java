package myowncodes;

public class EqualsIgnoreCase2 {

	public static void main(String[] args) {

		
		  int a=15;
		  int b=a+0;
		  System.out.println(a==b);
		  
		  
		  char ch1='A';
		  char ch2='A' + 0 ;
		  
		  System.out.println(ch1==ch2);
		 
		    String str1="YILDIZ";
			String str2="KOLEJI";
			String str3="Yildiz Koleji";
			String str4=str1+ " " +str2;
			
			
			System.out.println((str3==str4));
			System.out.println(str3.equalsIgnoreCase(str4));
			
			
			
			System.out.println("Lütfen bir þeyler yazýnýz");
			
			String yazi1="hayat birilerini sevince guzeldir";
			String yazi2="HAYAT BIRILERINI SEVINCE GUZELDIR";
			
			System.out.println(yazi1==yazi2);
			System.out.println(yazi1.equalsIgnoreCase(yazi2));

		
		
		
		
		
	}

}
