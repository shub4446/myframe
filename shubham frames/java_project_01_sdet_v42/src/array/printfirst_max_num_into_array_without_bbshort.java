package array;

public class printfirst_max_num_into_array_without_bbshort {

	public static void main(String[] args) {

		int [] a= {4,2,7,9,6,7};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
				if(max<a[i]) {
					max=a[i];
					
				}
		}
		System.out.println("the maximum number is ===="+max);
	}

}
