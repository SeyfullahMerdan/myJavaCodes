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
	//	climb();      // static olmayan methodu , static methoddan �ag�ramay�z.
		
	}

	public static void main(String[] args) {

		Rope rope=new Rope();   // Obje olu�tudum
		rope.play();           //  obje ile staticc methoda ula�t�m
		Rope rope2=null;        
		rope2.play();        // olu�trudugm obje ile methodu �ag�rd�m staticc methodu
		
		
		
		
		
		
		

	}

}
