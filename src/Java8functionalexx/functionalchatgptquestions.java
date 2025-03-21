package Java8functionalexx;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import Java8functionalexx.customcls.Map;

public class functionalchatgptquestions {
	
	
	public static void main(String[] args) {
		List<Integer> firstex= List.of(1, 2, 3, 4, 5, 2, 4);
		List<String> secondex=List.of("apple", "orange", "banana");
		List<Integer> thirdex= List.of(1, 2, 3, 4, 2, 3,4 );
		List<String> forthex=List.of("cat", "dog", "lion","lion", "tiger", "ant");
		List<Integer> fifthex= List.of(3, 5, 15, 17, 11);
		List<List<Integer>> sixthex= Arrays.asList( Arrays.asList(3, 2, 1),Arrays.asList(5, 4),Arrays.asList(6));
		List<String> seventhex =List.of("Apple", "Apple","Ape", "apple", "Ant", "Airplane", "Bus");
		
		System.out.println(thirdex.stream().sorted().collect(Collectors.toList()));
		List<Integer> eigthex= List.of(5, 12, 7, 18, 3, 10, 21, 22, 2222);
		
		List<Integer> ninthex= List.of(1,10, 20, 30, 15);
		
		List<Integer> tenthex = Arrays.asList(1,2,1,2,3,33,4,45,45,45,454,5,5,3,1);
		String y="qweqwetydfrebsh";
		
		List<String>l=List.of(y);
		
		
		//System.out.println(StringUtils.upperCase(y));
		System.out.println(seventhex.stream().filter(n->n.startsWith("A")).count());
        System.out.println(l.stream().flatMap(n->Arrays.stream(n.split(""))).collect(Collectors.groupingBy(n -> n,Collectors.counting())));
		System.out.println(seventhex.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())));
		System.out.println(firstex.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList()));
		System.out.println(seventhex.stream().filter(n->n.length()>=3).sorted().map(n->n.contains("p")).collect(Collectors.toList()));
		System.out.println(secondex.stream().filter(n->n.length()>=6).sorted(Comparator.reverseOrder()).map(n->n.toUpperCase()).collect(Collectors.toList()));
		System.out.println(secondex.stream().filter(seventhex::contains).collect(Collectors.toList()));
		System.out.println(thirdex.stream().reduce(1,(a,b)->a*b ));
		System.out.println("-----------------1----------------");
		System.out.println(forthex.stream().collect(Collectors.groupingBy(n->n, Collectors.counting())));
		
		System.out.println(forthex.stream().collect(Collectors.groupingBy(String::length)));
		System.out.println(forthex.stream().flatMap(n-> Stream.of(n.split(""))).collect(Collectors.toList()));
		System.out.println(fifthex.stream().filter(n->n>10).findFirst());
		System.out.println(sixthex.stream().flatMap(List::stream).sorted().collect(Collectors.toList()));
		System.out.println(seventhex.stream().filter(n->n.startsWith("A")).filter(word -> word.length() > 3).findFirst());
		firstex.stream()
	       .map(n -> n * 2) // Double each value
	       .peek(n -> System.out.println("Intermediate value: " + n)) // Log the intermediate values
	       .collect(Collectors.toList());
		   eigthex.stream().filter(n->n>=10).forEach(System.out::println);;
		  System.out.println( forthex.stream().map(n->n.toUpperCase()).collect(Collectors.toList()));
		  System.out.println(firstex.stream().filter(n->n%2==0).map(n->n+n).collect(Collectors.toList()));
		  System.out.println(seventhex.stream().collect(Collectors.groupingBy((String::length))));
		  System.out.println(forthex.stream().collect(Collectors.groupingBy(n->n, Collectors.counting())));
		  System.out.println(secondex.stream().collect(Collectors.joining(",")));
		  System.out.println(fifthex.stream().max(Integer::compareTo));
		  System.out.println(forthex.stream().map(n->n).sorted().collect(Collectors.toList()));
		  System.out.println(eigthex.stream().anyMatch(n->n%5==0));
		  System.out.println(firstex.stream().limit(3).collect(Collectors.toList()));
		  System.out.println(seventhex.stream().mapToInt(String::length).sum());
		  System.out.println(fifthex.stream().reduce(Integer::sum));
		  
		  System.out.println("---------count-----------");
		  System.out.println(seventhex.stream().mapToInt(String::length).count());
		  System.out.println(seventhex.size());
		  Optional<Integer>sum =eigthex.stream().reduce((a,b)->a+b);
		  int sum2=eigthex.stream().reduce(0, (a,b)-> a + b);
		  Optional<Integer>sum3 =eigthex.stream().reduce(Integer::sum);
		  System.out.println(sum.get());
		  System.out.println(sum3);
		  System.out.println(sum2);
		  
		  Optional<Integer>  findsecond= fifthex.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		  
		  System.out.println(findsecond);
		  
		  double avg= eigthex.stream().mapToInt(e->e).average().getAsDouble();
		  System.out.println(avg);
		  
		    double d= ninthex.stream().map(n->n*n).sorted(Comparator.reverseOrder()).limit(3).mapToInt(e->e).average().getAsDouble();
		    double e= ninthex.stream().map(n->n*n).filter(n->n>100).mapToInt(g->g).average().getAsDouble();
		    
		    
		    System.out.println(d);
		    System.out.println(e);
		    
		    System.out.println("give the which number starts with 2");
		    System.out.println( eigthex.stream().map(n->String.valueOf(n)).filter(n->n.startsWith("2")).collect(Collectors.toList()));
		     System.out.println(eigthex.stream().map(n->Integer.toString(n)).filter(n->n.startsWith("2")).collect(Collectors.toList()));
		    
		    
		   Set<Integer> duplicated=tenthex.stream().filter(n->Collections.frequency(tenthex , n)>1).collect(Collectors.toSet());
		   System.out.println(duplicated);
		   
		   
		   
		   System.out.println("------------------gives max num in a list----------------------");
		    System.out.println(eigthex.stream().max(Comparator.comparing(Integer::valueOf)).get());
		    
		   System.out.println(eigthex.stream().min(Comparator.comparing(Integer::valueOf)).get());
		   System.out.println(eigthex.stream().reduce(Integer::max).orElseThrow(() -> new IllegalArgumentException("List is empty")));
		   System.out.println(eigthex.stream().reduce(Integer::max).map(n->n).get());
		   System.out.println(tenthex.stream().map(n->n).sorted().collect(Collectors.toList()));
		   System.out.println(tenthex.stream().sorted(Comparator.reverseOrder()).distinct().limit(5).collect(Collectors.toList()));
		   
		   System.out.println(eigthex);
		   System.out.println(eigthex.stream().sorted().reduce(Integer::max));
		   System.out.println(eigthex.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).collect(Collectors.toList()));
		   System.out.println("-----------------------------");
		   System.out.println(eigthex.stream().sorted(Comparator.naturalOrder()).distinct().limit(2).skip(1).collect(Collectors.toList()));
		   System.out.println(eigthex.stream().distinct().limit(2).skip(1).collect(Collectors.toList()));
		   int res=eigthex.stream().distinct().limit(2).skip(1).findFirst().get();
		   System.out.println(res);
		   
		   
		   System.out.println("sum of total in a list");
		   System.out.println(thirdex.stream().mapToInt(Integer::intValue).sum());
		   //System.out.println(seventhex.stream().collect(Collectors.groupingBy(n->Collectors.)));
		   System.out.println("in dec order");
		   System.out.println(thirdex.stream().sorted((a, b)->b - a).collect(Collectors.toList()));
		   System.out.println(thirdex.stream().sorted().collect(Collectors.toList()));
		   
		   
		   
		   System.out.println("-----------------------------");
		   
		   // First Stream
	        Stream<String> stream1 = Stream.of("Java", "Python", "C++");
	        
	        // Second Stream
	        Stream<String> stream2 = Stream.of("Ruby", "Go", "Kotlin");

	        // Concatenating the two streams
	        Stream<String> concatenatedStream = Stream.concat(stream1, stream2);

	        // Printing the result
	        concatenatedStream.forEach(System.out::println);
	        System.out.println("-----------------------------");
	        
	        
	        System.out.println(forthex.stream().filter(n->n.length()>=4).map(n->n).collect(Collectors.toList()));
		   
		   
	        List<Integer> l1=List.of(99,223,23,89);
	        System.out.println(l1.stream().sorted().skip(1).limit(1).collect(Collectors.toList()));
	        
	        System.out.println(l1.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList()));
		   
		   
}              
}
       