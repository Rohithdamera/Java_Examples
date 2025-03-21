package Pratice_1;

class Android_10{
	public void show() {
	System.out.println("Android_10");
	}
}
class Android_11 extends Android_10{
	public void show() {
		System.out.println("Android_11");
		}
	
}
class Android_12 extends Android_10{
	public void show() {
		System.out.println("Android_12");
		}
	
}


public class Dynamic_method_Dispatch {

	public static void main(String[] args) {
		Android_10 a= new Android_10();            //The entire thing is a polymorphism 
		a.show();
		                                           //and is going step by step called as dynamic method dispatrch 
		Android_11 b= new Android_11();
		b.show();
		
		Android_12 c= new Android_12();
		c.show();
	}

}
