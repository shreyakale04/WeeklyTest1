package com.ExceptionPrgm;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		BankAccount ac = new BankAccount(10000);
		
		try{
			System.out.println("Enter Deposit Amount");
			
			double depositAmt = sc.nextDouble();
			ac.deposit(depositAmt);
			
			System.out.println("Enter Withdrawal Amount");
			double withdrawalAmt = sc.nextDouble();
			ac.withdrawal(withdrawalAmt);
			
			ac.checkBalance();
		}
		catch(AccountBalanceException e){
			
			System.out.println(e.getMessage());
		}
		sc.close();
		

	}

}
