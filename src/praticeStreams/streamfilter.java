package praticeStreams;

import java.util.Arrays;
import java.util.List;

public class streamfilter {

	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(12,54,33,90,3000,40000,20000);
		num.stream()
		.filter(n->n>3000)
		.sorted()
		.map(n->n*1.5)
		.forEach(n->System.out.println(n));
	}

}
