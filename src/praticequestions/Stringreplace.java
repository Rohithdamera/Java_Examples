package praticequestions;

import java.util.Scanner;

public class Stringreplace {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String k=s.nextLine();
		System.out.println("enter a another string");
		String h=s.nextLine();
		
		String result = "";

		for (int i = 0; i < k.length(); i++) {
		    char c = k.charAt(i);
		    if (h.indexOf(c) == -1) {
		        result += c;
		    }
		}

		System.out.println("Result: " + result); 
		
	}
	


}
