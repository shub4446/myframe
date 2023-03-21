package ruff;

import java.util.Scanner;

public class factorial_wehile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount  ");
		int n = sc.nextInt();
		int prod = 1;
		while(n!=0) {
			int d= n-1;
			prod=prod*d;
			
		}
		System.out.println(prod);
	}

}
