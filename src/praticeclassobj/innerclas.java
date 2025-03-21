package praticeclassobj;

class outer{
	outer(){
		System.out.println("outer constructor");
	}
	class inner{
		public  int add (int i, int j) {
			return i+j;
			
		}
		public void in() {
			System.out.println("example of inner class");
		}
		
	}
}
public class innerclas {

	public static void main(String[] args) {
		outer o= new outer();
		outer.inner i= o.new inner();
		int r=i.add(12,13);
		i.in();
		System.out.println(r);

	}

}

