package praticequestions;

import java.util.Scanner;

public class secondlargestinarr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a size of array");
		int k=s.nextInt();
		int [] arr=new int[k];
		System.out.println("enter a array");
	     for(int i=0;i<k;i++) {
	    	  arr[i]=s.nextInt();
	    	 
	     }
	     int max=arr[0];
	     int min=arr[0];
	     int g=0;
	     for(int i=0;i<k;i++) {
	    	 //44,55,33,56
	    	 if(arr[i]>max)
	    	 max=arr[i];
	    	 g=max;
	    	 
	    	 if(g<=arr[i]) {
	    		 System.out.println(g);
	    		
	    	 }else
	    		 continue;
	    	 
	     }
	}

}
