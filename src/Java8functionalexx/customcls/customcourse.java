package Java8functionalexx.customcls;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class course{
	private String name;
	private String category;
	private int reviewscore;
	private int noofstudents;
	
	  public course(String name, String category, int reviewscore, int noofstudents) {
	        this.name = name;
	        this.category = category;
	        this.reviewscore = reviewscore;
	        this.noofstudents = noofstudents;
	    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewscore() {
		return reviewscore;
	}
	public void setReviewscore(int reviewscore) {
		this.reviewscore = reviewscore;
	}
	public int getNoofstudents() {
		return noofstudents;
	}
	public void setNoofstudents(int noofstudents) {
		this.noofstudents = noofstudents;
	}
	@Override
	public String toString() {
		return "course [name=" + name + ", category=" + category + ", reviewscore=" + reviewscore + ", noofstudents="
				+ noofstudents + "]";
	}
	
}
public class customcourse {

	public static void main(String[] args) throws IOException {
		List<course> cous= List.of(
				new course("spring", "framework", 98,289),
				new course("spring", "framework", 98,289),
				new course("react", "framework", 95,89),
				new course("gcp", "cloud", 95,28),
				new course("aws", "cloud", 95,34),
				new course("springboot", "framework", 55,44),
				new course("springg", "framework", 55,44),
				new course("genai", "AI", 75,14)
				);
		
		
		
		Predicate<course>allmatchh=course->course.getReviewscore()>90;
		Comparator<course>gettall=Comparator.comparing(course::getNoofstudents);
		Comparator<course>getreverse=Comparator.comparing(course::getNoofstudents).reversed();
		System.out.println("-----reverse------");
		System.out.println(cous.stream().distinct().sorted(getreverse).collect(Collectors.toList()));
		System.out.println("-----sorted------");
		System.out.println(cous.stream().sorted(gettall).collect(Collectors.toList()));
		System.out.println("-----contains only spring------");
		System.out.println(cous.stream()
    		    .map(n -> n.getName().contains("spring"))
    		    .sorted()
    		    .collect(Collectors.toList()));
		
		System.out.println("-----contains only spring------");	    
    		    List<String> finall = cous.stream()
    		    	    .filter(n -> n.getName().contains("spring"))  // Filter courses with names containing "spring"
    		    	    .map(n -> n.getName())                        // Map each course to its name
    		    	    .sorted()                                     // Sort the names alphabetically
    		    	    .collect(Collectors.toList());                // Collect as List<String>

    		    	System.out.println(finall);
		
		
		System.out.println("-----reverse------");
		System.out.println(cous.stream().sorted(Comparator.comparing(course::getNoofstudents).reversed()).collect(Collectors.toList()));
		System.out.println("-----comparingboth------");
		System.out.println(cous.stream().sorted(Comparator.comparing(course::getReviewscore).thenComparing(getreverse)).collect(Collectors.toList()));
		System.out.println("-----limit3------");
		System.out.println(cous.stream().sorted(Comparator.comparing(course::getReviewscore).thenComparing(getreverse)).limit(3).collect(Collectors.toList()));
		//[course [name=react, category=framework, reviewscore=95, noofstudents=89], course [name=aws, category=cloud, reviewscore=95, noofstudents=34], course [name=gcp, category=cloud, reviewscore=95, noofstudents=28]]
		
		
		System.out.println("-----skipping first 1------");
		System.out.println(cous.stream().sorted(Comparator.comparing(course::getReviewscore).thenComparing(getreverse)).skip(1).collect(Collectors.toList()));
		//[course [name=aws, category=cloud, reviewscore=95, noofstudents=34], course [name=gcp, category=cloud, reviewscore=95, noofstudents=28], course [name=spring, category=framework, reviewscore=98, noofstudents=289], course [name=spring, category=framework, reviewscore=98, noofstudents=289]]
		System.out.println("-----greaterthan 90------");
		System.out.println(	cous.stream().allMatch(allmatchh));
	    
		
	    System.out.println("-----give min or throw default value given ------");
	    System.out.println(cous.stream().filter(allmatchh).min(getreverse).orElse(new course("awws", "cloud", 95,34)));
	    System.out.println("-----max------");
	    System.out.println(cous.stream().filter(allmatchh).max(getreverse).orElse(null));
	
	
	System.out.println("-----dropWhile------");
	System.out.println(cous.stream().dropWhile(course->course.getReviewscore()<=95).collect(Collectors.toList()));
	System.out.println("-----takeWhile------");
	System.out.println(cous.stream().takeWhile(course->course.getReviewscore()>=95).collect(Collectors.toList()));
	System.out.println("-----noneMatch------");
	System.out.println(	cous.stream().noneMatch(course->course.getReviewscore()<90));
	
	System.out.println("-----anyMatch------");
	System.out.println(cous.stream().anyMatch(course->course.getNoofstudents()>=25));
	System.out.println("-----giving all data wich review score is >90------");
	System.out.println(cous.stream().filter(course->course.getReviewscore()>90).collect(Collectors.toList()));
	System.out.println("-----giving only name wich review score is >90------");
	System.out.println(cous.stream().filter(course->course.getReviewscore()>90).map(course->course.getName()).collect(Collectors.toList()));
	//[spring, spring, react, gcp, aws]
	
	
	System.out.println("-----groupingby------");
	System.out.println(cous.stream().collect(Collectors.groupingBy(course::getName,Collectors.counting())));
	System.out.println(cous.stream().collect(Collectors.groupingBy(course::getReviewscore,Collectors.counting())));
	System.out.println(cous.stream().map(course->course.getName()).collect(Collectors.counting()));
	System.out.println(cous.stream().collect(Collectors.groupingBy(course::getCategory,Collectors.maxBy(Comparator.comparing(course::getReviewscore)))));
	System.out.println(cous.stream().collect(Collectors.groupingBy(course::getCategory,Collectors.mapping(course::getName, Collectors.toList()))));
	
	
	String file = "C:\\Users\\rdamera\\OneDrive - Capgemini\\rohi\\ellipse\\pratice\\src\\Java8functionalexx\\customcls\\examplefortxt";
	System.out.println("-----txtfile------");
	Files.lines(Paths.get(file)).forEach(System.out::println);
	System.out.println("-----------");
    List <String> result=  Files.lines(Paths.get(file)).filter(n->n.contains("spring")).sorted().collect(Collectors.toList());
     result.stream().forEach(System.out::println);
     
     System.out.println("-----contains only spring------");	    
	    List<String> finalll = cous.stream()
	    		
	    	    .filter(n -> n.getName().contains("spring"))  // Filter courses with names containing "spring"
	    	    .map(n -> n.getName()).distinct()                        // Map each course to its name
	    	    .sorted()                                     // Sort the names alphabetically
	    	    .collect(Collectors.toList());                // Collect as List<String>

	    	System.out.println(finalll);
	    	
	    	
	    	//List<String>s= List.of("ram", "ram", "hanuma");
	    	List<String> s = List.of("ram","hanuma");
	    	List<Integer> s1=List.of(1,1,2,2,34,45,5,5);

	        // Convert to Map using the element as both key and value
	        Map<String, String> map = s.stream()
	                                   .collect(Collectors.toMap(
	                                       item -> item,   // Key
	                                       item -> item
	                                      // item -> item 
	                                       
	                                       // Value
	                                   ));
	        Set<Integer> s2= s1.stream().map(n->n).collect(Collectors.toSet());
	        System.out.println(s2);

	        System.out.println(map); 
	        
	        System.out.println(s1.stream().map(n->n).distinct().sorted().collect(Collectors.toList()));
	        
	        
	       
	}
	

}
