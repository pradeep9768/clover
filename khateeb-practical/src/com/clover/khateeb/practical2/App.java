package com.clover.khateeb.practical2;

public class App {

	public static void main(String[] args) {
		A a=new A();
		A a1= a;
		a.x=10;
		a1.y=20;
		System.out.println(a.x); //10
		System.out.println(a.y); //20  expected 0
		A a2=new A();
		a2=a1;
		System.out.println(a2.y); //20 0
		a2=new A();
		System.out.println(a2.y); //0 20
				
	}

}
