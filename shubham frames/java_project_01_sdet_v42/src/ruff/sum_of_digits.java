package ruff;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount  ");
		 long n = sc.nextLong();
		 long sum = 0 ;
		while(n!=0) {
			 long d = n%10;
			sum=sum+d;
			n=n/10;
			
		}
		System.out.println(sum);
	}

}
