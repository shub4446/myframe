package ruff;

import java.util.Scanner;

public class calculate_the_sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount  ");
		int sum=0;
		int n = sc.nextInt();
		
		while(n!=0) {
			int d= n%10;
			sum=sum+d;
			n=n/10;
			
		}	
	System.out.println("the sum of digits in n is "+sum);	
	}

}
