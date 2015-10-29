package com.callable.samples;

public class Consumer implements Runnable{


	MyBlockingQueue<Integer> q = null;
	
	public Consumer(MyBlockingQueue<Integer> q) {
		this.q = q;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			try {
				q.out();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
