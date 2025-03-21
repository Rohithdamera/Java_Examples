package Java8;

import java.util.NoSuchElementException;
import java.util.Optional;

interface examplewithoneparm{
	public void inpu(String input);
}
 interface voidmethodwithnoparams{
	 public void printhello(int x);
 }
 interface Add{
	 public void printhello(int x,int y);
 }
 
 interface multi{
	 public float mul(int x,int y);
	 }

 interface staticme{
	 public static void  mull() {
		// public default void  mull() {   can be implemented in main class, while static cannot 
		 System.out.println("hii");
	}
	 public default void man() 
	 {
		 System.out.println("hi3i");
	 }
	 }
 

 
 
 
public class FunctionalOptional implements staticme{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticme xyz=new FunctionalOptional();
		xyz.man();
		examplewithoneparm();
		voidmethodwithnoparams();
		multi();
		mull();
		float k=mul();
        System.out.println( k);
        
        
      
         String[] str = new String[10];
		 str[5]="ram";
		 Optional<String>value = Optional.of(str[5]);
		 Optional<String > a= Optional.of("data");
		 System.out.println(a.orElse("not found"));
		 System.out.println(a.map(String::toUpperCase));
		 System.out.println(a.get());
		 value.ifPresent(c-> System.out.println(value));
		System.out.println(value.orElse("not found"));
		System.out.println(value.orElseGet(()-> "not found"));
		System.out.println(value.orElseThrow(NoSuchElementException::new));
		
	}
	
	public static void examplewithoneparm() {
		examplewithoneparm e = (input)-> System.out.println(input);
		e.inpu("hi");
		
	}
	
	public static void voidmethodwithnoparams() {
		voidmethodwithnoparams s= (a)-> System.out.println(a*2);
		s.printhello(22);
	}
	public static void multi() {
		Add s= (a, b)-> System.out.println(a*b);
		Add k= (a, b)-> System.out.println(a+b);
		s.printhello(22,22);
		k.printhello(22,22);
		
	}
	
	public static float mul() {
		multi m =(a, b)->  ((float) a / b);
		
		
		return m.mul(12, 772);
		
		
	}
	public static void mull() {
		
		System.out.println("hii 2");
		
		
//		return m.mul(12, 772);
		
		
	}

}
