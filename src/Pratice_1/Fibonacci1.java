package Pratice_1;

import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args) {
        int a = 0, b = 1, r = 0, n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the ending number of Fibonacci sequence:");
        n = s.nextInt();
        
        System.out.println("result " + a); // Print the first Fibonacci number (0)
        if (n > 0) {
            System.out.println("result " + b); // Print the second Fibonacci number (1)
        }
        
        while (true) {
            r = a + b; // Calculate the next Fibonacci number
            if (r > n) {
                break; // Exit the loop if the next Fibonacci number exceeds `n`
            }
            System.out.println("result " + r); // Print the Fibonacci number
            a = b; // Update `a` to the previous `b`
            b = r; // Update `b` to the current Fibonacci number `r`
        }
        
        s.close();
    }
}