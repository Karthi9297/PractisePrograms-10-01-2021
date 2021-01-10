package org.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1;
		int c;
		System.out.println("The Fibonacci series is");
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < 8; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
