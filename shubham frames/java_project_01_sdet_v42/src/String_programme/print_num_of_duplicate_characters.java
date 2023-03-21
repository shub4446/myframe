package String_programme;

import java.util.LinkedHashSet;

public class print_num_of_duplicate_characters {

	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {

			set.add(s.charAt(i));

		}
		for(char ch: set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
				
				
			}
			if(count==1) {
				System.out.println(count +"===="+ch);
			}
		}

}
}