package Java8functionalexx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stringspecialchar {

	public static void main(String[] args) {
		
		String s= "Rohith98@123#";
		//List<String>k =Arrays.asList(s);
		//int count=0;
		//System.out.println(k.stream().map(n->n.contains("@123#")).count());
		
		
		
		
		List<Character> specialCharacters= new ArrayList<>();
				
		for(char i : s.toCharArray()) {
			 if (!Character.isLetterOrDigit(i)) {
	                specialCharacters.add(i);
				
			}
		}
		 System.out.println("Special Characters: " + specialCharacters);
	        System.out.println("Count of Special Characters: " + specialCharacters.size());
		}

	}


