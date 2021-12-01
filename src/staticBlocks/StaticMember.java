package staticBlocks;

public class StaticMember {
	//What is output??          // -x16-y1
	
	static int x;
	int y;
	
	public StaticMember() {
		x+=2;          // sm1 i�in x=2 y=1 oldu
		y++;                                     // 4. olarak �al��t� ve  sm2 i�in x=2+2 (x=4) ve y=1 oldu
	}
	private int getSquare() {
 	return x*x;                     // x static oldugu i�in 4 degerinde kald� ve 4*4= Method 16 return etti.
	}
	
	public static void main(String[] args) {

		StaticMember sm1=new StaticMember(); // �nce buras� �al��t�	
		StaticMember sm2=new StaticMember();  // 3. buray� �al��t�rd�	

		
		int z=sm1.getSquare(); // 5. �al��t� ve. Methodu getirdi      // int z=16 oldu.
		
		System.out.println("-x" + z + "-y" + sm2.y);   // -x16-y1      
		
		
		
		
	}
}
