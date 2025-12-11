package com.codegnan.multithreading;

import java.util.Scanner;

class EvenPrinter implements Runnable{

	private int n;
	public EvenPrinter(int n) {
		super();
		this.n = n;
	}

	@Override
	public void run() {
		for(int i=2; i<=n; i+=2) {
			System.out.print(i +(i<=n?" ":""));
		}
	}
}
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		Thread t = new Thread(new EvenPrinter(n));
		t.start();
		sc.close();
	}

}
