package praticeclassobj;

import java.util.Scanner;

class cal{
	public int add(int n1,int n2) {
		return n1+n2;
		
	}
	public int add(int n1 , int n2, int n3) {
		return n1+n2;
	}
	public double add(double n1 , double n2) {
		return n1+n2;
	}
}
public class methodoverload {

	public static void main(String[] args) {
		cal c=new cal();
		System.out.println("enter a num");
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		System.out.println("enter another num");
		int y=s.nextInt();
		int k=c.add(l, y);
		int z=c.add(11,12, 34);
		double h=c.add(12.4, 22.6);
		System.out.println(h);
		System.out.println(k);

	}

}
