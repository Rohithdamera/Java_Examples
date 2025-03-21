package Pratice_1;

import java.util.Scanner;



import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {  // Infinite loop to keep asking the user for input
            System.out.println("Enter an integer (or type 'exit' to quit):");

            if (scanner.hasNextInt()) {
                int originalNum = scanner.nextInt();
                int num = originalNum;
                int reversedNum = 0;
                int remainder;

                // Using for loop to reverse the number
                for (; num != 0; num /= 10) {
                    remainder = num % 10;
                    reversedNum = reversedNum * 10 + remainder;
                }

                // Checking if the original number is equal to the reversed number
                if (originalNum == reversedNum) {
                    System.out.println(originalNum + " is a palindrome.");
                } else {
                    System.out.println(originalNum + " is not a palindrome.");
                }

            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the program.");
                    break;  // Exit the loop if user types 'exit'
                } else {
                    System.out.println("Invalid input. Please enter a valid integer.");
                }
            }
        }
        
        scanner.close();
    }
}


//public class Palindrom {
//    public static void main(String[] args) {
//        int num, originalNum, remainder, reversedNum = 0;
//        String s ="exit";
//        
//        while (true) {
//        
//        String l = null;
//        if( l == s) {
//        	break;
//        }
//        else {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        num = scanner.nextInt();
//        originalNum = num;
//        
//       
//        while (num != 0) {
//            remainder = num % 10;
//            reversedNum = reversedNum * 10 + remainder;
//            num /= 10;
//        }
//        
//        
////        for (; num != 0; num /= 10) {
////            remainder = num % 10;
////            reversedNum = reversedNum * 10 + remainder;
////        }
////        
//        
//        if (originalNum == reversedNum) {
//            System.out.println(originalNum + " is a palindrome.");
//        }
//        else{
//            System.out.println(originalNum + " is not a palindrome.");
//        }
//        
//        
//        
//        
//    }
//        
//        
//}
//
//}
//}
