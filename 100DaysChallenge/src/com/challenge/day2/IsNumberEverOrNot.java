package com.challenge.day2;

public class IsNumberEverOrNot {

	public static void main(String[] args) {
		int i = 3;
		
		if(isEvenOrNot(i)) {
			System.out.println(i + " is Even number");
		}else {
			System.out.println(i + " is odd number");
		}

	}
	
	static boolean isEvenOrNot(int n) {
		if(n%2==0)
			return true;
		else
			return false;
	}

}
