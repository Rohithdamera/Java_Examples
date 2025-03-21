package praticeclassobj;


//Metod overriding is child class method override parent class method 

class A{
	public void demo() {
		System.out.println("in A");
	}
	
}class B extends A{
	@Override
	public void demo() {
		super.demo();  // super is used to print both methods at atime
		System.out.println("in B");
	}
}
public class methodoverride {

	public static void main(String[] args) {
		B a=new B();
		a.demo();
		

	}

}

