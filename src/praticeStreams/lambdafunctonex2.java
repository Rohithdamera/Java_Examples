package praticeStreams;

interface B{
	void b(int i);
}

class c implements B{
	public void b(int i) {
	   System.out.println(i+2);
	}
}
public class lambdafunctonex2 {
	
	// from lambdafunctonex1 3 lines of code wrote into one 

	public static void main(String[] args) {
//		B obj=(int i)->System.out.println("hello" +i);
//		obj.b(12);
		
		B obj= i->System.out.println("ex2"+i);
		obj.b(23);

	};

}
