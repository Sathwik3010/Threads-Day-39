package com.codegnan.multithreading;

import java.util.Scanner;
class OddPrinter implements Runnable{

	private int n;
	
	public OddPrinter(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		for(int i=1;i<=n; i+=2) {
			System.out.print(i+(i<n?" ":""));
		}
	}
}

class EvenPrinters implements Runnable{

	private int n;
	
	public EvenPrinters(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		for(int i=2;i<=n; i+=2) {
			System.out.print(i+(i<n?" ":""));
		}
	}
}

public class Main8 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        Thread oddThread = new Thread(new OddPrinter(n));
	        Thread evenThread = new Thread(new EvenPrinters(n));

	        oddThread.start();
	        try {
				oddThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        evenThread.start();
	        sc.close();
	}

}
