package praticeStreams;


interface exampl{
	void ex();
	 default void ex2() {
		 System.out.println("in default method");
	 }
	
}
class demo1 implements exampl{
	public void ex() {
		System.out.println("in a class");
	}
	
	public void ex2() {
		// printing overriding methods
		System.out.println("in overriding method");
	}
}
public class defaultmethods {

	public static void main(String[] args) {
		exampl d= new demo1();
		d.ex2();
		d.ex();

	}

}
