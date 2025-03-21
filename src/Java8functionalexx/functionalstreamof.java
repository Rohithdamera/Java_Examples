package Java8functionalexx;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class functionalstreamof {
	public static void main(String[] args) {
		Stream<Integer> data= Stream.of(11,2,2,34,55,56,5);
		Stream<Integer> sdata= Stream.of(11,2,2,34,55,56,5);
		List<Integer> data1=List.of(1,2,2,3,1, 14,5,6,7,8,9);
		System.out.println(data1.stream().filter(n->n%2==0).collect(Collectors.toList()));
		System.out.println(data1.stream().filter(n->n==1).count());
		System.out.println(data1.stream().sorted().limit(2).collect(Collectors.toList()));
		System.out.println(data1.stream().filter(n->n==2).count());
		System.out.println(data1.stream().map(n->n).count());
		System.out.println(data1.stream().reduce(0, Integer::sum));
		System.out.println(data1.stream().map(n->n).max(Integer::compare));
		System.out.println(data1.stream().map(n->n.MAX_VALUE));
		
		
		List<String>courses= List.of("spring", "springboot", "API", "Microservices", "Azure");
		Integer sdata1= Stream.of(11,2,2,34,55,56,5).reduce(0, Integer::sum);
		int[] arr= {1,2,23,34,45,556,44};
		
		
	    
		
		int count1=Arrays.stream(arr).sum();
		OptionalInt max=Arrays.stream(arr).max();
		int intstream= IntStream.range(0, 66).sum();
		int iterator=IntStream.iterate(1, e->e+2).limit(99).peek(System.out::println).sum();
		List<Integer> boxed=IntStream.iterate(2, e->e*2).limit(39).boxed().collect(Collectors.toList());
		OptionalInt min=Arrays.stream(arr).min();
		long count= sdata.count();
		
		data.forEach(System.out::println);
		
		
		System.out.println("-------------");
		//sdata.sorted().forEach(System.out::println);
		System.out.println("-----count-------");
		System.out.println(count);
		System.out.println("------sdata1------");
		System.out.println(sdata1);
		System.out.println("-----count1-------");
		System.out.println(count1);
		System.out.println("------max-------");
		System.out.println(max);
		System.out.println("-------intstream------");
		System.out.println(intstream);
		System.out.println("----iterator--------");
		System.out.println(iterator);
		System.out.println("----iterator--------");
		System.out.println(boxed);
		System.out.println("------------");
		boxed.stream().forEach(System.out::println);
		System.out.println("-----joining------");
		
		System.out.println(courses.stream().collect(Collectors.toList()));
		System.out.println(courses.stream().collect(Collectors.joining("_")));
		
		System.out.println("-----Split in char------");
		
		List<String> splitCourses = courses.stream()
                .flatMap(course -> Stream.of(course.split(""))) // Split into characters
                .collect(Collectors.toList());

         System.out.println(splitCourses);
         
         System.out.println("-----count------");
         System.out.println( splitCourses.stream().map(n->n.length()).count() );
         List<Integer> added = courses.stream().map(n->n.length()).collect(Collectors.toList()) ;
         System.out.println(added);
         System.out.println( courses.stream().map(n->n.length()).count());
         
         
         System.out.println("-----THE ABOVE COUNT SPLIT BUT IN THIS WE NEED TO GIVE MORE SPACE BECAUSE JVM TAKES PREVIOUS SPACE ------");
         List<String> k = courses.stream().flatMap(c-> Stream.of(c.split(" "))).collect(Collectors.toList());
         System.out.println("-----k------"+k);
        
         System.out.println(k.stream().map(n->n).count());
         List<Integer> addd = k.stream().map(n->n.length()).collect(Collectors.toList());
         System.out.println(addd);
         
        
         
         
         //courses.stream().flatMap(course->courses.stream().map(courses->List.of(course, courses))).collect(Collectors.toList());
         System.out.println("--------attachingone to other ---------");
         
        System.out.println(courses.stream().flatMap(course -> courses.stream()
                     .map(innerCourse -> List.of(course, innerCourse)))
                 .collect(Collectors.toList()));
        System.out.println("-------- > 5 to upper case ---------");
        System.out.println(courses.stream().filter(n->n.length()>5).map(n->n.toUpperCase()).collect(Collectors.toList()));
        System.out.println("-------- > 5 to upper case  and starting letter captial and last all captial---------");
        System.out.println(courses.stream().filter(n->n.length()>5).map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList()));
        System.out.println(courses.stream() .peek(System.out::println).filter(n->n.length()>5).map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList()));
        System.out.println("-----------------");
        System.out.println(courses.stream() .peek(System.out::println).filter(n->n.length()>5).map(String::toUpperCase).peek(System.out::println).findFirst());
           
	}

}
