package String_programme;

public class reversethesentence_inastring {

	public static void main(String[] args) {
		String str="i am from SDET42 batch";
		String[] s =str.split(" ");
		for(int i=0;i<s.length;i++) {
			String st=s[i];
			for(int j=st.length()-1;j>=0;j--) {
				System.out.print(st.charAt(j));
			}
			System.out.print(" ");
		}
		
	}

}
