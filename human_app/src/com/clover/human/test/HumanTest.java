package com.clover.human.test;

import com.clover.human.GenderCatecory;
import com.clover.human.Human;

public class HumanTest {

	public static void main(String[] args) {
		Human h1=new Human("Ravi", 20, 164.592, 45,GenderCatecory.MALE);
		Human h2=new Human("Ram", 25, 6, 50);
		System.out.println("Weight of "+h1.getName()+" before eat..."+h1.getWeight());
		h1.eat();
		System.out.println("Weight of "+h1.getName()+" after eat..."+h1.getWeight());
		System.out.println(h1.getHeight());
		
		System.out.println("Weight of "+h2.getName()+" before eat..."+h2.getWeight());
		h2.workout();
		System.out.println("Weight of "+h2.getName()+" after eat..."+h2.getWeight());
		System.out.println(h2.getHeight());
		double bmi=h1.bmiCalculator();
		if(bmi<18.4) {
			System.out.println(h1.getName()+" is underweighted and BMI is: "+bmi);
		}
		else if(bmi>24.9) {
			System.out.println(h1.getName()+" is Overweighted and BMI is: "+bmi);
		}
		else {
			System.out.println(h1.getName()+" is normal and BMI is:"+bmi);
		}
	}

}