package org.day1;

import java.util.Scanner;

public class OddOrEven {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int a= sc.nextInt();
		if(a%2==0) {
			System.out.println("It is  an Even Number");
		}
		else {
			System.out.println("It is an Odd Number");
		}

	}

}
