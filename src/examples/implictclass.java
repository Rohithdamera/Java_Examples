package examples;



	interface MyInterface {
	    void display();
	}

	class MyClass implements MyInterface {
	    @Override
	    public void display() {
	        System.out.println("Display method from MyClass.");
	    }
	}

	public class implictclass {
	    public static void main(String[] args) {
	        MyClass obj = new MyClass();
	        
	        // Implicit casting
	        MyInterface f= new MyClass();
	        f.display();
	        System.out.println("-----------");
	        MyInterface ref = obj;  
	        ref.display();  // Access the interface method
	    }
	}
