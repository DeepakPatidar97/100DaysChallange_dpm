package com.challenge.day2;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int i =12, j = 10, temp;
		
		//Using temp variable
		
		temp = i;
		i = j;
		j = temp;
		
		System.out.println("i : "+i+", j : "+j);
		
		//without using temp
		i =12; j = 10;
		
		i = i + j;
		j = i - j;
		i = i -j;
		
		System.out.println("i : "+i+", j : "+j);
		
	}
}
