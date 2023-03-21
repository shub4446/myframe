package String_programme;

public class Reverse_a_given_sentence {

	public static void main(String[] args) {

		String str="i am from SDET42 batch";//batch SDET42 from am i answer
		String [] s=str.split("");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(s[i]);
		}
	}

}
