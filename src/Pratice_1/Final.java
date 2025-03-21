package Pratice_1;

final class fin{
	 public void exx() {
		System.out.println("final class ex");
	}
}

class b{  // extends fin{ // cannot inherit parent class if u use final
	final public void exx() {
		System.out.println("final class ex");
	}
}

class c extends b {
//	public void exx() {                        cant able to override the final methods 
//		System.out.println("final class ex");
//	}
	
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int s=20;
	int g= 33; 
		 g=s;
		// s=25;
		System.out.println(g);
		fin f= new fin();
		f.exx();

	} 

}


