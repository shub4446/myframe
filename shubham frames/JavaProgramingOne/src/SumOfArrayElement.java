
public class SumOfArrayElement {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
			sum = sum + a[i];	//0+1=1	1+2=3	3+3=6	6+4=10	sumFinalVaue=10
		}
		System.out.println("sum is "+sum);

	}

}
