package Pratice_1;
class first extends Thread{
	public void run() {
		for(int i=0; i<=100; i++){
			System.out.println("First");
			try {
				Thread.sleep(10);
			}catch (InterruptedException e){
				e.printStackTrace();
				
			}
		}		
	}
	
}
class second extends Thread{
	public void run() {
		for(int i=0; i<=100; i++){
			System.out.println("second");
			try {
				Thread.sleep(10);
			}catch (InterruptedException e){
				e.printStackTrace();
				
			}
		}		
	}
	                                                   
}
public class Threads {

	public static void main(String[] args) {
		first f= new first();
		second s= new second();
		f.run();
		s.run();
	}

}
