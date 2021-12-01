package staticBlocks;

public class StaticBlock1 {
	
	//** What is the output?         ********* 3 and 5
	
	int x;
	static int y;

	public StaticBlock1(int i) {
		
		x+=i;
		y+=i;     // Static oldugu için 19.satýrdaki iþlemden devam etti.
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		
		new StaticBlock1(2);      // Çalýþtý ve x=2  y=2 oldu
		StaticBlock1 dnm=new StaticBlock1(3); // çalýþtý ve x=3 y=2+3 (y=5) oldu
		
		System.out.println(dnm.x + " , " + dnm.y);
	
		
		
	}

}
