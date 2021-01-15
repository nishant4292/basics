package com.raystech.javabasic;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter your no.");
		int n = s.nextInt();
		for (int i = 0; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a);
		}
	}
}
