package praticeclassobj;



class anonys{
	public anonys() {
		System.out.println("this is inside a constructor");
		
	}
	public void anna() {
		System.out.println("it is a nomal method");
		
	}
}
public class Anonymusobj {

	public static void main(String[] args) {
		new anonys().anna();   //Anonymus object	

	}

}
