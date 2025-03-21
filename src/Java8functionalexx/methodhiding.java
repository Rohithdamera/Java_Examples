package Java8functionalexx;

//class first {
//	public static void firstex() {
//		System.out.println("hello");
//	}
//	
//}class second extends first{
//	public static void firstex() {
//		System.out.println("hello2");
//	}
//}
//
//
//
//
//public class methodhiding {
//
//	public static void main(String[] args) {
//		
////		first f= new first ();
////		f.firstex();
//		second s= new second();
//		s.firstex();
//
//	}
//
//}



 class Animal {
    public static void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public static void makeSound() {
        System.out.println("Dog barks");
    }
}

public class methodhiding  {
    public static void main(String[] args) {
    	//Animal animal = new Animal();
    	Animal animal = new Animal();
       animal.makeSound(); 
        Animal.makeSound();                        // Static Binding - it calls Animal's static method
    }
}
