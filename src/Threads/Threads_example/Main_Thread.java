package Threads.Threads_example;

//import Threads.Thread_1;
//import Threads.Thread_2;

public class Main_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("this is an example");
//		System.out.println(Thread.currentThread().getName());
		
		Thread_1 thread = new Thread_1();
		thread.start();
		
		
		
		Thread_2 thread1 = new Thread_2();
		Thread t1 = new Thread(thread1);
		t1.start();
		
		
        
		for(int i=0; i<=1200; i++) {
			if(i%2!=0) {
				System.out.println("odd"+i);
			}
		}

	}

}
