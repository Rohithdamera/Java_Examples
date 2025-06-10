package Threads.Synchrorization;

 class Main_thread extends Thread{

	
		
		private Counter counter;
		
		public Main_thread(Counter counter) {
			this.counter= counter;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			//super.run();
			
			for(int i=0; i<1000; i++) {
				counter.increment();
			}
		}
		

	}


