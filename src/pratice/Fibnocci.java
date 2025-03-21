package pratice;

import java.util.Scanner;

public class Fibnocci {
	//0 1 1 2 3 5 8 

	public static void main(String[] args) {
		
		int a=0, b=1, r=0, n;
		Scanner s= new Scanner (System.in);
		System.out.println("enter the ending num of fibnocci");
		n=s.nextInt();
		for(int i=0;i<n;i++) {
			if(i<=1) {
				r=i;
			}
		
			else if(r==n) {
				//System.out.println(r);
				break;
			}
			else {
				r=a+b;
				a=b;
				b=r;
				
			}
			System.out.println("result"+r);
			
		}
		
		
		
	}
}


