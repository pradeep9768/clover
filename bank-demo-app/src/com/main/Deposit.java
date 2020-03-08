package com.main;

import com.beans.Customer;

public interface Deposit {
	int limit=50000;
	void deposit(double amount, Customer c);

}
