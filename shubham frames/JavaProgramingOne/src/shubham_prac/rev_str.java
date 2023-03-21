package shubham_prac;

import java.util.LinkedHashSet;
public class rev_str {

	public static void main(String[] args) {
		/*
		 * String str ="ruby"; String rev=" ";
		 * 
		 * for(int i=str.length()-1;i>=0;i--){ rev=rev+str.charAt(i); }
		 * System.out.println("reverse of the string "+str+" is "+rev); }
		 */

		String Str = "rubyrani";

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < Str.length(); i++) {
			set.add(Str.charAt(i));

		}
		for (Character ch : set) {
			System.out.print(ch);
		}
	}
}
