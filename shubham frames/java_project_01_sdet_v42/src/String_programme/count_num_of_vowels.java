package String_programme;

public class count_num_of_vowels {

	public static void main(String[] args) {
String str="india";

char[] ch=str.toCharArray();
int count=0;

for(int i=0;i<str.length();i++) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u') {
			count++;
			System.out.println("the character in form of vowel is "+ch[i]);
			
		}
	
}
System.out.println("total vowels in the words are " +count);	
}

}
