package Java8functionalexx.customcls;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 class Another {
	
	private String name;
	private String des;
	private long salary;
	
	

	public String getName() {
		return name;
	}
	
	



	public void setName(String name) {
		this.name = name;
	}



	public String getDes() {
		return des;
	}



	public void setDes(String des) {
		this.des = des;
	}



	public Long getSalary() {
		return salary;
	}



	public void setSalary(Long salary) {
		this.salary = salary;
	}
    
	


	public Another(String name, String des, long salary) {
		
		this.name = name;
		this.des = des;
		this.salary = salary;
	}
    
	


	@Override
	public String toString() {
		return "another [name=" + name + ", des=" + des + ", salary=" + salary + "]";
	}



	public static void main(String[] args) {
		
		List<Another> e=List.of(new Another ("ram", "mca", 22000),
				                new Another ("rohith", "mca", 30000),
				                new Another ("rahu", "mba", 50000),
				                new Another ("ravan", "mba", 50000));
		System.out.println(e.stream().filter(n->n.getSalary()>20000).map(n->n.getName()).collect(Collectors.toList()));
		
		System.out.println(e.stream().sorted(Comparator.comparing(Another::getSalary)).distinct().collect(Collectors.toList()));
		
		System.out.println(e.stream().min(Comparator.comparing(Another::getSalary)));
		
		System.out.println(e.stream().map(n ->n.getSalary()).min(Long::compare));
		System.out.println(e.stream().map(n->n.getName().toUpperCase()).collect(Collectors.toList()));
		System.out.println(e.stream().filter(n->n.getDes().contains("mca")).map(n->n.getName()).collect(Collectors.toList()));
		System.out.println(e.stream().sorted(Comparator.comparing(Another::getSalary).reversed()).map(n->n.getName()).collect(Collectors.toList()));
		System.out.println(e.stream().max(Comparator.comparing(Another::getSalary)));
		System.out.println(e.stream().min(Comparator.comparing(Another::getSalary)));
		System.out.println(e.stream().map(n->n.getSalary()).skip(1).limit(1).collect(Collectors.toList()));
		System.out.println(e.stream().mapToDouble(Another::getSalary).average());
		System.out.println(e.stream().collect(Collectors.groupingBy(Another::getSalary,Collectors.counting())));
		System.out.println(e.stream().collect(Collectors.groupingBy(Another::getDes, Collectors.counting())));
		System.out.println(e.stream().findFirst());
		System.out.println(e.stream().mapToLong(Another::getSalary).sum());
		System.out.println(e.stream().map(n->n.getName()).findFirst());
		System.out.println(e.stream().filter(n->n.getSalary()>=25000).count());
		System.out.println(e.stream().collect(Collectors.toMap(Another::getName, Another::getSalary)));
		System.out.println("------");
		
		System.out.println(e.stream().max(Comparator.comparing(Another::getSalary)));
		
		System.out.println(e.stream().findFirst());
		System.out.println(e.stream().map(Another::getSalary).reduce(0L, Long::sum));
		System.out.println(e.stream().filter(n->n.getName().contains("u")).map(n->n.getName()).collect(Collectors.toList()));
		
		

		System.out.println(e.stream().collect(Collectors.groupingBy(Another::getSalary, Collectors.mapping(Another::getName, Collectors.toList()))));
		System.out.println(e.stream().collect(Collectors.groupingBy(Another::getName, Collectors.mapping(Another::getSalary, Collectors.toList()))));
		
		
	}

	
}
