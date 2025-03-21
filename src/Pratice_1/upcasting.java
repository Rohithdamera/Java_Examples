package Pratice_1;
class up{
	public void a(){
		System.out.println("in parent class");
	}
}
class down extends up{
	public void b(){
		System.out.println("in child class");
	}
}
public class upcasting {

	public static void main(String[] args) {
		up u=  new down();     //going from child class to parent class in up format 
	     u.a();
	     down d= (down) u;	
	     d.b();

	}

}
