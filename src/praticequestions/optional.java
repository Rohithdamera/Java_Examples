package praticequestions;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class optional{

	public static void main(String[] args) {
		String[] str = new String[10];
		 str[5]="ram";
		 System.out.println(str[5]);
		 
		 Optional<String> empty= Optional.empty();
		 System.out.println("empty");
		 //System.out.println(str[6]);
		 Optional<String>value = Optional.of(str[5]);
		 System.out.println(value.get());
		 
		 Optional<String> nullvalue=Optional.ofNullable(str[4]);
		 nullvalue.ifPresent(System.out::println);
		 System.out.println(nullvalue.orElse("no value"));
		 
		 Optional<String>nonemptystring=(Optional.of("Data"));
		 Optional<String>emptystring=Optional.empty();	
		 
		 System.out.println("nonemptystring:"+nonemptystring.map(String::toUpperCase));
		 System.out.println("emptystring:"+emptystring.map(String::toUpperCase));
		Optional<Optional<String>>nonemptystringinput=Optional.of(Optional.of("dataaa"));
		System.out.println("nonemptystringinput:"+nonemptystringinput.map(input->input.map(String::toUpperCase).get()));
		Optional<Optional<String>>nonemptystringinput1=Optional.of(Optional.of("atta"));
		System.out.println("nonemptystringinput"+nonemptystringinput1.flatMap(input->input.map(String::toUpperCase)));
		System.out.println(nonemptystringinput1.get());
		 System.out.println(value.get());
		
//		 List<String> c=Arrays.asList( "China","mumbai");	
//		 Optional<List<String>> countryList = Optional.of(c);
//
//	        countryList.ifPresent(list -> list.forEach(System.out::println));
		 //Optional<String>emptyCountry=Optional.empty(); 
		 
		 Optional<String> Country= Optional.of("INDIa");
		 //Optional<String> Country1= Optional.of("CHINa");
		 Country.ifPresent(c -> System.out.println(Country));
		 //Country1.ifPresent(c -> System.out.println(Country1));
		 System.out.println(Country.orElse("data not available"));
		 Optional<String>c= Optional.empty();
		 System.out.println(c.orElseGet(() ->"data not available"));
		 //System.out.println(c.orElseThrow(NoSuchElementException::new));
		 
		 
		 
	}
}