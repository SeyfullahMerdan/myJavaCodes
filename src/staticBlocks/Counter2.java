package staticBlocks;

public class Counter2 {
	
	// What is the output?         //  1 1 1
	
	int count=0;     // Ýt is not static, this way it has not changed!! Every time get his own value

	Counter2( ) {
		count++;
		System.out.println(count);	
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		Counter2 c1=new Counter2();  // 1
		Counter2 c2=new Counter2();  // 1
		Counter2 c3=new Counter2();  // 1

	}

}
