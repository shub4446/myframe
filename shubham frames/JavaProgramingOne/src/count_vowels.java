
public class count_vowels {

	public static void main(String[] args) {

		String a = "testeeeer";
		int vcount = 0;
		int cons=0;

		 for(int i=a.length()-1;i>=0;i--) {
		//for (int i = 0; i <a.length(); i++) {
			char d = a.charAt(i);
			if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') {
				vcount++;

			}
			else {//if you have to count the consonants 
				cons++;
				
			}
		}

		System.out.println("total vowels present ==" + vcount);
		System.out.println("total consonants present =="+cons);
	}

}
