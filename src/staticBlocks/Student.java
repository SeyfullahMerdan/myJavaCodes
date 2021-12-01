package staticBlocks;

public class Student {

	int number;
	String name;
	static String college="ITS";
	
	@SuppressWarnings("static-access")
	Student(int r, String n, String college){
		this.number= r;
		this.name=n;
		this.college=college;
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	
		Student s1=new Student(11,"Karan","MIT");        // 11,"Karan","MIT"  (MIT >> "Harvard")
		Student s2=new Student(222,"Aryan","Harvard");    // 222,"Aryan","Harvard"

		System.out.println(s1.number);  // 11
		System.out.println(s2.number);  // 222
		
		System.out.println(s1.name);  // Karan
		System.out.println(s2.name);   // Aryan
		
		System.out.println(s1.college);  // Harvard
		System.out.println(s2.college);   // Harvard


	}

}
