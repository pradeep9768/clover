package com.clover.human;

public class Human {
	String name;
	int age;
	double height;
	int weight;
	GenderCatecory gender;
	
	public Human(String name,int age,double height,int weight,GenderCatecory gender){
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.gender=gender;
	}
	public Human(String name,int age,double height,int weight){
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.gender=GenderCatecory.MALE;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public GenderCatecory getGender() {
		return gender;
	}
	public void setGender(GenderCatecory gender) {
		this.gender = gender;
	}
	public void eat() {
		this.weight=this.getWeight() + (this.getWeight()*5)/100;
	}
	public void workout() {
		this.weight=this.getWeight() - (this.getWeight()*2)/100;
		this.height=this.getHeight() + (this.getHeight()*0.5)/100;
		
	}
	
	public double bmiCalculator() {
		double bmi=(this.getWeight())/(((this.getHeight())/100)*(this.getHeight())/100);
		return bmi;
	}
	
	

}
