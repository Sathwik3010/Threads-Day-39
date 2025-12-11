package com.codegnan.multithreading;

import java.util.Scanner;

class CountdownThread extends Thread{
	private int n;

	public CountdownThread(int n) {
		super();
		this.n = n;
	}
	
	public void run() {
		for(int i=n;i>=1;i--) {
			System.out.print(i);
			if(i>1)
				System.out.print(" ");
		}
	}
}
public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		CountdownThread ct = new CountdownThread(n);
		ct.start();
		sc.close();
	}

}
