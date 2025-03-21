package Pratice_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import praticeclassobj.main;

public class Simple_interest {

	public static void main1(String[] args) {
		while(true) {
			int total ;
			Scanner s= new Scanner (System.in);
			System.out.println("enter the principal amount");
			int p= s.nextInt();
			System.out.println("enter annual interest rate");
			double r= s.nextDouble();
			System.out.println("enter time period in years ");
			int  t= s.nextInt();
			//total=p*r*t\100;
			
		}

	}

	public static void main(String[] args) {
		
		List<String> retriveDetails = Arrays.asList("PEN","PENCILE","PEN","PEN","ERRASOR","SHARPINOR","PENCILE");
		
		Map<String, Long> finlaResposne = retriveDetails.stream().sorted().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println("inittial response :"+finlaResposne);
		
		Map.Entry<String, Long> res= finlaResposne.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		System.out.println("Response :"+res);
		
		// // revese of a string  SATISH -> HSITAS	
		
		String str = "SATISH";
		
		int len = str.length();
		
		String rev =""; char ch;
		
		System.out.println("len->" +len);
		
		for(int i=0; i<len; i++) {
			
			rev = str.charAt(i) + rev;
		}
		
		System.out.println("Revrese : "+rev);
		
		
		//java 8 
		
		String reverseOfString = Arrays.stream(str. split(" ")).map(x -> new StringBuffer(x).reverse()).collect(Collectors.joining(" "));
		
				System.out.println("Revrese of a name :"+reverseOfString);
				
				
		//
				
		int[] arr = new int[] {1,2,3,4,5,6};
		int lenn = arr.length;
		
		  int[] d = IntStream.rangeClosed(1, lenn).map(x -> arr[lenn -x]).toArray();
		 
		  System.out.println("Revesre of a number :"+ Arrays.toString(d));
		  
		  
		  // Find the second higest number frm interger
			
			List<Integer> list = Arrays.asList(1,2,3,4,5,6);
			
			  
			
			       Optional<Integer> secondHigest= list.stream().sorted(Collections.reverseOrder()).skip(1).findAny();
			       
			       if(secondHigest.isPresent()) {
			    	   
			    	   System.out.println("Second higesr no :"+secondHigest);
			       }
			       
			       
			       List<Integer> list1 = Arrays.asList(1,2,3,4,4,5,6,7,7,8,9,9,9,9,9,9,9,10);
			      // set<Integer>
	}
	

	
	
	
	
	
	
	
	
	
}
