package com.raystech.javabasic;

public class ArmstrongNo {
	public static void main(String[] args) {
		int c=0,a ,n,t;
		n=407;
		t=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c= c+(a*a*a);
			
		}
		if (t==c)
			System.out.println(c+"armstrong no");
		else
			 System.out.println(t+ " not armstrong no");
	}

}
