package praticeStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamex3 {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(5,3,6,1,9,2,4,4,4);
		Stream<Integer> data=nums.stream();
		Stream<Integer> sorteddata=data.sorted();
		sorteddata.forEach(n->System.out.println(n));
		
		

	}

}