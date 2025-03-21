package praticequestions;

import java.util.Scanner;



public class powerinrecur {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the starting no");
	int  i=s.nextInt();
	System.out.println("enter the power no");
	int j=s.nextInt();
	int result=power(i,j);
	
	System.out.println("result is"+result);

	}	
		public static int power(int i,int j) {
			

			if(j==0) 
				return 1;
			
			else
			return i* power (i,j-1);
		}
	}


