package lambdaexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class personmainmethod {

	public static void main(String[] args) {
		
		List<persondetails> people = Arrays.asList(
				new persondetails("rohith", "damera", 25, 30000), 
		        new persondetails("chinna", "d", 26, 70000),
		        new persondetails("rama", "o", 23, 40000)
		        
		        
		        );
		//people.sort(people,(p1,p2)-> p1.getSalary().compareTo(p2.getAge()));
		people.sort(Comparator.comparingDouble(persondetails::getSalary)
                .thenComparingInt(persondetails::getAge));
		people.sort(Comparator.comparingInt(persondetails::getAge));
		System.out.println(people);
		Collections.sort(people,(p1,p2)->p1.getLastname().compareTo(p2.getLastname()));
		System.out.println("---------");
		System.out.println(people);
		
// Print sorted list
for (persondetails p : people) {
System.out.println(p);

	}
System.out.println("---------");	
printlastname(people);

	}
	
	
private static void printlastname(List<persondetails>people) {
	for (persondetails p : people) {
		if(p.getName().startsWith("r")) {
			System.out.println(p);
	}
}
	people.stream().filter(p->p.getName().startsWith("c")).forEach(System.out::println);


}
}
