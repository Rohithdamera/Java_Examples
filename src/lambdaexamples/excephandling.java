package lambdaexamples;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class excephandling {

	public static void main(String[] args) {
		int [] data= {1,2,3,4,5,6,7};
		System.out.println("enter a num");
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		
		exmethod(data, n,(v, k)->{
		try {
			System.out.println(v/k);
		}
		catch(ArithmeticException e){
			System.out.println("cant divide with zero");
			
		}
		
		});

	}

	private static void exmethod(int[] data, int n, BiConsumer<Integer, Integer> consumer) {
		int fact=1;
		for(int i:data) {
			consumer.accept(i, n);
			
			
			
			fact= fact*i;
			System.out.println(fact);
		}
		
	}

}
