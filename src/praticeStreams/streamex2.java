package praticeStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamex2 {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,2,3,3,444,44,4);
		Stream <Integer> data=nums.stream();
		data.forEach(n->System.out.println(n));
		//data.forEach(n->System.out.println(n)); this wont run because one is intialized then it be reusable again
	}

}
