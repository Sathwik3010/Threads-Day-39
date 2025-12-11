package com.codegnan.multithreading;

import java.util.Scanner;

class SquarePrinter implements Runnable{
	private int n;
	
	public SquarePrinter(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		for(int i=1;i<=n;i++) {
            System.out.print(i * i);
            if(i<n)
            	System.out.print(" ");
		}
	}
}
public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		
		Thread t = new Thread(new SquarePrinter(n));
		t.start();
		sc.close();
	}

}
