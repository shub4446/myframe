import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {

		// ori = olo rev=olo is palindrom {ori==rev}
		// ori= abc rev=cba is not palindrom

		Scanner sn = new Scanner(System.in);

		System.out.println("enteer string ");
		String ori = sn.next(); // abc
		String rev = "";

		for (int i = ori.length() - 1; i >= 0; i--) // i=2 {0=a 1=b 2=c}
		{
			rev = rev + ori.charAt(i); // rev
		}

		System.out.println("revers == " + rev);

		if (ori.equals(rev)) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom");
		}
	}
}