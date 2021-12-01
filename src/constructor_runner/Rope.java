package constructor_runner;

public class Rope {

	public static void swing () {
		System.out.println("swing");
	}
	
	public void climb() {
		System.out.println("climb");
	}
	
	
	public static void play() {
		
		swing();   // swing
	//	climb();      // static olmayan methodu , static methoddan çagýramayýz.
		
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Rope rope=new Rope();   // Obje oluþtudum
		rope.play();           //  obje ile staticc methoda ulaþtým
		Rope rope2=null;        
		rope2.play();        // oluþtrudugm obje ile methodu çagýrdým staticc methodu
		
		
		
		
		
		
		

	}

}
