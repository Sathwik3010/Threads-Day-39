package com.codegnan.multithreading;

import java.util.Scanner;
class FibonacciPrinter implements Runnable{

	private int n;
	
	public FibonacciPrinter(int n) {
		super();
		this.n = n;
	}

	@Override
	public void run() {
		if(n <=0)
			return ;
		
		if(n>=1)
			System.out.print(0);
		if(n>=2)
			System.out.print(" "+1);
		
		long a = 0, b = 1;
		for(int i=3; i<=n; i++) {
			long c = a + b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
		
}
public class Main10 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	       Thread t = new Thread(new FibonacciPrinter(n));
	       t.start();
	       sc.close();
	}

}
