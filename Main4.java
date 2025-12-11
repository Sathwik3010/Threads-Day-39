package com.codegnan.multithreading;

import java.util.Scanner;

class StringPrinter implements Runnable{
	private int num;
	private String word;
	
	
	public StringPrinter(int num, String word) {
		super();
		this.num = num;
		this.word = word;
	}

	@Override
	public void run() {
		for(int i=1;i<=num;i++) {
			System.out.print(word);
            if (i < num) System.out.print(" ");
		}
		
	}
	
}
public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of counts");
		int n = sc.nextInt();
		System.out.println("Enter a word");
		String word = sc.next();
		Thread t = new Thread(new StringPrinter(n, word));
		t.start();
		sc.close();
	}

}
