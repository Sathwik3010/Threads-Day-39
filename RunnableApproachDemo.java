package com.codegnan.multithreading;

public class RunnableApproachDemo {

	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
//	t.run();
		for(int i=20; i>10; i--) {
			System.out.println(i);
		}
	}
}
