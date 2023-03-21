package array;

public class print_mul_of_first_3_max_num_in_array {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
	
		}
		int mul=0;
		for(int i=0;i<3;i++) {
			mul=mul+a[i];
			
		}
	
		System.out.println("the sum of biggest first three numbers is "+mul);
	}

}
