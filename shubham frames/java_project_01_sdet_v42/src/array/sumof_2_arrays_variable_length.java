package array;

public class sumof_2_arrays_variable_length {

	public static void main(String[] args) {
		int [] a= {2,1,5,4};
		int [] b= {3,4,1,4,3};
		int length=a.length;
		if(b.length>a.length)
		{ length = b.length;
		}
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


