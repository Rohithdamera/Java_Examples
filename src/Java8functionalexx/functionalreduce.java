package Java8functionalexx;

import java.util.List;

public class functionalreduce {

	public static void main(String[] args) {
		List<Integer> number= List.of(1,22,34,5,66,9,8);
		List<Integer> number1=List.of(33,44,5,56,2,76,44,98);
		addthroustreams(number);
		whiichonebig(number1);
	    //System.out.println(sum);
		

	}
	
	
	private static void sum (int a , int b) {
		System.out.println(a+ +b);
		
	}
	private static void whiichonebig(List<Integer> number1) {
		int result =number1.stream().reduce(0,(a,b)->a>b?a:b);
		int result2= number1.stream().reduce(Integer.MIN_VALUE, (a,b)->a+b);
		
		int result3= number1.stream().sorted().limit(3).reduce(0, (a,b)->a+b);
		
		//System.out.println("----00------");
		System.out.println(result+"---"+result2+"-----------"+result3);
	}


	private static void addthroustreams(List<Integer> number) {
		//return number.stream().reduce(0, functionalreduce::sum);
		int num = number.stream().reduce(5, (a,b)->a+b);
		System.out.println(num);
		System.out.println("----8---------");
		int sum1= number.stream().reduce(0, Integer::sum);
		int sum2= number.stream().map(n->n*n*n).reduce(0, Integer::sum);
		int sum3 = number.stream().filter(n->n%2==1).reduce(0, Integer::sum);
		System.out.println(sum2);
		System.out.println("-------------");
		System.out.println(sum1);
		System.out.println("-------------");
		
		
		
		
	}

}
