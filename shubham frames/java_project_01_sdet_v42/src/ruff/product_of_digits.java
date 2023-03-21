package ruff;

import java.util.Scanner;

public class product_of_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount  ");
		 long n = sc.nextLong();
		 long prod = 1 ;
		 
		 while(n!=0) {
			 long d = n%10;
			 prod=prod*d;
			n= n/10;
		 }
		System.out.println(prod); 
	}

}
