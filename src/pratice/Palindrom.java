package pratice;

import java.util.Scanner;





public class Palindrom {
    public static void main(String[] args) {
        int num, originalNum, remainder, reversedNum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num = scanner.nextInt();
        originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        }
        else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}



