package Pratice_1;

@FunctionalInterface
 interface voidmethodwithnoparams{
	public void printhello(int x);
}
public class Functionalinter  {
	
	

	public static void main(String[] args) {
		//voidmethod();		

	}
	
	public static void voidmethodwithnoparams() {
		voidmethodwithnoparams m=(input)->System.out.println(input);
		voidmethodwithnoparams n=input ->System.out.println(input);
		m.printhello(12);
		n.printhello(22);
		

		
	}
	

	
}
