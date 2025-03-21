package praticeclassobj;

import java.util.Scanner;


//class colour {
//	String c;
//	public int 
//}
class pen{
	
	
	public String blue(int cost) {
		
		if (cost==10) 
			return "pen";
			else 
				return "we providing only 10 ruppes pens ";
			
		}
						
		
//		System.out.println("enter the cost");
//		int y=s.nextInt();
//		
//		if(y==10) {
//			System.out.println("You have purschased black 10 Ruppes pen");
//		}else if(o==5){
//			System.out.println("You have purschased black 5 Ruppes pen");
//			
//		}
//		else
//			System.out.println("plese choose a correct rate");
//		
	  
//	}
//		else
//			System.out.println("plese choose a correct colour");
//}

}



public class classpen {

	public static void main(String[] args) {
	
		
		
		pen obj=new pen();
		Scanner s= new Scanner (System.in);
		System.out.println("eneter the amount");
		int k=s.nextInt();
		String r =obj.blue( k);
		System.out.println(r);

	}

}

