package Threads.Custom_Threads;

public class Start_Join extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=5; i++) {
		try {
			Thread.sleep(1000);
			//System.out.println("thread have started");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread have started");
		
		
	}
	}


	public static void main(String[] args) throws InterruptedException {
		Start_Join t1= new Start_Join();
		t1.start();
		t1.join();
		System.out.println("excuted");
		
		
		

	}

	
}
