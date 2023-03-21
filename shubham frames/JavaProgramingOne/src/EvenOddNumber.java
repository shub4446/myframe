import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		  
		System.out.println("value of a == ");
		int number=sn.nextInt();
		
		if(number%2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");

	}

}
