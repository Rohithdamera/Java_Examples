package Pratice_1;


@FunctionalInterface
interface inter{
	void interr();
	//void inet();
}
@FunctionalInterface
interface interrr{
	void interr();
	//void interrrr();
}





class bu implements inter{
	public void interr() {
		System.out.println("hi");
		
	}
}

class cu implements interrr{

	@Override
	public void interr() {
		// TODO Auto-generated method stub
		System.out.println("hii2");
		
	}

	//@Override
	
	
}
public class Functional_Interface {

	public static void main(String[] args) {
		inter n = new bu();
		n.interr();
			
		interrr  k= new interrr() {
			public void interr() {
				System.out.println("rohi");
			}
			
		};
		k.interr();
		cu c= new cu() ;
			c.interr();
		
		

	}
	
	

}
