package Java8functionalexx.customcls;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class anotherex {
	private String name;
	private int age;
	private String role;
	private long Salary;
	
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}
	
	
	public anotherex(String name, int age, String role, long salary) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
		this.Salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "anotherex [name=" + name + ", age=" + age + ", role=" + role + ", Salary=" + Salary + "]";
	}
	public static void main(String[] args) {
		anotherex person = new anotherex("John", 30, "Developer", 50000);
		
		List<anotherex> ex= List.of(new anotherex("rohith", 24 , "IT", 30000),
		                            new anotherex("ram", 25 , "nonIT", 20000));
		
		System.out.println(ex.stream().filter(n->n.getSalary()>25000).map(n->n.getName()).collect(Collectors.toList()));
		System.out.println(ex.stream().map(n->n.getSalary()).sorted().collect(Collectors.toList()));
		System.out.println(ex.stream().map(n->n.getSalary()).reduce( Long::sum));
		System.out.println(ex.stream().map(n->n.getSalary()).limit(1).collect(Collectors.toList()));
		System.out.println(ex.stream().map(n->n.getName()).map(n->n.toUpperCase()).collect(Collectors.toList()));
		System.out.println(ex.stream().map(n->n.getName()).filter(n->n.contains("m")).collect(Collectors.toList()));
		System.out.println(person);
	}

}
