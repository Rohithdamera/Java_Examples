package Pratice_1;
import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.println("Enter a string");
        String str= s.nextLine();
        
       String cleaned = str.replaceAll("\\s", "").toLowerCase();
       String result= new StringBuilder(str).reverse().toString();
       
       if(cleaned.equals (result)) {
    	   System.out.println("palindroime");
       }else {
    	   System.out.println("not_palindroime");
       }
        
       
        }
        
    }

