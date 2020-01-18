package com.clover.rectangle.test;

import com.clover.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle smallRect = new Rectangle();
		Rectangle newRect = new Rectangle();
		smallRect.setLength(10);
		smallRect.width = 30;
		System.out.println("Length of the rectangle: " + smallRect.getLength());

		System.out.println("Area of smallRect:" + smallRect.calculateArea());
		System.out.println("Area of newRect: " + newRect.calculateArea());

	}

}
