package Java8functionalexx;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class predicatefunconsumer {

	@SuppressWarnings ("unused")
	public static void main(String[] args) {
		
		List<Integer> num= List.of(12,22,33,44,55,66,77,88,99);
		List<String> str= List.of("ramu", "setara", "lakshman");
		//gives only either true or false 
		Predicate<Integer> ieven= i->i%2==0;
		//takes input aND gives output
		Function<String , String> data=i->i.toUpperCase();
		Function<String , Integer> data1=i->Integer.parseInt(i);
		//no input and will return something 
		Supplier<Integer> randomIntegerSupplier = () -> new Random().nextInt(100);
		//takes one arg and returns same type
		UnaryOperator<Integer> unaryy=(x)->3*x;
		//takes 2 and return 1 of same type
		BinaryOperator<Integer> bina=(x,y)->x+y;
		//takes single argument and does not return anything 
		Consumer<Integer> sum=System.out::println;
		//. It takes two input parameters of types T and U and return true or false 
		BiPredicate<Integer, Integer> bipi=(a, b)->(a+b)%2==0;
		
		BiPredicate<Integer, Integer>bipe=(a,b)->a>0&& b>0;
		System.out.println("------sortedreverse-----");
		num.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("------sorted-----");
		System.out.println(num.stream().distinct().sorted().collect(Collectors.toList()));
		System.out.println("------sortedreverse-----");
		System.out.println(num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println("-----------");	 
		System.out.println(ieven.test(22));
		System.out.println(data.apply("rohiiii"));
		
		str.stream().map(data).forEach(System.out::println);
		
		int add=num.stream().reduce(0,Integer::sum);
		System.out.println(num.stream().distinct().reduce(0, Integer::sum));
		System.out.println(add);
		System.out.println(data1.apply("22"));
		
		
		 
		System.out.println(randomIntegerSupplier.get());
		System.out.println(bina.apply(22, 33));
		System.out.println(unaryy.apply(22));
		
		System.out.println(bipi.test(11, 22));
		
			boolean result  = bipi.and(bipe).test(99, 78);	
			System.out.println(result);
		
		
		
		
		
		
		

	}

}
