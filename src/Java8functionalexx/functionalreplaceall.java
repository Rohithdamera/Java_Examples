package Java8functionalexx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class functionalreplaceall {

	public static void main(String[] args) {
		List<String> sample= List.of("ramu", "likkiii", "mani");
		List<String> copy= new ArrayList(sample);
		List<String>courses= List.of("spring","spring", "springboot", "API", "Microservices", "Azure", "AWS", "GCP");
		List<String> data= new ArrayList<> (Arrays.asList("ram", "seta", "hanuma"));
        
		
        data.replaceAll(str->str.toUpperCase());
        System.out.println("-----------");
        System.out.println( copy.removeIf(str->str.length()>5));
        copy.replaceAll(str->str.contains("u") ? "A" :str);
       // copy.replaceAll(str->str .contains("a")? "A":str);
        System.out.println("-----------");
        System.out.println(data);
        System.out.println("-----------");
        System.out.println(copy);
        
        
        List<String> data1= courses.stream().flatMap(str-> Stream.of(str.split(""))).collect(Collectors.toList());
        List<String> result=courses.stream().flatMap(str->Stream.of(str.split(" "))).collect(Collectors.toList());
       data1 .replaceAll(str->str.contains("A")? "a" :str);
       result.replaceAll(str->str.contains("s")? "S" :str);
       System.out.println(result);
       System.out.println("-----1------");
        System.out.println(data1);
       // System.out.println(data1.stream().map(n->n.length()).collect(Collectors.toList()));
        
        List<Integer> s=data1.stream().map(n->n.length()).collect(Collectors.toList());
        System.out.println(data1.stream().map(n->n.length()).count());
       // System.out.println(s);
        
        
        System.out.println("-------2----");
        Map<Object, Long> frequencyMap = data1.stream()
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        System.out.println("-----------");
        System.out.println(data1.stream().collect(Collectors.groupingBy(str->str, Collectors.counting())));
        System.out.println("-----.------");
        System.out.println(data1.stream().collect(Collectors.groupingBy(str->str.contains("i")? "I" :str,Collectors.counting())));
        
        //List<String>call=courses.stream().flatMap(str->str.split("")).collect(Collectors.groupingBy(str->str.contains("i")? "I" :str,Collectors.counting()));
        
        Map<String, Long> call = courses.stream()
                .flatMap(str -> Arrays.stream(str.split(""))) // Split strings into individual characters
                .collect(Collectors.groupingBy(
                    str -> str.equals("i") ? "I" : str,       // Group by "I" for "i", otherwise keep as is
                    Collectors.counting()                 // Count occurrences
                ));
        System.out.println(call);
        
        System.out.println("-----.------");

        
        long maxFrequency = frequencyMap.values().stream().max(Long::compare).orElse(0L);
        System.out.println(frequencyMap);
        System.out.println(maxFrequency);
        
        String data6= "ramaramasetarama";
        
        List<Integer> number=List.of(1,2,1,3,4,5,6,4,6,7,5,75,6,75);
        
        String [] k = data6.split("");
        List<String> o= Arrays.stream(k).toList();
        System.out.println(o);
        System.out.println(o.stream().collect(Collectors.groupingBy(n->n , Collectors.counting())));
        System.out.println(o.stream() .filter(n -> Collections.frequency(o, n) > 1).collect(Collectors.toSet()));
        
        System.out.println(courses.stream().filter(n->Collections.frequency(courses, n)>1).collect(Collectors.toList()));
        System.out.println(courses.stream().collect(Collectors.groupingBy(n->n, Collectors.counting())));
        
        System.out.println(number.stream().map(n->n).limit(3).collect(Collectors.groupingBy(n->n, Collectors.counting())));
        System.out.println(number.stream().map(n->n).collect(Collectors.groupingBy(n->n, Collectors.counting())));
        
        
        
        
        
        String temp="wheniwasakid";
        String [] arr=temp.split("");
        List<String> finall= Arrays.stream(arr).toList();
        System.out.println(finall.stream().collect(Collectors.groupingBy(n->n, Collectors.toList())));
        System.out.println(finall.stream().collect(Collectors.groupingBy(str->str, Collectors.counting())));
        System.out.println(finall.stream().map(n->n).count());
        
	}

}
