package Java8functionalexx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<String> courses = List.of("spring", "springboot", "API", "Microservices", "Azure");
		
		List<String> k = courses.stream()
                .flatMap(c -> Stream.of(c.split(""))) // Split into characters
                .collect(Collectors.toList());
		
		String ss= "ramaranga";
		String[]y= ss.split("");
		List<String> u=Arrays.stream(y).toList();
		 System.out.println("-----single string ------");
		System.out.println(u);
		System.out.println("-----count ------");
	     System.out.println(u.stream().map(n->n.length()).count());
		 System.out.println("-----no.of strings ------");
         System.out.println(k);
         
         System.out.println("-----count------");
         System.out.println( k.stream().map(n->n).count() );
         List<Integer> added = courses.stream().map(n->n.length()).collect(Collectors.toList()) ;
         System.out.println(added);
         System.out.println( courses.stream().map(n->n.length()).count());
	}
}
