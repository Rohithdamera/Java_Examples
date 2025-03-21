package praticeclassobj;


class bike{
	String colour;
	String cc;
	static String type;
	
	bike(){
		System.out.println("const ex");
	}
	
	public void bike() {
		System.out.println(colour+":"+cc+":"+type+"");
		System.out.println("const ex");
	}
	
}
class car extends bike{
	String weight;
	public  static void car(car c) {
		
		System.out.println(c.colour+":"+c.cc+":"+type+":"+c.weight+":");
		
		// if u intialize the obj name with vvariables and need to pass class and
		// obj name in methods
		
		
	}
}
public class Staticmethod {

	public static void main(String[] args) {
		bike b=new bike();
		
		 //new bike();
		b.colour="red";
		b.cc="220cc";
		bike.type="gear1";
		b.bike();
		//b.type="bmw";
		
		
		car c= new car();
		c.colour="black";
		c.cc="1000cc";
		car.type="Auto";
		c.weight="1000kgs";
		car.car(c);
		

	}

}
