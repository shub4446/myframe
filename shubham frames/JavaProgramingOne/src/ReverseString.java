import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.println("enteer string ");
		String ori = sn.next(); // abc
		String rev = "";
		for (int i = ori.length() - 1; i >= 0; i--) {
			rev = rev + ori.charAt(i);
		}
		/*
		 * if (ori.equalsIgnoreCase(rev)) {
		 * 
		 * System.out.println(rev + "its a palindrome"); } else {
		 * System.out.println("not a palindrome"); }
		 */
	}
}
//i/p == abc
//o/p == 1=2
