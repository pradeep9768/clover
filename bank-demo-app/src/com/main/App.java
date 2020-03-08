package com.main;

import com.beans.Customer;
import com.pro.A;
import com.pro.B;

public class App {
	public static void main(String[] args) {
		
		A a1=new A();
		B b1=new B();
		
		Customer c1=new Customer("pradeep",20000);
		Customer c2=new Customer("ravi",10000);
		
		a1.deposit(10000, c1);
		
		b1.withdrawal(1000, c1);
		b1.withdrawal(11000, c2);
		System.out.println("--------------After withdrawal-----------------");
		System.out.println("Hello, "+c2.getName()+" your A/c balance is: "+c2.getBalance());
		
	}

}
