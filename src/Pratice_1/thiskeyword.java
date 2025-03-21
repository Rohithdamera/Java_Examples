package Pratice_1;


class ex{
	int a;
	public int ex(int a){
		this.a=a;
		return a;
	}
	
}
public class thiskeyword {

	public static void main(String[] args) {
		ex e= new ex();
		int k= e.a=22;
		int s=e.ex(12);
		System.out.println(s +k);
		

	}

}
