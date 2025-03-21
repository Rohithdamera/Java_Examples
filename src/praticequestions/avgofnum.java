package praticequestions;

import java.util.Scanner;

public class avgofnum{
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int count=0,result=0;
		for (int i=0; i<5; i++) {
			System.out.println("enter a number");
			int l= s.nextInt();
			result+=1;
			count++;
		}
		double avg = (double) result/count;
		System.out.println(avg);
	}
}

