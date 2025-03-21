package praticequestions;

import java.util.Scanner;

public class greatestarr {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of array");
	int k=s.nextInt();
	
	int l[]=new int[k];
	System.out.println("enter array");
	for (int i=0;i<k;i++) {
		l[i]=s.nextInt();
		
	}
	int o=0 ,u=0;
	for(int j=0;j<k;j++) {
		for(int y=1;y<k;y++) {
			if(l[j]>l[y]) {
				o=l[j];
			}
				else
					u=l[y];
			}
		
	}
	System.out.println(o);
	//System.out.println(u);
	

	}

}
