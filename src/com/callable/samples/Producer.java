package com.callable.samples;

public class Producer implements Runnable{
	
	MyBlockingQueue<Integer> q = null;
	
	public Producer(MyBlockingQueue<Integer> q) {
		this.q = q;
	}

	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			try {
				q.in(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
