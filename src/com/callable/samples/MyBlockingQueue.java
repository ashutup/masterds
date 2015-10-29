package com.callable.samples;

import java.util.LinkedList;

public class MyBlockingQueue<T> {

	private int maxBuffer = 10;
	private LinkedList<T> q = new LinkedList<T>();

	public synchronized void in(T t) throws InterruptedException {
		if (q.size() == maxBuffer) {
			System.out.println("Producer WAITING..........   ");
			wait();
		}
		if (q.size() < maxBuffer) {
			System.out.println("Producer NOTIFYING..........   ");
			notifyAll();
		}
		q.add(t);
		System.out.println("Producing " + t);

	}

	public synchronized T out() throws InterruptedException {
		if (q.size() == 0) {
			System.out.println("                                         Consumer WAITING..........   ");
			wait();
		}
		if (q.size() > 0) {
			System.out.println("                                         Consumer NOTIFYING..........   ");
			notifyAll();
		}
		T t = q.removeFirst();
		System.out.println("                                            Consuming " + t);
		return t;

	}

	public static void main(String[] args) {
		MyBlockingQueue<Integer> blockingQ = new MyBlockingQueue<Integer>();
		
		Thread pro = new Thread(new Producer(blockingQ));
		Thread cons = new Thread(new Consumer(blockingQ));
		
		cons.start();
		pro.start();

	}
	
	
	
	
	

}
