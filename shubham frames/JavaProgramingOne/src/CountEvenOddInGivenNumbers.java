import java.util.Scanner;

public class CountEvenOddInGivenNumbers {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		  
		System.out.println("value of a == ");
		int number=sn.nextInt();
		int countEven=0,countOdd=0;
		int rem=0;
		
		
		
		
		//for(int i=1;number>0;i++)	
		while(number>0)
		{
			rem =  number%10;		//1st= 1234%10=4 2nd 123%10=3 3rd 12%10=2 4th 1%10=1
			if(rem%2 == 0)			//1st T 2nd 3/2F 2rd 2/2T 1/2F
			{
				countEven++;		//E=1 e=2
			}
			else
			{
				countOdd++;			//o=1 o=2
			}
			number = number/10;		//1st 1234 2nd 123	3rd12 4th 1 5th 0
			
			
		}
		
		System.out.println("even no is "+countEven);
		System.out.println("odd no is "+countOdd);
	}

}

