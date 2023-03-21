
import java.util.HashSet;
import java.util.Set;

public class duplicate_character_remove {

	public static void main(String[] args) {

		// to remove duplicate element from string
		/*
		 * String str = "rubirani";// r, u, b, i, a, n]
		 * 
		 * LinkedHashSet<Character> set = new LinkedHashSet<>(); for (int i = 0; i <
		 * str.length(); i++) { set.add(str.charAt(i)); } for (Character ch : set) {
		 * 
		 * } System.out.println(set);
		 * 
		 * }
		 */

		// to print duplicate element //to remove duplicate element

		String names[] = { "java", "c", "ruby", "java" };
		Set<String> str1 = new HashSet<>();
		for (String n : names) {
			if (str1.add(n) == true) {
				{
					System.out.println(n);
				}
			}
		}
	}
}