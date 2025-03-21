package examples;

abstract class abb{
	public abstract void ab();
}
class baa extends abb{
	public void ab() {
		System.out.println("test");
		
	}
}

public class Abstract {

	public static void main(String[] args) {
		abb a= new baa();
		a.ab();
		
		

	}

}
