package Pratice_1;

import java.util.Scanner;

public class Array {

//	public static void main(String[] args) {
//		Scanner s= new Scanner(System.in);
//		System.out.println("enter limit of  array of elemnts");
//		int  k= s.nextInt();
//		//Scanner l=new Scanner (System.in);
//		int[] arr = new int[k];
//		System.out.println("enter the elements");
//		for(int i=0; i<=k; i++) {
//			arr[i]=s.nextInt();
//			
//			
//		}
//		System.out.println("the values are");
//		for(int i=0; i<k;i++) {
//			System.out.print(arr[i] +,"");
//		}
//		
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
	    }
	}




