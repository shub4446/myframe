import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		  
		System.out.println("value of a == ");
		int number=sn.nextInt();
		
		if(number%4==0&&number%100!=0||number%400==0)
			System.out.println("leap");
		else
			System.out.println("not leap");

	}

}
