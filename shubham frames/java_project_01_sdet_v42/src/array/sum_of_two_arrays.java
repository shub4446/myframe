package array;

public class sum_of_two_arrays {

	public static void main(String[] args) {
		int [] a= {2,1,5,4,3,7,7};
		int [] b= {3,4,1,4,4,6};
		int length=a.length;   
		if(b.length>a.length)
		{  length = b.length;}
		
		for(int i=0;i<length;i++) {


			try {
				System.out.print(a[i]+b[i]);

			} catch (Exception e) {
				if(a.length<b.length) {
					System.out.println(b[i]);
				}else {
					System.out.println(a[i]);
				}
			
			}

		}

	}

}
