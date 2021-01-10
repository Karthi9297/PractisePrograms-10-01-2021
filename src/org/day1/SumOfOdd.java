package org.day1;

public class SumOfOdd {

	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i <=100; i++) {
			if (i%2!=0) {
				count=count+i;
			}
			
		}
        System.out.println("The sum of odd numbers between 1 to 100 is : "+count);
	}

}
