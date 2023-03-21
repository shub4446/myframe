package shubham_prac;

import java.util.Scanner;

public class count_characters {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.println("enteer string ");
		String a = sn.next();
		int count = 0;
		for(int i=0;i<a.length();i++) {
			char b=a.charAt(i);
			for(int j=i;j>=0;j--) {
				char c=a.charAt(i);
				System.out.println(c);
				if(c==b) {
					count++;
				}
				
			}
		}
		System.out.println(count);
	}

}
