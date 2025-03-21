package Java8functionalexx;

import java.util.List;
import java.util.stream.Collectors;

public class functionalmap {

	public static void main(String[] args) {
		List<Integer> num= List.of(112,3,34,5,5,66,7,8);
		List<String>courses= List.of("spring", "springboot", "API", "Microservices", "Azure");
		evennum(num);
		printallcourse(courses);
		System.out.println("-------------");
	List<Integer>	k=courses.stream().map(x->x.length()).collect(Collectors.toList());
     System.out.println(k);
     System.out.println(num.stream().map(n-> n * n * n).collect(Collectors.toList()));
	}

	private static void printallcourse(List<String> courses) {
		System.out.println("-------------");
		courses.stream().map(n->n.length()).forEach(System.out::println);
		}

	private static void evennum(List<Integer> num) {
		//System.out.println("-------------");
		num.stream().filter(n->n%2!=0).map(n->n*n*n).forEach(System.out::println);
		
	}

}
