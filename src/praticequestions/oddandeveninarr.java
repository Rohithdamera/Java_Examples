package praticequestions;

import java.util.Scanner;

public class oddandeveninarr {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter size");
		int l=s.nextInt();
		int [] arr=new int[l];
		System.out.println("enter array");
		for(int i=0;i<l;i++) {
			arr [i]=s.nextInt();
		}
		for(int i=0;i<l;i++) {
			if(arr[i]%2==0) {
				System.out.println("even"+arr[i]);
			}else
				System.out.println(arr[i]+"odd");
		}

	}

}
