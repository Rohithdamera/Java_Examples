package praticequestions;

import java.util.Scanner;

public class powerofno {

	public static void main(String[] args) {
		int result=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num");
		int n=s.nextInt();
		System.out.println("enter the power no");
		int k=s.nextInt();
		
		for(int i=1;i<=k;i++) {
			
					result=result*n;
		}
		System.out.println("power of "+n+"is   "+result);

	}

}
