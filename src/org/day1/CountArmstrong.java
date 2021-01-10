package org.day1;

public class CountArmstrong {

	public static void main(String[] args) {
		int count=0;
for (int n = 1; n <=1000; n++) {
	int a,i=0,j=0;
	a=n;
	while(a>0) {
		i=a%10;
		j=j+(i*i*i);
		a=a/10;
	}
	if(n==j) {
		count=count+1;
	}
	
}
System.out.println("The number of Armstrong numbers between 1 to 1000 is :"+count);
	}

}
