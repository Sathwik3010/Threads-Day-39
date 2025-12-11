package com.codegnan.multithreading;

import java.util.Scanner;

class NumberPrinter extends Thread{
	private int n;

	public NumberPrinter(int n) {
		super();
		this.n = n;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=n;i++) {
			System.out.print(i+(i<n ? " ":""));
		}
	}
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		
		NumberPrinter np = new NumberPrinter(n);
		np.start();
		sc.close();
	}

}
