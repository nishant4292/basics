package com.raystech.javabasic;

public class Divisibleby7 {
	public static void main(String[] args) {
		int result =0;
		for(int i =100;i<=200;i++) {
			if ( i % 7==0)
			result += i;
		}
		System.out.println(result);
	}

}
