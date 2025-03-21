package Pratice_1;

import java.util.Scanner;

public class Fibnocci {
	//0 1 1 2 3 5 8 

	public static void main(String[] args) {
		
		
		        int a = 0, b = 1, r, n;
		        Scanner s = new Scanner(System.in);

		        System.out.println("Enter the ending number of Fibonacci: ");
		        n = s.nextInt();

		        System.out.println("Fibonacci series up to " + n + ":");
		        System.out.print(a + " " + b);

		        // Start from 2 since first two numbers (a and b) are already printed
		        for (int i = 2; ; i++) {
		            r = a + b;
		            if (r > n) {
		                break; // Stop if the next Fibonacci number exceeds the given number n
		            }
		            System.out.print(" " + r);
		            a = b;
		            b = r;
		        }
		        s.close();
		
		
//		int a=0; 
//		int b=1; 
//		int c=0;
//		int k;
//		Scanner s= new Scanner (System.in);
//		System.out.println("enter the num");
//		 k= s.nextInt();
//		
//		for(int i=0; i<=k; i++) {
//			if(i<=1) {
//				c=i;
//			}else if (c==k) {
//				System.out.println(c);
//				break;
//			}else {
//				c=a+b;
//				a=b;
//				b=c;
//			}
//			
//			System.out.println(c);
//		}
	}
}




