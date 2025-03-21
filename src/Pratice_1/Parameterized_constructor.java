package Pratice_1;

class constr{
	private int id;
	private String acc_no;


public constr(int a , String n) {   //passing parameters parametrized  constructor
	id=a;
	acc_no=n;
	System.out.println(id+":"+acc_no);
}

public constr() {                    //Default constructors
	id=12;
	acc_no="4321";
	System.out.println(id+":"+acc_no);
	
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getAcc_no() {
	return acc_no;
}


public void setAcc_no(String acc_no) {
	this.acc_no = acc_no;
}
}

public class Parameterized_constructor {

	public static void main(String[] args) {
		
		constr r= new constr(10, "1234567");
		constr k= new constr();
		
		

	}

}
