package praticeStreams;

//Functionlinterface having only one method in it 

@FunctionalInterface
interface demo{
	void demo(int i);
}
public class Functionlinterface {

	public static void main(String[] args) {
		demo d=(int i)->                    //lambda expression
		System.out.println(i);
		d.demo(9);



	}

}
