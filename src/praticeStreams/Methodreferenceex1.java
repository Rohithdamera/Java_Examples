package praticeStreams;

import java.util.Arrays;
import java.util.List;

public class Methodreferenceex1 {

	public static void main(String[] args) {
		List<String> a=Arrays.asList("rama","Sita","lakshman");
		a.forEach(System.out::println);

	}

}
