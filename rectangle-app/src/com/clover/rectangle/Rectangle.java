package com.clover.rectangle;

public class Rectangle {
	private int length;
	public int width;
	public String name;

	public Rectangle() {
	}

	public int calculateArea() {

		int result = this.width * this.length;
		return result;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;

	}

}
