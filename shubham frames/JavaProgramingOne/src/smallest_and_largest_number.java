
public class smallest_and_largest_number {

	public static void main(String[] args) {
		int number[] = { -10, 22, 65, 76, -88 };
		int largest = number[0];
		int smallest = number[0];

		for (int i = 1; i < number.length; i++) {
			if(number[i]>largest) {
				largest=number[i];
			}
			else if (number[i]<smallest)
			{
				smallest=number[i];
			}

		}
		System.out.println("the biggest number is =="+largest);
		System.out.println("the smallest number is =="+smallest);
	}

}
