package praticeclassobj;
class in{
	public void show() {
		//super.show();
		System.out.println("parent class");
	}
}
class inn extends in{
	public void show() {
		super.show();
		System.out.println("child class");  //if u print only inner class then rempove super line
	}
}
public class Anonymus_inner_class {

	public static void main(String[] args) {
		inn i = new inn() {
			
		
		public void show() {
			super.show();
			System.out.println("inner class");
		}
		
		};
		i.show();
	}

}
