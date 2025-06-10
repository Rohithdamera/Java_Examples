package Threads.Custom_Threads;

public class Set_priority  extends Thread{
	
	
	public Set_priority(String name){ // custom name 
		super(name);
		
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Set_priority Thread1 = new Set_priority("my custom thread1=");
		Set_priority Thread2 = new Set_priority("my custom thread2=");
		Set_priority Thread3 = new Set_priority("my custom thread3=");
		Thread1.setPriority(MAX_PRIORITY); // giving priority for threads
		Thread2.setPriority(MIN_PRIORITY);
		Thread3.setPriority(NORM_PRIORITY);
		Thread1.start();
		Thread2.start();
		Thread3.start();
		

	}

}
