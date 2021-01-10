package org.day1;

import java.util.Scanner;

public class FactorialNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int count=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int numfact=sc.nextInt();
		for (int i = 1; i <=numfact; i++) {
			count=count*i;
		}
System.out.println("The factorial of "+numfact+" is :"+count);
	}

}
