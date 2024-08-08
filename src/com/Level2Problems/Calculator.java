package com.Level2Problems;

import java.util.Scanner;

public class Calculator {
	
	private int add(int num1,int num2) {
		return num1+num2;
	}
	
	private void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = sc.nextInt();
		System.out.println("The Addotion of Both Numbers is : "+add(num1,num2));			
	}
	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.input();
	}
	
}
