package String_programme;

public class string_palindrome {

	public static void main(String[] args) {
		String pali="momom";
		String rev="";
		for(int i=pali.length()-1;i>=0;i--) {
			rev=rev+pali.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(pali)) {
			System.out.println("its a palindrome");
		}
		else {
			System.out.println("its not a pali");
		}
	}

}
