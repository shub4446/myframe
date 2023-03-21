import java.util.Scanner;

/*start
 
 *
 **
 ***
 
 ***
 **
 *
 1
 12
 123
 
 123
 12
 1
 
 1
 22
 333
 
 end*/
public class PiramindPattern {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		System.out.println("value of a == ");
		int number = sn.nextInt();

		/*
		 * output 1
		 *
		 * 
		 ***/
		/*
		 * for (int i=1;i<=number;i++)//row i/p=3 1st=I0<3 Ti=1 2nd1<3T i=2 3rd 2<3T i=3
		 * 4th 3<=3T 5th i=4 4<=3F { for(int j=0;j<i;j++)//column //J0<1T j=1 2nd 1<2T
		 * j=2 3rd 2<3T j=3 4th= 3<3F { System.out.print("*"); }
		 * System.out.println("\n"); }
		 */

		/*
		 * output 2
		 ***
		 **
		 */

		for (int i = number; i >= 0; i--)// coloum i/p=3 1st=I0<3 Ti=1 2nd1<3T i=2 3rd 2<3Ti=3 4th 3<=3T 5th i=4 4<=3F
		{
			for (int j = 0; j < i; j++) // row //J0<1T j=1 2nd 1<2Tj=2 3rd 2<3T j=3 4th= 3<3F
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}

		/*
		 * output 3 1 12 123
		 * 
		 * 
		 * 
		 * for (int i=1;i<=number;i++)//coloum i/p=3 1st=I0<3 Ti=1 2nd1<3T i=2 3rd 2<3T
		 * i=3 4th 3<=3T 5th i=4 4<=3F { for(int j=1;j<=i;j++)//row //J0<1T j=1 2nd 1<2T
		 * j=2 3rd 2<3T j=3 4th= 3<3F { System.out.print(+j); }
		 * System.out.println("\n"); }
		 */

		/*
		 * outpot 4
		 * 
		 * 123 12 1
		 */

		for (int i = number; i >= 0; i--)// coloum i/p=3 1st=I0<3 Ti=1 2nd1<3T i=2 3rd 2<3T i=3 4th 3<=3T 5th i=4 4<=3F
		{
			for (int j = 1; j <= i; j++)// row //J0<1T j=1 2nd 1<2T j=2 3rd 2<3T j=3 4th= 3<3F
			{
				System.out.print(+j);
			}
			System.out.println("\n");
		}

		/*
		 * output 5 1 22 333
		 * 
		 * for (int i=0;i<=number;i++)//coloum i/p=3 1st=I0<3 Ti=1 2nd1<3T i=2 3rd 2<3T
		 * i=3 4th 3<=3T 5th i=4 4<=3F { for(int j=0;j<i;j++)//row //J0<1T j=1 2nd 1<2T
		 * j=2 3rd 2<3T j=3 4th= 3<3F { System.out.print(+i); }
		 * System.out.println("\n"); }
		 */

		/*
		 * output 6
		 * 
		 * 333 22 1
		 */
		/*
		 * for (int i=number;i>=0;i--)//coloum i/p=3 1st=I0<3 Ti=1 2nd1<3T i=2 3rd 2<3T
		 * i=3 4th 3<=3T 5th i=4 4<=3F { for(int j=1;j<=i;j++)//row //J0<1T j=1 2nd 1<2T
		 * j=2 3rd 2<3T j=3 4th= 3<3F { System.out.print(+i); }
		 * System.out.println("\n"); }
		 * 
		 */
		/*
		 * --* --* --*
		 * 
		 * --* --*
		 * 
		 * --*
		 */
		
		  for(int i=0;i<=number;i++) { for(int j=number-i;j>0;j--) {
		  System.out.print(j ); }
		  
		  System.out.println("\n");
		 
		  }
		 
//	
	}
}
