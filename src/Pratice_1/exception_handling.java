package Pratice_1;

public class exception_handling {

	public static void main(String[] args) {
		int k=0;
		int x=0;
		
		try {
			k=x/0;
			System.out.println(k);
		}
		
		catch(Exception e) {
			System.out.println("cant divide with 0");
//		}throw {
//			System.out.println("second exception");
////		}
			}
		
		finally {
			System.out.println("this will execude automatically");
		}


	}}


