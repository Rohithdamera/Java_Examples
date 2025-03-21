package praticeclassobj;

public class main {

	public static void main(String[] args) {
		studentcls s= new studentcls();
		coursescls c=new coursescls();
		s.rollno=24;
		s.name="rohi";
		s.dateofbirth="17/11/98";
		s.city="Tirupathi";
		c.BEE="BEE";
		c.CIVIL="CIVIL";
		c.CSE="CSE";
		c.ECE="ECE";
		c.ITI="ITI";
		c.MECH="MECH";
		
		System.out.println(s.rollno);
		System.out.println(s.name);
		System.out.println(s.dateofbirth);
		System.out.println(s.city);
		System.out.println(c.CSE);
		//System.out.println(s.rollno);
		
	}

}
