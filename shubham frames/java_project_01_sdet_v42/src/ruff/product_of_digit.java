package ruff;

import java.util.Scanner;

public class product_of_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount  ");
		int n = sc.nextInt();
		int prod=1;
		while(n!=0) {
			prod = prod*(n-1);
			System.out.println(prod);
			
		}
	}

}
