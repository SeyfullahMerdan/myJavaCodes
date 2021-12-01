package staticBlocks;

public class Counter {

	// What is the output?        **** 1 und 6
	
	
   int count;
   static int stCount;

	
	public Counter() {

		count++;
		stCount++;
}

	public int getCount() {
		return count;
	}
	
	public static int getStCount() {
		return stCount;
	}
	
	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) {

		
	Counter cs1=new Counter();  // 1 1
	Counter cs2=new Counter();  // 1 2
	Counter cs3=new Counter();  // 1 3
	Counter cs4=new Counter();  // 1 4
	Counter cs5=new Counter();  // 1 5
	Counter cs6=new Counter();  // 1 6
		
	System.out.println("Count is : " + cs6.getCount());         // 1
	System.out.println("Stcount is : " + cs6.getStCount());       // 6
	
		
	}

}
