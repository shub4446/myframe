package array;

public class print1standsecondminnointoarray {

	public static void main(String[] args) {
		int [] a= {5,2,1,4};
		int fmin = a[0];
		int smin = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<fmin) {
				smin=fmin;
				fmin=a[i];
			}else if(a[i]<smin) {
				smin=a[i];
			}
			
		}
		System.out.println(fmin + " is the first min value and sec num is  " +smin);
	}

}
