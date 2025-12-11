package com.codegnan.multithreading;

import java.util.Scanner;

class FactorialThread extends Thread{
	private int n;

	public FactorialThread(int n) {
		super();
		this.n = n;
	}
	
	public void run() {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}
}
public class Main9 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();

	      FactorialThread t = new FactorialThread(n);
	      t.start();
	      sc.close();
	}

}
