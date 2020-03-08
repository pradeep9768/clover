package com.pro;

import com.beans.Customer;
import com.main.Deposit;

public class A implements Deposit{

	@Override
	public void deposit(double amount,Customer c) {
		if(amount<=limit) {
			System.out.println("Deposit Successful...");
			double newBalance=c.getBalance()+amount;
			c.setBalance(newBalance);
		}else {
			System.out.println("Your deposit amount crossed the limit...deposit amount should be less than or equal to 50,000");
		}
		
	}
}
