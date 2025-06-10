package Threads_status.Threads_statuss;



//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class Main_Thread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("RUNNING");
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e){
			System.out.println(e);
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		Main_Thread m= new Main_Thread(); // new thread
		System.out.println(m.getState());
		m.start();                        //runnable
		System.out.println(m.getState());
		Thread.sleep(100);
		System.out.println(m.getState());
		System.out.println(Thread.currentThread().getState());	
		m.join();
		System.out.println(m.getState());
		
}

	
}
