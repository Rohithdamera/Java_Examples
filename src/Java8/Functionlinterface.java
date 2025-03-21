package Java8;

//Functionlinterface having only one method in it 

//@FunctionalInterface
//interface demo{
//	void demo(int i);
//	
//	}

@FunctionalInterface
interface MyFunctionalInterface {
    // Single abstract method
    void abstractMethod();

    // Default method (non-abstract)
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Static method (non-abstract)
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
public class Functionlinterface {

	public static void main(String[] args) {
//		demo d=(int i)->                    //lambda expression
//		System.out.println(i);
//		d.demo(9);
MyFunctionalInterface instance = () -> System.out.println("Abstract method implementation.");
        
        instance.abstractMethod(); // Abstract method implementation.
        instance.defaultMethod();  // This is a default method.
        MyFunctionalInterface.staticMethod(); // This is a static method.


	}

}
