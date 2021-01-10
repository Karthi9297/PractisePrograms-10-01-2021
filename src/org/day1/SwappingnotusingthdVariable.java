package org.day1;

import java.util.Scanner;

public class SwappingnotusingthdVariable {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two number");
		int a= sc.nextInt();
		int b= sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The swapped numbers are :");
		System.out.println(a);
		System.out.println(b);

	}

}
