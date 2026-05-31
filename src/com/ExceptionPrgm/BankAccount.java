package com.ExceptionPrgm;

public class BankAccount {

	private double balance;
	
	public BankAccount(double balance){
		
		this.balance = balance;
	}
	public void deposit(double amount)throws AccountBalanceException {
		
		if(amount<=0){
			throw new AccountBalanceException("Deposit amount must be greater than 0");
				
		}
		balance += amount;
		System.out.println("Deposited: " + amount);
	}
	
	public void withdrawal(double amount)throws AccountBalanceException {
		
		if(amount<=0){
			
			throw new AccountBalanceException("Withdrawal amount must be greater than 0");
	
		}
		if(amount > balance){
			
			throw new AccountBalanceException("Insufficient Balance");
		}
		balance -= amount;
		System.out.println("Withdrawal : " + amount);
	}
	public void checkBalance(){
		
		System.out.println("Current Balance : " + balance);
	}
}
