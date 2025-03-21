package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Functional_Interface_UnaryOperator {

	public static void main(String[] args) {
		UnaryOperator<String>u =input->input.toUpperCase();
		System.out.println(u.apply("rohi"));
		UnaryOperator<String> y= a->{
//			System.out.println("output");
			return a;
		};
		
          System.out.println( y.apply("ravi"));
          UnaryOperator<Integer> i= a->{
      		return a;
      	};
      	System.out.println( i.apply(22));
      	
      	
      	
      	List<Integer> liii= Arrays.asList(1,2,3,34,5,67,5);
      	System.out.println(liii);
      	
      	
      	Function<Integer , Integer> ine=input->{
      		return input*2;
      	};
      	
      	
      	for(Integer num: liii ) {
      		System.out.println(ine.apply(num));
      	}
      	System.out.println("------------------");
      	
      	UnaryOperator<Integer> in= a->{
      	   return a *a;
      	};
      	
      	for(Integer num: liii ) {
      		System.out.println(in.apply(num));
      	}
	}
	     
	

}
