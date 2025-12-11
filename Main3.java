package com.codegnan.multithreading;

import java.util.Scanner;

class SumThread extends Thread{
	private int n ;
	private int sum=0;
	
	public SumThread(int n) {
		super();
		this.n = n;
	}

	
	public void run() {
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}

public class Main3 {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		SumThread t = new SumThread(n);
		t.start();
		sc.close();
	}

}
