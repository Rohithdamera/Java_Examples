package Threads.Synchrorization;

public class Counter {
	
	private int count=0;
	
	//it works once one thread is done 
	
	public  synchronized void increment() {
		count++;
	}
	
	public int getcount() {
		return count;
		
	}

}
