package Java8functionalexx;

import java.util.Comparator;
import java.util.List;

public class functionaldistint {

	public static void main(String[] args) {
		List<Integer>data= List.of(12,3,4,56,8,8,89,67);
		List<String> data1=List.of("rama", "seta","hanuma", "lakshamana");
		int result= data.stream().filter(a->a%2==0).map(a->a*a*a).distinct().sorted().reduce(0, Integer::sum);
		System.out.println(data.stream().map(n->n).distinct().reduce(0, Integer::sum));
		 data1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		 System.out.println("-----------");
		 data1.stream().sorted(Comparator.comparing(s->s.length())).forEach(System.out::println);
		 System.out.println("-----------");
         System.out.println(result/2);
         System.out.println(result);
	}

}
