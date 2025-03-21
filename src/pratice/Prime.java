package pratice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a num to identify either it is prime or not");
		int n=s.nextInt();
		if(n%2==0) {
			System.out.println(n+"  is a prime");
		}
		else
		{
			System.out.println(n+ "not prime ");
		}
	}

}
