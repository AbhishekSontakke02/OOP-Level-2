package com.Level2Problems;

public class Shape {
	double area;
	private void area(double length , double breadth) {
		this.area = length * breadth;
	}
	private void area(double base , double hight , boolean triangle) {
		if(triangle) {
			this.area = 0.5 * base * hight; 
		}
	}
	
	public static void main(String[] args) {
		double side1 = 20;
		double side2 = 30;
		
		Shape obj = new Shape();

		obj.area(side1,side2);
		System.out.println("The area of Reactangle is : "+obj.area);

		obj.area(side1,side2,true);
		System.out.println("The area of Triangle is : "+obj.area);
	
	}
}
