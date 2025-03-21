package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface ex1{
	int sub(int i , int j);
}
public class Function_predicate_negate {

	public static void main(String[] args) {
		ex1 e =(i, j)->i-j;
		int r=e.sub(122, 230);
		System.out.println(r);
		
		Predicate<Integer>  ieeven= i->i%2==0;
		Predicate<Integer>  isgreat= i->i>5;
		boolean s= ieeven.test(23);
		System.out.println(s); 
		System.out.println(ieeven.test(67));
		System.out.println(ieeven.and(isgreat).test(34));
		System.out.println(isgreat.or(isgreat).test(34));
		System.out.println(isgreat.negate().test(34));
		List<Integer> ee= Arrays.asList(1,2,3,4,5,6,7,8,9);

		List<Integer> collect= ee.stream().filter(isgreat).filter(ieeven).collect(Collectors.toList());
		System.out.println(collect);
		
		List <Integer> ex= new ArrayList<>(Arrays.asList(5));
		ex.add(12);
		ex.add(12);
		ex.add(12);
		ex.add(12);
		ex.add(12);
		System.out.println(ex);
		
		
		List<Integer> ex1= Arrays.asList(40000,50000,30000,25000);
		List<String> e3e=Arrays.asList("bb","ccc","aa");
		e3e.stream().sorted().collect(Collectors.toList());
		System.out.println(e3e);
		List<Integer> max= ex1.stream().sorted().collect(Collectors.toList());
		ex1.sort((a,b)->a.compareTo(b));
		System.out.println("--------------");
		System.out.println(ex1);
		System.out.println(max);
		
	  Predicate<String> sss=Predicate.isEqual("rama");
	  System.out.println(sss.test("happy"));
	  
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
	  
	  System.out.println(multii.apply(12));
	  
	  
		
		

	}

}
