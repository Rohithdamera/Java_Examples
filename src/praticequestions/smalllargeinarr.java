package praticequestions;

import java.util.Scanner;

public class smalllargeinarr {

	public static void main(String[] args) {
		//int a[]=new int [10];
		Scanner s=new Scanner(System.in);
		System.out.println("enter a size");
		 int size = s.nextInt();
		 int[] arr = new int[size];
		 
		 //11,456,23
		 System.out.println("enter the num");
		 for(int i=0;i<size;i++) {
			 
			 arr[i]=s.nextInt();
		 }
		 int max=arr[0];
		 int min=arr[0];
			 for( int i=0;i<size;i++) {
			  if(arr[i]>max) {
				  max=arr[i];
			  }
			  
			  if(arr[i]<min) {
				  min=arr[i];
			  }
			   
		 }
	
		

		 System.out.println(max);
		
		 System.out.println(min);

}
}


