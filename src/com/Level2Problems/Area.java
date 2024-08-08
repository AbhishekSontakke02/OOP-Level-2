package com.Level2Problems;

import java.util.Scanner;

public class Area {
	
	private int area(int length, int breadth) {
		return length * breadth;
	}
	private int area(int side) {
		return side*side;
	}
	private double area(double radius) {
		double PI = 3.14;
		return PI*(radius*radius);
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Area obj = new Area();
		
		System.out.println("Enter the length of Square : ");
		int length = sc.nextInt();
		System.out.println("Enter the breadth of Square : ");
		int breadth = sc.nextInt();
		System.out.println("The area of Reactangle is : "+obj.area(length, breadth));
				
		System.out.println("Enter the Side of a Square : ");
		int side = sc.nextInt();
		System.out.println("The area of Squar is : "+ obj.area(side));
		
		System.out.println("Enter the Radius of Circle : ");
		double radius = sc.nextDouble();
		System.out.println("The area of Circle is : "+ obj.area(radius));
		
	}
}
