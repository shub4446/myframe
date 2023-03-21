 import java.util.Scanner;

public class ReverseNumberSumofDigitTotalNumberofDigitPalindromNumber {

	public static void main(String[] args) {
		
		//1=reverse nymber i/p=12345	o/p=54321
		//2=sum of digit  i/p=123	o/p=6
		//3=total number of digit i/p=12345 op=5
		//4=palindrom number i/p=101 o/p=101
		
		Scanner cin = new Scanner(System.in);
		  
		System.out.println("enter the number == ");	//123
		int oriNum=cin.nextInt();	
		int sn=0,nd=0,rn=0;
		int temp = oriNum;	//i/p=temp=ori=121
		
		while(oriNum > 0)	//1st=123	2nd=12	3rd=1 4th=0False
		{
			rn = rn*10 + oriNum%10;	//	oriN=123,rn=0	1st= 0+3=3	2nd oriN=12 rn=3 rn=3*10+2=32 3rd==	oriN=1 rn=32 rn=32*10+1=321 
			
			//sum of digit
			sn = sn + rn;	//1st 0+3=3 2nd 3+2=5	3rd=5+1=6 finalValue=6
			
			//number of digit
		//	nd = nd + 1;	
			
			oriNum = oriNum/10;		//1st ori=123/10=12 2nd ori=12/10=1 3rd= ori=1/10=0
			
		}
		
	//	System.out.println("reverse of no == "+rn);
		System.out.println("sum of digit == "+sn);
	//	System.out.println("number of digit == "+nd);
		 
		//palindrom start
		
				if(temp == rn)	//ori=123 		rn=321	i/p ori=121 rn=121 o/p== 0==121 false
				{
					System.out.println(+temp+" == "+rn+" Number is palindrom");
				}
				else
				{
					System.out.println(+temp+" == "+rn+" Number is not palindrom");
				}
				
		//palindrom end
				
		
		

	}

}