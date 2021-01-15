				package com.raystech.javabasic;

import java.util.Random;

public class Randomno1 {
	public static void main(String[] args) {
		int a = 100;
		int b = 1;
		for(int j=0;j<5;j++) {
		Random r = new Random();
		
		System.out.println(b +r.nextInt(a));
		}
		
	}

}
