package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface Arthimatic_operation{
	public int performoperation(int a , int b);
	
}
public class Streamsexample {

	public static void main(String[] args) {
List<String> retriveDetails = Arrays.asList("PEN","PENCILE","PEN","PEN","ERRASOR","SHARPINOR","PENCILE");
		
		Map<String, Long> finlaResposne = retriveDetails.stream().sorted().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//retriveDetails.stream().sorted().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
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
		  int sum = Arrays.stream(arr).sum();
	        System.out.println("Sum of all numbers in the array: " + sum);
		  
		  
		  // Find the second higest number frm interger
			
			List<Integer> list = Arrays.asList(1,2,3,4,5,6);
			
			  
			
			       Optional<Integer> secondHigest= list.stream().sorted(Collections.reverseOrder()).skip(1).findAny();
			       
			       if(secondHigest.isPresent()) {
			    	   
			    	   System.out.println("Second higesr no :"+secondHigest);
			       }
			       
			       
			       List<Integer> list1 = Arrays.asList(1,2,3,4,4,5,6,7,7,8,9,9,9,9,9,9,9,10);
			       int mostFrequent = list1.stream()
			               .collect(Collectors.groupingBy(num -> num, Collectors.counting()))  // Group by each number and count occurrences
			               .entrySet()
			               .stream()
			               .max(Comparator.comparingLong(Map.Entry::getValue))  // Find the max by the count of occurrences
			               .get()  // Get the result from Optional
			               .getKey();  // Extract the number (key)

			           System.out.println("Number repeated the most: " + mostFrequent);
			      // set<Integer>
	}
		

	}


