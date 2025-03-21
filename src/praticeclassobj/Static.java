package praticeclassobj;



class mobile{
	
	
	String mobilebrand;
	String mobilename;
	static String mobiletype; // by default it will assign to each objects with help of static
	
	public void mobil() {
		System.out.print(mobilebrand+":"+mobilename+":"+mobiletype+":");
	}
}
public class Static {

	public static void main(String[] args) {
		

	
	
	mobile m= new mobile();
	m.mobilebrand="samsung";
	m.mobilename="A55";
	m.mobiletype="Android";
	m.mobil();
	
	mobile m2=new mobile();
	mobile.mobiletype="Apple"; //if u want to use another variable for that u have to use 
	                           //class name as well.
	m2.mobil();

}
}
