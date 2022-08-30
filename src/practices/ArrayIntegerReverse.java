package practices;

import java.util.Scanner;

public class ArrayIntegerReverse {

	public static void main(String[] args) {
		System.out.println("Enter the 10 numbers");

		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i]=input.nextInt();

		}
		System.out.println("The Entered array elements are:");
		for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);}

		System.out.println("The reversed array is");

		for (int j = array.length - 1; j >= 0; j--) {
			System.out.println(array[j]);
		}

		input.close();
	}
}
