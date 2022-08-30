package java_basics;

public class ArrayAverage {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,8,9,14};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{sum=sum+a[i];
		System.out.println(a[i]);
		}
		System.out.println(sum);
		int average =sum/a.length;
		System.out.println("The average is"+ average);
		
	}
	

}
