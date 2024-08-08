package com.Level2Problems;

public class SumOf2_3_4_Aruguments {
	
	private int sum(int num1, int num2) {
		return num1+num2;
	}
	private int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	private int sum(int num1, int num2, int num3, int num4) {
		return num1+num2+num3+num4;
	}
	
	public static void main(String[] args) {
		SumOf2_3_4_Aruguments obj = new SumOf2_3_4_Aruguments();
		System.out.println(obj.sum(2,4,6,4));
	}
}
