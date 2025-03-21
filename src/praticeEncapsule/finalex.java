package praticeEncapsule;

//final 
class finaal{   //if we use final in the class it cant be inherited to another class
	public static void finaal() {
		
		final int k=109;
		//k=33;  cant be modified
		int s=99;
		int r=s+k;
		System.out.println(r);
		
	}
}
class finel extends finaal{
	finel(){
		System.out.println("hello");
		
		
	}
	
}

public class finalex {

	public static void main(String[] args) {
		finel f= new finel();
		f.finaal();
		
		


	}

}
