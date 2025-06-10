package Threads.Synchrorization;

import Threads.Threads_example.Main_Thread;

public class Test_Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter counter= new Counter();
		Main_thread t = new Main_thread(counter);
		Main_thread t1 = new Main_thread(counter);
		t.start();
		t1.start();
		
		t1.join();
		t.join();
		System.out.println(counter.getcount());
		

	}

}
