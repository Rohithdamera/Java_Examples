package praticequestions;

import java.util.Scanner;

class string{
	int g=0;
	string(int g){
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String k=s.nextLine();
		int e=Integer.parseInt(k);
		System.out.println(e+g);
		
	}
}
public class Stringtoint {

	public static void main(String[] args) {
		string s=new string(4);
		

	}

}
