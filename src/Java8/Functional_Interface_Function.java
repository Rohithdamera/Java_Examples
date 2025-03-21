package Java8;

import java.util.function.Function;

public class Functional_Interface_Function {

	public static void main(String[] args) {
		Function<String, String> cv= i->i.toUpperCase();
		  System.out.println(cv.apply("rama"));
		  
		  Function<String, String> ss= Function.identity();
		  System.out.println(ss.apply("rama2"));
		  
		  
		  Function<Integer, Integer> multii=a->{
			  System.out.println("double operation");
			  return a*2;
			  
		  };
		  multii= multii.andThen(a->{
			  return a/4;
		  });
		  
		  System.out.println(multii.apply(2));

	}

}
