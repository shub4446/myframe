import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		  
		System.out.println("value of a == ");
		int number=sn.nextInt();
		int fact=1;
		
		/*
		 * for(int i=1; i<=number;i++) { fact = fact * i; }
		 * System.out.println("factorial is == "+fact);
		 */
		
		for(int i=number;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
//i/p n=4
//o/p n= 1*2*3*4 = 24