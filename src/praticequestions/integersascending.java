package praticequestions;

import java.util.Arrays;
import java.util.Scanner;

public class integersascending {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number");
		Long k=s.nextLong();
		String u=String.valueOf(k);
		char[] r=u.toCharArray();
		Arrays.sort(r);
		for(char c:r) {
			
		}
		System.out.println(r);
		
	}

}
