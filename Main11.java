package com.codegnan.multithreading;

import java.util.Scanner;

class SharedCounter {
	public static int counter=0;
	
	public synchronized void increment() {
		counter ++;
	}
}

class CounterThread extends Thread{
	private int n;
	private SharedCounter shared;
	public CounterThread(int n, SharedCounter shared) {
		super();
		this.n = n;
		this.shared = shared;
	}
	@Override
	public void run() {
		for(int i=0; i<n; i++) {
			shared.increment();
		}
	}
}
public class Main11 {

	public static void main(String[] args) throws Exception{
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        SharedCounter shared = new SharedCounter();
	        
	        CounterThread ct1 = new CounterThread(n, shared);
	        CounterThread ct2 = new CounterThread(n, shared);

	        ct1.start();
	        ct2.start();
	        
	        ct1.join();
	        ct2.join();
	        
	        System.out.println(SharedCounter.counter);
	        sc.close();
	}

}
