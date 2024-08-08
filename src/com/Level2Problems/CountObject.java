package com.Level2Problems;

public class CountObject {
	static int count=0;
	CountObject(){
		count++;
	}
	public static void main(String[] args) {
		CountObject obj1 = new CountObject();
		CountObject obj2 = new CountObject();
		CountObject obj3 = new CountObject();
		CountObject obj4 = new CountObject();
		System.out.println("The Number of Times the Object is Created : "+count);
	}
}
