import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num ===");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) {
			int d=num%10;
			sum=sum+d;
		}
		System.out.println(sum);
		num=num/10;
		
	}

}
