package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		streammap();
		filtermap();
		filterstream();
		trycatch();
		collectstream();
		partitioningByStreams();
		parallelstream();

	}
	
	public static void streammap() {
		List<String> sample= new ArrayList<>();
		List<String> sample2= new ArrayList<>(Arrays.asList("once" , "upon" , "a", "time"));
		sample.add("rama");
		sample .add("sita");
		System.out.println(sample);
		Stream<String> r= sample.stream();
		Stream<String> k= sample2.stream();
		r.map(word->word.toUpperCase()).forEach(System.out::println);
		k.map(word->word.toUpperCase()).forEach(System.out::println);
		System.out.println("----------");
		sample.forEach(str -> {
            System.out.println(str);
        });
	}
	public static void filtermap() {	
		String[] arrayofexample= {"happy", "happyyy"};
		Stream<String> arrayofworsStream=Arrays.stream(arrayofexample);
		Stream<String[]> Streamofletters= arrayofworsStream.map(n->n.split(""));
		Streamofletters.flatMap(Arrays::stream).forEach(System.out::println);
	}
	
	public static void filterstream() {
		List<String> exx= new ArrayList<>(Arrays.asList("samsung","nokia", "apple"));
		Stream<String>l=exx.stream();
		Stream<String>ll=exx.stream();
		l.map(n->n.contains("ow")).forEach(System.out::println);
		ll.filter(m->m.startsWith("a")).forEach(System.out::println);
		exx.stream().filter(n->n.startsWith("n")).forEach(System.out::println);
	
		
	}
	
	
	public static void trycatch() {
		try {
		List<String> l=Arrays.asList("ramu", "seta");
		//Stream<String>y=l.stream();
		l.stream().filter(n->n.startsWith("r")).forEach(System.out::println);
		//y.forEach(System.out::println);
		//y.forEach(System.out::println);
		
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}
	public static void collectstream() {
		List<String> data= new ArrayList<>(Arrays.asList("ollectstream", "collect", "col"));
		//Stream<String> e=data.stream();
		List<String>o=data.stream().filter(n->n.startsWith("o")).collect(Collectors.toList());
		//data.forEach(System.out::println);
		o.forEach(System.out::println);
		//List<String>o=e.filter(n->n.startsWith("o")).collect(Collectors.toList());
		//o.forEach(System.out::println);
		
	}
	
	public static void partitioningByStreams() {
	    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	    Map<Boolean, List<Integer>> partitioned = numbers.stream()
	        .collect(Collectors.partitioningBy(n -> n % 2 == 0));

	    System.out.println("Even numbers: " + partitioned.get(true));
	    System.out.println("Odd numbers: " + partitioned.get(false));
	}
	
	
	public static void parallelstream() {
		List<Integer> n=new ArrayList<>(Arrays.asList(12,33,33,443,432,234,2));
		List<String> s= Arrays.asList("bhanu", "anadh");
		List<String> u= new ArrayList<>();
		List<Integer> o= new ArrayList<>(Arrays.asList(111,23,3,32,23,33,3));
		u.add("rama");
		u.add("sita");
		u.add("baba");
		u.add("ammayi");
		
		List<Integer> y= Arrays.asList(1,2,3,3,3,4,4,4,34);
		//s.add("one");
		List<Integer>k = n.stream().filter(r->r%2!=0).map(r->r+r).sorted().collect(Collectors.toList());
		k.forEach(System.out::println);
		s.forEach(System.out::println);
		u.forEach(System.out::println);
		
	}

	
	
	}


