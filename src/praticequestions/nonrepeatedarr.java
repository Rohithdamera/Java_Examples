package praticequestions;

import java.util.Scanner;

public class nonrepeatedarr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=s.nextInt();
		int [] arr=new int[size];
		System.out.println("enter the  array of elements");
		//12,32,12
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		for(int k=0;k<size;k++) {
			int count=0;
			int l=arr[k];
			for(int h=1;h<size;h++) {
				
				if(l==arr[h]) {
					break;
				
				}else {
					System.out.println(l);
					break;
				}
			}
					}
		
		
		
			
	}

}
