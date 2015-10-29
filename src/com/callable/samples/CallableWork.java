package com.callable.samples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableWork implements Callable<String> {

	@Override
	public String call() throws Exception {

		return new Date(System.currentTimeMillis()).toString();
	}

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(10);
		List<Future<String>> futList = new ArrayList<Future<String>>();

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Future<String> fut = service.submit(new CallableWork());
			futList.add(fut);
		}

		for (Future<String> future : futList) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("=========================================");
		}

		service.shutdown();
	}

}
