package String_programme;

public class swap1standlastwordsinsentnce {

	public static void main(String[] args) {

		String str="i am from sdet42 batch";//batch am from sdet42 i 
		String []s=str.split(" ");
		
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		
		
	}

}
