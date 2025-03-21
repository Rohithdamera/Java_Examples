package pratice;

import java.util.Scanner;

public class Array {

//	public static void main(String[] args) {
    
//	}
//}
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Read the size of the array from the user
	        System.out.print("Enter the size of the array: ");
	        int size = input.nextInt();

	        // Create an array of the given size
	        int[] arr = new int[size];

	        // Read the elements of the array from the user
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = input.nextInt();
	        }

	        // Print the elements of the array
	        System.out.println("The elements of the array are:");
	        for (int i = 0; i < size; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        
	       
//	    		
	    }
	}




