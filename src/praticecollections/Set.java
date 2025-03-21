package praticecollections;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		Collection<Integer> g= new HashSet<Integer>();
		Collection<Integer> i= new TreeSet<Integer>();
		g.add(98);
		g.add(97);
		g.add(96);
		g.add(95);
		g.add(94);
		g.add(94);
		i.add(33);
		i.add(23);
		i.add(23);
		System.out.println(g);
		System.out.println(i);
		
         //duplicate and ascending order
	}

}
