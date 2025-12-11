package com.codegnan.multithreading;

import java.util.Scanner;

class BankAccounts{
	int balance;

	public BankAccounts(int balance) {
		this.balance = balance;
	}
	
	public synchronized void deposite(int amount) {
		balance+=amount;
	}
	
	public synchronized void withdraw(int amount) {
		balance-=amount;
	}
}

class TransactionThread extends Thread{
	BankAccounts account;
	int amount;
	int index;
	
	
	public TransactionThread(BankAccounts account, int amount, int index) {
		super();
		this.account = account;
		this.amount = amount;
		this.index = index;
	}


	@Override
	public void run() {
		if(index % 2 == 1) {
			account.deposite(amount);
		} else {
			account.withdraw(amount);
		}
	}
}
public class Main12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount  = sc.nextInt();
		int n = sc.nextInt();
		BankAccounts account  = new BankAccounts(amount);

		Thread[] threads = new Thread[n];
		for(int i=1; i<=n; i++) {
			threads[i-1] = new TransactionThread(account, amount, i);
			threads[i-1].start();
		}
		
		for(Thread t: threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Balance: "+account.balance);
		sc.close();
	}

}
