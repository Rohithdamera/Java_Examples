package Java8;

interface A {
	int rollno=24;
	String name="Rohi";
	void bike();
	void car();
	
}
class B implements A{
	public void bike() {
		System.out.println("b class");
		
	}

	@Override
	public void car() {
		
		System.out.println(name);
	}
}
public class innercls {

	public static void main(String[] args) {
		B b =new B();
		b.bike();
		b.car();
		System.out.println(A.rollno);

	}

}
