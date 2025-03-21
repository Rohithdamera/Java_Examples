package lambdaexamples;

public class persondetails {
	private String name;
	private String lastname;
	private int age;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public persondetails(String name, String lastname, int age, int salary) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "persondetails [name=" + name + ", lastname=" + lastname + ", age=" + age + ", salary=" + salary + "]";
	}
	
	

}
