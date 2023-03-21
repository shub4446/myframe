package String_programme;

public class reversegivensentence {

	public static void main(String[] args) {

		String str="i am from SDET42 batch";
		String[] s =str.split(" ");
		for(int i=s.length-1;i>=0;i--) {
			System.out.print (s[i]+" ");
		}
	
	
	}

}
