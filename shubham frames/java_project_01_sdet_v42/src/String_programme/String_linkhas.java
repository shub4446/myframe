package String_programme;

import java.util.LinkedHashSet;

public class String_linkhas {

	public static void main(String[] args) {

		String s="abcdefffff";
		LinkedHashSet<Character> set =new LinkedHashSet<>(); //no repeated values
		for(int i=s.length()-1;i>=0;i--) // forward order use for(int i=0;i<s.length;i++)
		{
			set.add(s.charAt(i));
		}
		for(char ch: set) {
			System.out.println(ch);

		}

	}

}
