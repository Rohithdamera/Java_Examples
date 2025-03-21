package Pratice_1;
abstract class aba{
	public abstract  void A();
	public abstract void B();
}
public class AbstractAnd_AnonymousINNER_Class {

	public static void main(String[] args) {
		aba a= new aba() {
			public void A() {
				System.out.println("ex");
			}
			public void B() {
				System.out.println("ex1");
			}
			
		};a.A();
		a.B();
		
 
	}

}
