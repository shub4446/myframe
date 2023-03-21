package String_programme;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class remove_duplicatecharinastring {

	public static void main(String[] args) {

		String s="kannada";
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++ ) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		for(Character ch:set) {
			System.out.print(ch);
		}
	}

}
