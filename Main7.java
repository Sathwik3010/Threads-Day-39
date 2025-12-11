package com.codegnan.multithreading;

import java.util.Scanner;
class TicketCounter extends Thread {
private int n;
	
	public TicketCounter(int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=n;i++) {
            System.out.print("Ticket " +i);
            if(i<n)
            	System.out.print(" ");
		}
	}
}
public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		
		Thread t = new Thread(new TicketCounter(n));
		t.start();
		sc.close();
	}

}
