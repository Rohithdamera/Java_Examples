package praticequestions;

import java.util.Scanner;

public class lenofstring {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a string");
		String k =s.nextLine();
		//k.length();
		int count=0;
		for(int i=0;i<k.length();i++) {
			char o=k.charAt(i);
			count++;
			
		}
            System.out.println(count);
	}

}
