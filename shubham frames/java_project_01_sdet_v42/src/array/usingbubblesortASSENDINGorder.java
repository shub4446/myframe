package array;

public class usingbubblesortASSENDINGorder {

	public static void main(String[] args) {

		int[] a= {5,1,2,4,9,8,6,4};
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
					
				}
					
			}
			System.out.print(a[i]+" ");
			 
		}
		
	}

}
