package org.day1;

import java.util.Scanner;

public class PalindromeCheck {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		int a, i=0,j=0;
		a=n;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			//j=j+(i*i*i);
			a=a/10;
		}
        if(n==j) {
        	System.out.println("It is a Palindrome");
        }
        else {
        	System.out.println("It is not a Palindrome");
        }

	}

}
