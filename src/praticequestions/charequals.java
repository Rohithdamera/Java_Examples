package praticequestions;

import java.util.Scanner;

public class charequals {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a name");
	String k=s.nextLine();
	char p='u';
	int count=0;
	int y=k.length();
	for(int i=0;i<=y-1;i++) {
		char j=k.charAt(i);
		if(j==p) {
			count++;
		}
		
	}
	System.out.println(count);

	}

}
