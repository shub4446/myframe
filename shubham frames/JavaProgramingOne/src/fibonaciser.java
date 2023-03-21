import java.util.Scanner;

//0	1	1	2	3	5 =fibo series i/p =5

public class fibonaciser {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		  
		System.out.println("value of a == ");
		int number=sn.nextInt();		//i/p = 4
		int a,b,temp=1;
		
		
		if(number>0)// else please enter valid number because less than 0 we dont have any use of that 
		{
			a=0;
			b=1;
			temp = a+b; //1st t=1	2nd t=	3rd t=	4th t=
			
			System.out.println(+a);
			System.out.println(+b);
			
			//a=0	b=1	temp=1
			for(int i=2;i<=number;i++)//	2,3
			{
				System.out.println(+temp);	//a		b	1	2	3
				a = b;	//1st =a=1 2nd=1	3rd=2
				b = temp;	//1st	b=1	2nd=2	3rd=3
				temp = a+b;	//1st	t=2	2nd=3	3rd=5
				
				
			}
			//i/p=4 o/p = 0 1 1 2 3
			
		}
		else
		{
			System.out.println("plese enter valid number");
		}
		
		
		
		
	}

}



/*
int a=0;
int b=1;
int c;

for(int i=0;i<=5;i++) {
	 
	 c=a+b;//c= 1 , 2 , 3 , 5 ,8,13

System.out.println(c);
a=b;		//a= 1 , 1 , 2 , 3 ,5
b=c;		// b= 1, 2 , 3 , 5 , 8
*/
/*
 * swapping 
 * c=a; a=b; b=c;
 * 
 * a=a+b; b=a-b; a=a-b;
 * 
 * a=a*b; b=a/b; a=a/b;
 */
