package Pratice_1;

public class autoboxing_unboxing {

	public static void main(String[] args) {
		int n= 12;
		Integer k= n; // autoboxing
		
		int l=k.intValue();   // unboxing
		System.out.println(n +l);
	}

}
