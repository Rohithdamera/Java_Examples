package Java8functionalexx;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Satishbroques {

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
			 double total1 = (p * r * t) / 100;
	            System.out.println("Total Interest: " + total1);

	            System.out.println("Do you want to continue? (yes/no)");
	            String choice = s.next();
	            if (choice.equalsIgnoreCase("no")) {
	                break;  // Exit the loop if the user inputs "no"
	            }
	        }
	        //s.close();
			
		}



	public static void main(String[] args) {
		//main1();
		
		List<String> retriveDetails = Arrays.asList("PEN","PENCILE","PEN","PEN","ERRASOR","SHARPINOR","PENCILE");
		
		Map<String, Long> finlaResposne = retriveDetails.stream().sorted().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(retriveDetails.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
		System.out.println("inittial response :"+finlaResposne);
		
		//Map.Entry<String, Long> t= finlaResposne.entrySet().stream().max(Map.Entry.comparingByKey()).get();
		
		Map.Entry<String, Long> res= finlaResposne.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		System.out.println(finlaResposne.entrySet().stream().max(Map.Entry.comparingByValue()));
		
		
		System.out.println("Response :"+res);
		
		// // revese of a string  SATISH -> HSITAS	
		
		
		String name= "Rohi";
		String name1= "Rohi";
		
		String surname= "damera";
		
		
		//name= name +"damera";
		System.out.println(name==surname);
		System.out.println(name==name);
		System.out.println(name.equals(name1));
		
		
		
		StringBuffer l= new StringBuffer("vaishu");
		StringBuffer o=l.reverse();
		System.out.println(o);
		System.out.println("---------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String str = "ROHITH";
		
		int len = str.length();
		
		String rev =""; char ch;
		
		System.out.println("len->" +len);
		
		for(int i=0; i<len; i++) {
			
			rev = str.charAt(i) + rev;
			System.out.println("Revrese : "+rev);
		}
		
		System.out.println("Revrese : "+rev);
		String reverseOfString = Arrays.stream(str. split(" ")).map(x -> new StringBuffer(x).reverse()).collect(Collectors.joining(" "));
		
		
		System.out.println("Revrese of a name :"+reverseOfString);
		
		
		System.out.println("------------------------------");
		
		
		
		HashMap<Integer , String>j=new HashMap<>();
		j.put(1, "apple");
		j.put(2, "banana");
		j.put(2, "banana");
		j.put(3, null);
        j.put(null, "cherry");
		System.out.println(j.entrySet().stream().map(n->n).collect(Collectors.toList()));
		System.out.println(j.entrySet().stream().map(n->n.getValue()).collect(Collectors.toList()));	
		//java 8 
		
		
		
		Hashtable<Integer , String>s=new Hashtable<>();
		s.put(1, "apple");
		s.put(2, "banana");
		//s.put(3, null);
		System.out.println("------------");
		System.out.println(s.entrySet().stream().map(n->n.getValue()).collect(Collectors.toList()));	
		
		
				
				
				String data= "avacado";
				String reverse= new StringBuffer(data).reverse().toString();
				String reverse1= new StringBuilder(data).reverse().toString();
				System.out.println(reverse + ","+reverse1);
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
				
				
				String revv="ahtor";
				System.out.println(Arrays.stream(revv.split(" ")).map(x-> new StringBuffer(x).reverse()).collect(Collectors.toList()));
			       
				
				
				
				
				String reversed = new StringBuffer(revv).reverse().toString();
				System.out.println(reversed);
				
				
				
				
				String exxx="yadu rangula vana";
				String ww="ihuhsiavorchinnar";
				
				
				String o1o= new StringBuffer(ww).reverse().toString();
				System.out.println(o1o);
				StringBuffer lolo= new StringBuffer(ww);
				System.out.println(lolo.reverse());
				//System.out.println(lolo.);
				
				
				
				
				char [] t= exxx.toCharArray();
				
				HashSet<Character> j1= new HashSet<Character>();
				HashSet<Character> j2= new HashSet<Character>();
				
				
				
				for(char x:t) {
					if(j1.add(x)==true) {
						System.out.println(x);
					}
					
				}
				System.out.println("-----------------------");
				
				
				for(char x1: ww.toCharArray()) {
					j2.add(x1);
				}
				
				for(char c:j2) {
					System.out.println(c);
				}
				
			       }
			       
				
					
				
	}
	

