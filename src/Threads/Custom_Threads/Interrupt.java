package Threads.Custom_Threads;

public class Interrupt extends Thread {
	
	public Interrupt(String name) {
		super(name);
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		//for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
				//System.out.println("thread"+i);
				System.out.println("thread started");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("thread interrputed");
			}
			
		}
	//}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Interrupt Thread1= new Interrupt("Thread1");
		Thread1.start();
		Thread1.interrupt();  // to inturrept thread
		Thread1.join();

	}

}
