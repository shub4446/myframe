package shubham_prac;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		System.out.println("enteer string ");
		String ori = sn.next();
		String rev = "";

		for (int i = ori.length() - 1; i >= 0; i--) {
			rev = rev + ori.charAt(i);}
			if (ori.equals(rev)) {
				System.out.println("its A PALINDROME");
			
			}else {System.out.println("its not a palindrome");}
		}

	}
	

