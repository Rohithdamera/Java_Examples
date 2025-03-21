package praticequestions;

import java.util.Scanner;

public class countrepeatedstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("eneter a string");
		String c= s.nextLine();
		int k=c.length();
		c.toUpperCase();
		int n=0;
		for(int i=0;i<=k-1;i++) {
			char a=c.charAt(i);
			for(int j=i+1; j<k;j++) {
				char b=c.charAt(j);
				if(a==b) {
					 n=n+1;
					 System.out.println("repeating are   "   +a +"  values is"+n);
						break;
					 
				}
				
			}
			
			
		}
		
		

	}

}
