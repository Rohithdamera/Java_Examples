package lambdaexamples;

public class lambdafact {
	static fact1 factorial =(int n)->{
		  int fact =1;
		  for (int i=1; i<=n; i++) {
			  fact= fact*i;
		  }
		  return fact;
		  
	  };
	  interface fact1 {
		  int fact (int n);
	  }

	public static void main(String[] args) {
		lambdafact f= new lambdafact();
		int r= factorial.fact(3);
		int result=f.factorial.fact(5);
		System.out.println(result);
		System.out.println(r);
	  
	  
	  

	}

}
