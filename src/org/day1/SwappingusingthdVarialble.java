package org.day1;

import java.util.Scanner;

public class SwappingusingthdVarialble {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the two number");
	int a= sc.nextInt();
	int b= sc.nextInt();
	int c;
	c=a;
	a=b;
	b=c;
	System.out.println("The swapped numbers are :");
	System.out.println(a);
	System.out.println(b);
}
}
