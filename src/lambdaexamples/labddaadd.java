package lambdaexamples;

public class labddaadd {

	static adding addition=(int a, int b)-> a+b;
	
	
	interface adding{
		int add(int a , int b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=addition.add(12,23);
		System.out.println(result);

	}

}
