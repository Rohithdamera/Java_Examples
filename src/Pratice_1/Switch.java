package Pratice_1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
//		 int i=1;
//		switch (i){
//		
//		case 0:
//			System.out.println("o");
//			
//		case 1:
//			System.out.println("1");
			
		//}
		while(true) {
	
		Scanner si= new Scanner (System.in);
		System.out.println("enter the name ");
		String s=si.next();
		//Scanner s= new Scanner(System.in);
		//System.out.println("enter a num");
		switch(s) {
		
		case "rama":
			System.out.println("hi");
			break;
		
		case "sita":
			System.out.println("sita");
			break;

	}
		
		}

}
}
