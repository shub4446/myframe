package array;

public class addtoarray {

	public static void main(String[] args) {
//		int []a= {2,1,5,4};
//		int []b= {3,4,1,4};
//		int length=a.length;
//		for (int i=0;i<length;i++) {
//			int c=a[i]+b[i];
//			System.out.println("sum of two arrays are "+c);
	int [] a= {1,5,4,3,6,7};
	int [] b= {3,4,3,8,5};
	int length=a.length;
	if(a.length<b.length) {
		length=b.length;
		
	}
	for(int i=0;i<length;i++) {
		int c=a[i]+b[i];
		System.out.println(c);
		
		
	}	
}
}


