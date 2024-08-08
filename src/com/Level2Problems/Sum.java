package com.Level2Problems;

public class Sum {
	byte byte1, byte2;
	private int sum() {
		int int1 = (int) byte1;
        int int2 = (int) byte2;
        
        return int1 + int2;
	}
	public static void main(String[] args) {
		Sum obj = new Sum();
		obj.byte1 = 127;
		obj.byte2 = 127;
		
		System.out.println(obj.sum());
	}
}
