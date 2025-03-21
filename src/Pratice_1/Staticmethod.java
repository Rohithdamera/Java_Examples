package Pratice_1;


class bike{
	String colour;
	String cc;
	static String type;
	
	public void bike() {
		System.out.println(colour+":"+cc+":"+type+"");
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
		b.colour="red";
		b.cc="220cc";
		bike.type="gear";
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
