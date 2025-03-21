package Pratice_1;

class class_A{
	int rollno;
	String name;
	static String Section;
      
	
	
	static {
		
		String branch= "MCA";
		System.out.print(branch);
		
	}
	

}

public class Static_block {

	public static void main(String[] args) {
	
		
		class_A a= new class_A();
		a.rollno=1;
		a.name="rohi";
		class_A.Section="A";
		System.out.print(" "+a.rollno+":"+a.name+":"+class_A.Section);
		
		
	//	class.forName(className:class_A)

	}

}
