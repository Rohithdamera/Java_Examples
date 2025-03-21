package Java8functionalexx;

import java.util.List;

public class functionalforeach {

	public static void main(String[] args) {
		List<Integer>numbers=List.of(1,2,3,4,5,6,7,8,9);
		//printnum(List.of(1,2,3,4,5,6,7));
		printnum(numbers);
		printevennum(numbers);

	}
	
	
	public static boolean printeven(int num) {
		return num%2==0;
	}
	
	
	public static void print(int numbers) {
		System.out.println(numbers);
	}

	private static void printnum(List<Integer>  numbers) {
		
		numbers.stream().forEach(functionalforeach::print);
		System.out.println("-------------");
		numbers.stream().forEach(System.out::println);
		
		
//		for(int i : numbers) {
//			System.out.println(i);
//		}
		
		
	}
	private static void printevennum(List<Integer> numbers) {
		System.out.println("-------------");
		numbers.stream().filter(functionalforeach::printeven).forEach(System.out::println);
		
	}


}
