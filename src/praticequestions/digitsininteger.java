package praticequestions;

import java.util.Scanner;

public class digitsininteger {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("eneter a integer");
		int l=s.nextInt();
		
		int count=0;
		while(l!=0) {
			count++;
			l=l/10;
	}
		System.out.println(count);
	}

}
