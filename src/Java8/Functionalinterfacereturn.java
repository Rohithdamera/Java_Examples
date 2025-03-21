package Java8;
@FunctionalInterface
interface ex{
	int add(int i, int y);
}
public class Functionalinterfacereturn {

	public static void main(String[] args) {
		ex e=new ex()
		{
		
		public int add(int i, int j)
		{
			return i+j;
		}
		};
				int result=e.add(12,13);
				System.out.println(result);

		
	}
	}


