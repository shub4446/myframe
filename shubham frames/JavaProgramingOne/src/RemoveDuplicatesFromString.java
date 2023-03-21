import java.util.Scanner;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.println("enteer string ");
		String ori = sn.next(); 
		String temp = ori;
		String s1="";
		int count =0;

		for(int i=0; i<ori.length();i++)
		{
			char a=ori.charAt(i);
			for(int j=0;j<=i;j++)
			{
			if(a == temp.charAt(j))
			{
				count++;
				if(count == 1){
				s1 = s1+a;
				}
				
				
			}
			}
			
		}
		System.out.println(s1);
		
		//System.out.println(ori.charAt(i));
	}

}
