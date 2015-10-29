package com.callable.samples;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class RunnabeWorkWithFutureTask implements Runnable {

	@Override
	public void run() {
		System.out.println("From inside the  thread - Hello World");
//		throw new RuntimeException();
		
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(1);

		FutureTask<String> fut = new FutureTask<String>(
				new RunnabeWorkWithFutureTask(), "HELLO PRINTED SUCESFULLY");

		service.execute(fut);

		try {
			System.out.println("isCancelled "+fut.isCancelled());
			Thread.sleep(2000);
			System.out.println("isDone "+fut.isDone());
			System.out.println(fut.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		service.shutdown();
	}

}
