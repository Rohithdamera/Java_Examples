package Threads.Threads_example;

public class Thread_1 extends Thread {


	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i=0; i<=1200; i++) {
			if (i%2==0) {
				System.out.println("this is even "+i);
				
			}
		}
		
		
	}

}
