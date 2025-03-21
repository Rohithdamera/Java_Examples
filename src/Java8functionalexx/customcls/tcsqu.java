package Java8functionalexx.customcls;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class tcsqu {
	
	private String name;
	private String gender;
	private int age;
	private long salary;
	
	
	
	
	

	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public String getGender() {
		return gender;
	}






	public void setGender(String gender) {
		this.gender = gender;
	}






	public int getAge() {
		return age;
	}






	public void setAge(int age) {
		this.age = age;
	}






	public long getSalary() {
		return salary;
	}






	public void setSalary(long salary) {
		this.salary = salary;
	}


	public tcsqu(String name, String gender, int age, long salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}






	@Override
	public String toString() {
		return "tcsqu [name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
//second highest salary
//count of females


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<tcsqu>t= List.of(new tcsqu("rama", "male", 26, 34000),
		new tcsqu("ramu", "male", 26, 35000),
		new tcsqu("sita", "female", 36, 50000),
		new tcsqu("butterfly", "female", 37, 28000));
		
		
		
		
		System.out.println(t.stream().collect(Collectors.groupingBy(tcsqu::getName , Collectors.mapping(tcsqu::getSalary, Collectors.toList()))));
		System.out.println(t.stream().collect(Collectors.groupingBy(tcsqu::getName , Collectors.toList())));
		System.out.println(t.stream().map(n->n.getSalary()).sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList()));
		
		System.out.println(t.stream().filter(n->n.getGender().contains("female")).map(n->n.getName()).collect(Collectors.toList()));
		System.out.println(t.stream().collect(Collectors.groupingBy(tcsqu::getGender, Collectors.mapping(tcsqu::getName, Collectors.toList()))));
		System.out.println(t.stream().filter(n->n.getSalary()<50000).map(n->n.getName()).collect(Collectors.toList()));
		//System.out.println(t.stream().reduce(vtcsqu::getSalary)));
		System.out.println(t.stream().map(tcsqu::getSalary).reduce(Long::sum));
		
		System.out.println(t.stream().filter(n->n.getSalary () >=35000).filter(n->n.getGender().equalsIgnoreCase("female")).collect(Collectors.groupingBy(tcsqu::getGender, Collectors.toMap(tcsqu::getSalary, tcsqu::getName ))));
		
		
		
		
	}






	
	

}
