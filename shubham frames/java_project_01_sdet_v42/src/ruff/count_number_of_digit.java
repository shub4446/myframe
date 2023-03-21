package ruff;

import java.util.Scanner;

public class count_number_of_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount  ");
		
		int n = sc.nextInt();
		int count=0;
		
		do {
		n=n/10;
		count++;	
		} while (n!=0);
		System.out.println(count);

	}

}
