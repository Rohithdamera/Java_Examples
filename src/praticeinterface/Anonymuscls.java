package praticeinterface;


interface Arithematicoperation{
	public int performoperation(int a, int b);
}
public class Anonymuscls {

	public static void main(String[] args) {
		int first_sum=89; int last_sum=22;
		Arithematicoperation obj = new Arithematicoperation(){
			public int performoperation(int a , int b) {
				
				return a+b;
			}
		};
		Arithematicoperation sum=(a,b)->(a+b);
		System.out.println(sum.performoperation(first_sum,last_sum));
		
	}

}
