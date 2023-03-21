package array;

public class print1stand2ndmaxnointoarraywithhoutbbsort {

	public static void main(String[] args) {
		int [] a= {5,2,1,4};

		int fmax=0;
		int smax=0;
		for(int i=0;i<a.length;i++)
		{

			if(a[i]>fmax) {
				smax=fmax;
				fmax=a[i];}

			else if(a[i]>smax) {
				smax=a[i];
			}

		}
		System.out.println(fmax +"first and second num is "+smax);

	}}
