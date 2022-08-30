package java_basics;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 8, 9, 14 };
		int b[] = new int[7];
		
		System.out.println("The elements of array a are: ");
		for (int i = 0; i < a.length; i++) {

			b[i] = a[i];

			System.out.println(a[i]);
		}

		System.out.println("The elements of array b are: ");
		for (int i = 0; i < b.length; i++) {


			System.out.println(b[i]);
		}

	}

}
