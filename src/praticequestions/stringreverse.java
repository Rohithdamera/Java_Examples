package praticequestions;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		
		        Scanner s=new Scanner(System.in);
		        System.out.println("enter a string");
		        String str1=s.nextLine();
		        System.out.println("enter another string");
		        String str2=s.nextLine();
		
		      
		        
		        if(isReverse(str1, str2)) {
		            System.out.println(str1 + " and " + str2 + " are reverse of each other.");
		        } else {
		            System.out.println(str1 + " and " + str2 + " are not reverse of each other.");
		        }
		    }
		    
		    public static boolean isReverse(String str1, String str2) {
		        if(str1.length() != str2.length()) {
		            return false;
		        }
		        
		        int len = str1.length();
		        for(int i = 0; i < len; i++) {
		            if(str1.charAt(i) != str2.charAt(len-i-1)) {
		                return false;
		            }
		        }
		        
		        return true;
		    }
		

	}

