package staticBlocks;

public class StaticBlock1 {
	
	//** What is the output?         ********* 3 and 5
	
	int x;
	static int y;

	public StaticBlock1(int i) {
		
		x+=i;
		y+=i;     // Static oldugu i�in 19.sat�rdaki i�lemden devam etti.
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		
		new StaticBlock1(2);      // �al��t� ve x=2  y=2 oldu
		StaticBlock1 dnm=new StaticBlock1(3); // �al��t� ve x=3 y=2+3 (y=5) oldu
		
		System.out.println(dnm.x + " , " + dnm.y);
	
		
		
	}

}
