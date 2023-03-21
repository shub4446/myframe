package ruff;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount  ");
		int n = sc.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++) {
		
			sum=sum*i;
			 //a=a*(n-1);
			
		}	
		 
		System.out.println(sum);
	}

}
