package praticeStreams;


interface i{
	void t();
}

public class lambdafunctionex1 {

	public static void main(String[] args) {
		i I=new i() {
			public void t() {
				System.out.println("example");
			}
		};
		I.t();
		

	}

}
