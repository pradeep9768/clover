package com.main;

import com.beans.Customer;

public interface Withdrawal {
	int limit=30000;
	void withdrawal(double amount,Customer c);

}
