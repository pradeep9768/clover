package com.clover.khateeb.practical1;

public class A {
	int x;
	int y;
	void m1() {
		System.out.println("A");
	}
	void m2(int x, int y ) {
		System.out.println(x+y);
	}
	int m3(int x) {
		return x*10;
	}
	int m4(int x, int y) {
		this.x=x;
		this.y=y;
		return x+y;	
	}
	int m5() {
		return x+y;
	}
}
