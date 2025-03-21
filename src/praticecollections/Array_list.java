package praticecollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Array_list {

	public static void main(String[] args) {
//		Collection<Integer> n= new ArrayList<Integer>();
//		n.add(1);
//		n.add(2);
//		System.out.println(n);
//		n.remove(1);
//		System.out.println(n);
//		n.add(12);
//		n.add(233);
//		for(int l : n) {
//			System.out.println(l);
//		}
		
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		  
		    // Get the iterator
		    Iterator<String> it = cars.iterator();
		    for( int i=0; i<4; i++){
		     System.out.println(it.next());
		   //  }
		     // System.out.println(cars.size());
		    // Print the first item
		   // System.out.println(it.next());
		  }
		    System.out.println(it.next());
		
}
}


		

