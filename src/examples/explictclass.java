package examples;


	interface MyInterface1 {
	    void display();
	}

	class MyClass1 implements MyInterface1 {
	    @Override
	    public void display() {
	        System.out.println("Display method from MyClass.");
	    }
	}

	public class explictclass {
	    public static void main(String[] args) {
	        Object a = new MyClass1();  // Object reference

	        // Explicit casting
	        MyInterface1 ref = (MyInterface1) a;
	        ref.display();  // Access the interface method
	    }
	}



