package java_basics;

public class ArrayDuplicateElements {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 2, 7, 8, 8, 3 };
		System.out.println("Duplicate values found are:");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++)

			{
				int count = 1;
				int k = 1;
				if (a[i] == a[j]) {
					k++;
					// System.out.println(a[i]);
					System.out.println("The count of " + a[i] + "is " + k);
				} 
				//else
				//	System.out.println("The count is " + a[i] + "is " + count);

			}
		}
	}
}
	


