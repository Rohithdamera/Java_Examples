package praticequestions;

import java.util.Scanner;

public class sortinarr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a length of array");
		int l=s.nextInt();
		int []arr=new int[l];
		System.out.println("enter the arrays");
		for(int i=0;i<l;i++) {
			arr[i]=s.nextInt();				
			}
		//int temp=0;
		for(int k=0; k<l;k++) {
			for(int j=k+1;j<l;j++) {
				if(arr[k]>arr[j]) {
				int	 temp=arr[k];
					 arr[k]=arr[j];
					 arr[j]=temp;	
					 System.out.println(arr[j]);
					 System.out.println( arr[k]);
				}
				
			}
	
		}
		
		
		}

	}


