package com.pro;

import com.beans.Customer;
import com.main.Withdrawal;

public class B implements Withdrawal {

	@Override
	public void withdrawal(double amount, Customer c) {
		if(amount<=limit) {
			if(amount<=c.getBalance()) {
				System.out.println("Withdrawal Successful...");
				double newBalance=c.getBalance()-amount;
				c.setBalance(newBalance);
			}
			else {
				System.out.println("Insufficient Balance...");
			}
			
		}else {
			System.out.println("Your withdrawal amount crossed the limit...withdrawal amount should be less than or equal to 30,000");
		}
		
	}

}
