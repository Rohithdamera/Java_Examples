package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Strings1 {

	public static void main(String[] args) {
		 String q="i am rohith";
		    String empty=""; 
		       
		   	String result= q.replaceAll("\\s", "");
			System.out.println(result);
			System.out.println(q);
			
			
			for(int i=0; i<q.length();i++) {
				empty= q.charAt(i)+empty;
				
				
			}
			System.out.println(empty);
			
			
			String num= "1234";
			
			int oo =Integer.valueOf(num);
			//int ii= Integer.parseInt(result);
			System.out.println(oo );
			
			
			
			
			
			//--------------------------------------------
			
			System.out.println("------------------------");
			
			
			
			 String q1 = "i am  am rohith";
			 String q2="ramana ramana";
		        
		        // Create a HashMap to store character counts
		        Map<Character, Integer> charCountMap = new HashMap<>();
		        
		        // Loop through each character in the string
		        for (int i = 0; i < q1.length(); i++) {
		            char ch = q1.charAt(i);
		            
		            // Check if character is already in map
		            if (charCountMap.containsKey(ch)) {
		                charCountMap.put(ch, charCountMap.get(ch) + 1);
		            } else {
		                charCountMap.put(ch, 1);
		            }
		        }
		        
		        // Print the result
		        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
		            System.out.println(entry.getKey() + " -> " + entry.getValue());
		        }
		        
		        
		        
		        System.out.println("----------------1----------------");
		        
		        
		        //with java 8
		        
		        String reverseOfString = Arrays.stream(q1. split(" ")).map(x -> new StringBuffer(x).reverse()).collect(Collectors.joining(" "));
		 
		        //reverse
		        System.out.println(Arrays.stream(q1.split(" ")).map(x->new StringBuffer(x).reverse()).collect(Collectors.toList()));
		        System.out.println(Arrays.stream(q2.split(" ")).collect(Collectors.groupingBy(Function.identity(),  Collectors.counting())));
		        //letters count.
		        System.out.println(q1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		        System.out.println("-------2--------");
		        System.out.println(Arrays.stream(q1.split("")).filter(x->!x.isEmpty()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		        
		        //Remove Duplicates from a String
		        System.out.println( q2.chars().mapToObj(n-> String.valueOf((char)n)).distinct().collect(Collectors.joining()));
		        
		        System.out.println(Arrays.stream(q1.split(" ")).map(x->new StringBuffer(x)).distinct().collect(Collectors.toList()));
		        String kk="eeettt";
		        char[] a=kk.toCharArray();
		        System.out.println(Arrays.toString(a));
		        
	}
	}



