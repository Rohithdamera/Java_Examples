package praticequestions;

import java.util.Scanner;

class example{
	//int l;
	public static int fact(int i) {
		if(i==0) {
		     return 1;
		}else {
			return i*fact(i-1);
		}
	}
	
}


public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		example a =new example();
		Scanner s= new  Scanner(System.in);
		System.out.println("enter a num");
		int k = s.nextInt();
		int result=a.fact(k);
		System.out.println(result);

	}

}
