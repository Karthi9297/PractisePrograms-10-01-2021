package org.day1;

public class PalindromenumbersCount {

	public static void main(String[] args) {
		int count=0;
		for (int n = 1; n <=1000; n++) {
			int a,i=0,j=0;
			a=n;
			while(a>0) {
				i=a%10;
				j=(j*10)+i;
				a=a/10;
			}
			if(n==j) {
				count=count+1;
			}
		}
 System.out.println("The cont of palindrome Numbers between 1 to 1000 is :"+count);
	}

}
