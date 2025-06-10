package Threads.Custom_Threads;

public class Yield extends Thread{
	public Yield(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"count"+i);
		Thread.yield(); // to run thread one by one 
	}}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yield y= new Yield("Thread1");
		Yield y1= new Yield("Thread2");
		y.start();
		y1.start();
		

	}

}
