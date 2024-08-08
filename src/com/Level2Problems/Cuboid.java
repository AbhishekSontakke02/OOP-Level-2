package com.Level2Problems;

public class Cuboid {
	
	double length,breadth,height;
	
	Cuboid(double length, double breadth , double height){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	private void perimeter() {
		double perimeter = 4 * (length + breadth+ height);
		System.out.println("The perimeter of the Cuboid is : "+ perimeter);
	}
	private void area() {
		perimeter();
		double area = 2*((length*breadth)+(breadth*height)+(height*length));
		System.out.println("The Total Surface Area of Cuboid is : "+ area);
	}
	private void voulme() {
		area();
		double volume = length*breadth*height;
		System.out.println("The Vloume of Cuboid is : "+ volume);
	}
	
	public static void main(String[] args) {
		Cuboid obj = new Cuboid(4,5,3);
		obj.voulme();
	}
}
