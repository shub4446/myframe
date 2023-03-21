package ruff;

import java.util.Scanner;

public class modullus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount  ");
		int n = sc.nextInt();
		
		int big=n%10;
		while(n!=0) {
			int d=n%10;
			if(d<big) {
				big=d;
			}
			n=n/10;
		}
		System.out.println("small value is   "+big);
		
		
			}
}