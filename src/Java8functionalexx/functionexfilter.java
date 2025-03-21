package Java8functionalexx;

import java.util.List;
import java.util.stream.Collectors;

public class functionexfilter {

	public static void main(String[] args) {
		List<Integer> num= List.of(112,3,34,5,5,66,7,8);
		List<String>courses= List.of("spring", "springboot", "API", "Microservices", "Azure");
		evennum(num);
		printallcourse(courses);
		System.out.println("----------------");
		courses.stream().map(str->str.toUpperCase()).forEach(System.out::println);
		
		System.out.println("----------------");
		courses.stream().map(String::toUpperCase).forEach(System.out::println);
		
		
		
		
		System.out.println(courses.stream().filter(n->n.contains("s")).map(n->n).collect(Collectors.toList()));
		System.out.println(num.stream().count());
		System.out.println(num.stream().map(n->n.sum(n, 1)).collect(Collectors.toList()));
		System.out.println(courses.stream().filter(n->n.length()>=3).filter(n->n.contains("spring")).map(n->n.toUpperCase()).collect(Collectors.toList()));
		System.out.println("-------1---------");

	}

	private static void printallcourse(List<String> courses) {
		courses.stream().forEach(System.out::println);
		System.out.println("---------");
		courses.stream().filter(course->course.contains("spring")).forEach(System.out::println);
		System.out.println("------------1-");
		courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
//		List<String> collect = courses.stream().filter(course->course.length()).collect(Collectors.toList());
//		System.out.println(collect);
	}

	private static void evennum(List<Integer> num) {
		num.stream().filter(n->n%2!=0).forEach(System.out::println);
		
	}

}
