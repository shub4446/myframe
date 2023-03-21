package String_programme;

public class removethespacebetweenthestrings {

	public static void main(String[] args) {
		String str="i am from SDET42 batch";
		String[] s =str.split(" ");
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
	}

}
