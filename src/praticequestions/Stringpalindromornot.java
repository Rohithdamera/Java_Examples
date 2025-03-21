package praticequestions;

import java.util.Scanner;

public class Stringpalindromornot {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter a string");
        String l=s.nextLine();
		String y=new StringBuilder(l).reverse().toString();
		boolean isPalindrome = l.equals(y);
		if (isPalindrome) {
			System.out.println("equals");
		}else
			System.out.println("not equals");
	}

}
