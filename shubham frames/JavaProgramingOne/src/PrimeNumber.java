import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		  
		System.out.println("enter number ");
		int number=sn.nextInt();		//i/p=5
		int count = 0;
		
		if(number>0)
		{
			for(int i=1;i<=number;i++)			//i = 	1st=1	2nd=2	3rd=3	4th=4	5th=5 
			{
				if(number % i == 0)				//if	1st 5/1=0true 2nd=5%2=false 3rd=5%3=false	4th=5/4=false 5th=5%5=otrue
				{
					count++;					//c=1 5thstep c=2
				}
				
				
			}
			if(count == 2)
			{
				System.out.println("number is prime");
			}
			else
			{
				System.out.println("number is not prime");
			}
			
		
		}
		else
		{
			System.out.println("enter valid numbers");
		}
		

	}

}
