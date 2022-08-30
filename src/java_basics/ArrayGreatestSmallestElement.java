package java_basics;

public class ArrayGreatestSmallestElement {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,8,9,14};
		int min=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j])
				{ min =a[i];
				}
				System.out.println(min +"is the smallest element");

			}
		}
	}

}
