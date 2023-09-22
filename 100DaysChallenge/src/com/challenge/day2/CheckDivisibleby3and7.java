package com.challenge.day2;

public class CheckDivisibleby3and7 {

	public static void main(String[] args) {
		int num1 = 21;
		int num2 = 14;
		
		System.out.println(divisible(num1));
		System.out.println(divisible(num2));
	}
	
	static String divisible(int num) {
		
		if(num%3==0 && num%7==0) {
			return "Yes";
		}else {
			return "No";
		}
		
	}

}
