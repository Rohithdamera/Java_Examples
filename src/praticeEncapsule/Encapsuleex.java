package praticeEncapsule;


class demo{
	private int age;
	private String name;
	private String branch;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}
public class Encapsuleex {

	public static void main(String[] args) {
		demo d= new demo();
	    d.setAge(24);
		d.setName("Rohi");
		d.setBranch("MCA");

	}

}
