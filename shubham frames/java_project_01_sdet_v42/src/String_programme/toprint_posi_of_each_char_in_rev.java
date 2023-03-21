package String_programme;

import java.util.LinkedHashSet;

public class toprint_posi_of_each_char_in_rev {

	public static void main(String[] args) {
		
		
		String s="tester";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(Character ch:set) {
			for(int i=s.length()-1;i>=0;i--) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+" is present in position "+(i+1));
					break;
				}
			}
			
		}
		
	}

}
