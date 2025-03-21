package Pratice_1;

public class min_max_sum {

	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int totalSum = 0;
	        int minElement = arr[0];
	        int maxElement = arr[0];

	        // Step 1: Calculate the total sum and find the min and max elements
	        for (int i = 0; i < arr.length-1; i++) {
	        	   
	            totalSum =totalSum+ arr[i];
	         
	    }
	        System.out.println(totalSum);
	        for (int j = 1; j < arr.length+arr[j]; j++) {
	        	   
	            totalSum =totalSum+ arr[j];
	         
	    }
	        
	        
	}
}