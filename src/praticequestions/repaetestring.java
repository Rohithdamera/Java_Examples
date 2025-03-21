package praticequestions;

import java.util.Scanner;

public class repaetestring {

      public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			System.out.println("enter a string ");
			String k=s.nextLine();
			k=k.toUpperCase();
			int l=k.length();
			//int r=0;
			for(int i=0;i<=l-1;i++) {
				char c=k.charAt(i);
				for(int j=i+1; j<l;j++) {
					char d=k.charAt(j);
					//try {
						
					
					if(c==d) {
						System.out.println("repeating values are"+c);
						break;
					}
			}
			
		}
			
			System.out.println("no letters are repeated");
		

	}
}


