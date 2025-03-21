package pratice;

public class patternloops {

	public static void main(String[] args) {
	 for(int i=1; i<=4; i++) {
		// System.out.println( );
		 for(int j=1; j<=4;j++) {
			 
			 int k=i+j-1;
			if(k>4) 
			{
				System.out.print(k-4+ "");
			}else {
				System.out.print(k+ "");
			}
			
		 }
		 System.out.println();
		 
	 }
	 

	}

}
