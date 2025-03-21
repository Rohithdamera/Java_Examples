package praticeclassobj;

import java.util.Scanner;

class add {
	int a;
	public int add(int num1, int num2) {
		int a=num1+num2;
		return a;
	}
	
}
public class addinclass {

	public static void main(String[] args) {
		int n1,n2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num");
		
		n2=s.nextInt();
		System.out.println("enter another num");
		 n1=s.nextInt();
		
		add obj =new add();
		int d=obj.add(n1 ,n2);
		System.out.println("result"+d);
		

	}

}
