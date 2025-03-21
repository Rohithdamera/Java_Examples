package praticeAbstract;


abstract class A{
	public  abstract void ex() ;
	   
	
	public  void ex2() {
		
		System.out.println("class A");
	}
	
	
}
 class B extends A{
	
	public void ex() {
		System.out.println("class B");
	}
	B(){
		System.out.println("construtor");
	}
	
}
public class abstractex {

	public static void main(String[] args) {
		A a =new B();
		a.ex2();
		a.ex();

	}

}
