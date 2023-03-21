package String_programme;

public class String_methoods {

	public static void main(String[] args) {
		//		String s="shubham";
		//		System.out.println(s.length());
		//		
		//		String sc="shubham ";
		//		String s1="is ";
		//		String s2="a good";
		//		String s3=" boy";
		//		System.out.println(sc.concat(s1).concat(s2).concat(s3));
		//		
		//		String s7="software ";
		//		String rev="";
		//		for(int i=s7.length()-1; i>=0;i--) {
		//			rev=rev+s7.charAt(i);
		//			
		//		}
		//		System.out.println(rev);

		String s="software";
		char[]str=s.toCharArray();
		int count=0;

		for(char c : str)
		{
			count++;
		}
		for(int i=count-1;i>=0;i--) {
			System.out.print(str[i]);
		}
		
		StringBuilder sbuild= new StringBuilder(s);
		System.out.print(sbuild.reverse());
	}

}
