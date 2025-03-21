package praticequestions;

import java.util.Scanner;

public class Stringuniqe {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter a string");
		String k=s.nextLine();
		k=k.toUpperCase();
		int l=k.length();
		int n=0;
		for(int i=0;i<=l-1;i++) {
			char c=k.charAt(i);
			
			for(int j=i+1;j<l;j++) {
				char d=k.charAt(j);
				if(c==d)
				{
					n++;
					break;
				}
			}
		}
		
		
		if(n>=1) 
		System.out.println("not unique");
		
		else 
			System.out.println(" unique");
		
	}

}
