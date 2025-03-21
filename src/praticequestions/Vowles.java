package praticequestions;

import java.util.Scanner;

public class Vowles {

	public static void main(String[] args) {
		int n=0,  p=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a string");
	String k=s.nextLine();
	for(int i=0;i<k.length();i++) {
		char c=k.charAt(i);
		
		
		if(c=='a'|| c=='e' || c=='i' || c=='o' ||c=='u' || c=='A'|| c=='E' || c=='I' || c=='O' ||c=='U' )
				{
			n++;
				}
		else if (Character.isLetter(c)) {
			p++;
		}
	}
	System.out.println("vowles"+n);
	System.out.println("notvowles"+p);
	
	
	

	}
	

}
