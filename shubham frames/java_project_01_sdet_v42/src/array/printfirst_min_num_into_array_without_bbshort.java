package array;

public class printfirst_min_num_into_array_without_bbshort {

	public static void main(String[] args) {

		int [] a= {4,5,7,5,3};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(min>a[i]){
				min=a[i];

			}
			
			
		}
		System.out.println("the minimum num in the array is === "+min);
	}

}
