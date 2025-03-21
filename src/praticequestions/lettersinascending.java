package praticequestions;

import java.util.Arrays;
import java.util.Scanner;

public class lettersinascending {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a name");
		String f=s.nextLine();
		char[] m=f.toCharArray();
		Arrays.sort(m);
		System.out.println("ascending order is");
		for(int c=1;c<=m.length;c++) {
			
			
		}
		System.out.println(m);
		
		}

}
