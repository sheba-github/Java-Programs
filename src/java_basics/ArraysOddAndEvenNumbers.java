package java_basics;

public class ArraysOddAndEvenNumbers {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 8, 9, 14 };
		for (int i = 0; i < a.length; i++) {
			if ((a[i] % 2) == 0)
               
				System.out.println(a[i] +" is an even number" );
			else
				System.out.println(a[i] + " is a odd number");

		}
	}

}