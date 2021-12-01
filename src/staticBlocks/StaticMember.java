package staticBlocks;

public class StaticMember {
	//What is output??          // -x16-y1
	
	static int x;
	int y;
	
	public StaticMember() {
		x+=2;          // sm1 için x=2 y=1 oldu
		y++;                                     // 4. olarak çalýþtý ve  sm2 için x=2+2 (x=4) ve y=1 oldu
	}
	private int getSquare() {
 	return x*x;                     // x static oldugu için 4 degerinde kaldý ve 4*4= Method 16 return etti.
	}
	
	public static void main(String[] args) {

		StaticMember sm1=new StaticMember(); // Önce burasý çalýþtý	
		StaticMember sm2=new StaticMember();  // 3. burayý çalýþtýrdý	

		
		int z=sm1.getSquare(); // 5. çalýþtý ve. Methodu getirdi      // int z=16 oldu.
		
		System.out.println("-x" + z + "-y" + sm2.y);   // -x16-y1      
		
		
		
		
	}
}
