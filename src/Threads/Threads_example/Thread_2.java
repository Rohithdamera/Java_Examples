package Threads.Threads_example;

public class Thread_2  implements Runnable{

	@Override
	public void run() {
		
		for (int i =0; i<1200; i++) {
			//if(i>1000|| i%2==0 ) {
			if(i%2==0) {
				i=i+10;
				System.out.println("those are added"+i);
			}
		}
		
	}

}
