import java.util.Scanner;

public class SwapingTwoNo {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.println("value of a == ");
		int a = sn.nextInt();

		System.out.println("value of b == ");
		int b = sn.nextInt();
		int c = 0;

		/*
		 * //1st logic using three variable//c=10 a=b; //a=20 b=c; //b=10
		 * 
		 * c=a; a=b; b=c;
		 * 
		 * System.out.println("value of a == "+a);
		 * System.out.println("value of b == "+b);
		 */

		
		/*
		 * //2nd logic using 2 variable + - //a=30 b=10 a=20 a = a+b; b=a-b; a=a-b;
		 * System.out.println("value of a == "+a);
		 * System.out.println("value of b == "+b);
		 */
		 

		
		/*
		 * //3nd logic using 2 variable * / a = a*b; //a=30 b=10 a=20
		 * 
		 * a=a*b; b=a/b; a=a/b; System.out.println("value of a == "+a);
		 * System.out.println("value of b == "+b);
		 */

		
		
		  //4th logic using 2 variable bitwise operator a = a^b; //a=30 b=10 a=20 
			b = a ^ b;
			a = b ^ a;
			System.out.println("value of a == " + a);
			System.out.println("value of b == " + b);

		}

}

//input a=20 and b=10
//o/p   a=10 and b=20