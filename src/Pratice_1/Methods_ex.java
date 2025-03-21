package Pratice_1;


//import pratice.meethod;

class meethod{
	public void ex() {
		System.out.println("ex1");
	}
	public String ex1(int a) {
		if(a>=2000) {
			return "pen";
		}else {
			return "nothing";
		}
		
	}
}




public class Methods_ex {
	public static void ex1() {
		System.out.println("ex11");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meethod o= new meethod();
		o.ex();
		ex1();
		String k=o.ex1(2500);
		System.out.println(k);		

	}

}
