package examples;

enum Statuss{
	Running, Failed , Success;
}
public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int i=5;
	//Statuss s= Statuss.Running;
	Statuss [] s= Statuss.values();
	System.out.println(s);
	for(Statuss e: s) {
		System.out.println(s);
		
	}
	


}
}