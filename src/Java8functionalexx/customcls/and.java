package Java8functionalexx.customcls;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class and {
	private String name;
	private long slary;
	private String desc;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getSlary() {
		return slary;
	}



	public void setSlary(long slary) {
		this.slary = slary;
	}



	public String getDesc() {
		return desc;
	}



	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	


	public and(String name, long slary, String desc) {
		super();
		this.name = name;
		this.slary = slary;
		this.desc = desc;
	}
     
	


	@Override
	public String toString() {
		return "and [name=" + name + ", slary=" + slary + ", desc=" + desc + "]";
	}



	public static void main(String[] args) {
		
		
		List<and> s=List.of(new and("rohith", 20000, "mca"),
				            new and("rama", 30000, "mca"),
				            new and ("sita", 40000, "mba"),
				            new and ("ravana", 40000, "mba"));
		
		
		System.out.println(s.stream().max(Comparator.comparing(and::getSlary)));
		List<String>k=s.stream().map(n->n.getName()).collect(Collectors.toList());
		System.out.println(k);
		System.out.println(k.stream().flatMap(n->Stream.of(n.split(""))).collect(Collectors.toList()));
		
		System.out.println(s.stream().map(and::getSlary).reduce(Long::sum));
		System.out.println(s.stream().mapToLong(and::getSlary).sum());
		System.out.println(s.stream().collect(Collectors.groupingBy(and::getSlary)));
		System.out.println(s.stream().collect(Collectors.groupingBy(and::getSlary, Collectors.mapping(and::getName, Collectors.toList()))));
		System.out.println(s.stream().collect(Collectors.groupingBy(and::getName, Collectors.mapping(and::getSlary, Collectors.toList()))));
		
		
	}

}
