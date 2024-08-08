package com.Level2Problems;

class AreaCalculator {
    public double calculateArea(Rectangle rect) {
        return rect.length * rect.breadth;
    }

    public double calculateArea(Triangle tri) {
        return 0.5 * tri.base * tri.height;
    }
}

class Rectangle {
    double length;
    double breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Triangle {
    double base;
    double height;

    // Constructor
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}

public class Shape {
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(4, 5);
		
		Triangle tri = new Triangle(4, 5);

		AreaCalculator area = new AreaCalculator();

	    double rectangleArea = area.calculateArea(rect);
	    double triangleArea = area.calculateArea(tri);
	    
	    System.out.println("The area of the rectangle is: " + rectangleArea);
        System.out.println("The area of the triangle is: " + triangleArea);

	}
}


