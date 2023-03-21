package array;

public class toappend_os_at_last {

	public static void main(String[] args) {
//		int []a= {2,0,4,0,1,2,0,0,0};
//		int []b= new int[a.length];
//		int m=0;
//		int n=a.length-1;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]>=1&&a[i]<=9) { //use with == get 00002412
//				b[m]=a[i];
//				m++;
//
//			}else {
//				b[n]=a[i];
//				n--;
//			}
//		}for(int i=0;i<b.length;i++) {
//			System.out.print(b[i]);
		
		int [] a = {2,0,7,0,8,0,6};
		int []b=new int [a.length];
		int m=0;
		int q=0;
		int n=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				b[m]=a[i];
				m++;
			}
			else {
				b[n]=a[i];
				q++;
			}
			
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(b[i]);
			
		}
		System.out.println("m==="+m);
		System.out.println("n=="+n);
	}

}
