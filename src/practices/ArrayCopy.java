package practices;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		System.out.println("Enter 20 numbers");

		Scanner input = new Scanner(System.in);
		int[] big_Array = new int[20];
		for (int i = 0; i < big_Array.length; i++) {
			big_Array[i]=input.nextInt();

		}
		System.out.println("The Entered array elements are:");
		for (int i = 0; i < big_Array.length; i++) {
		System.out.println(big_Array[i]);}
		
		int[] small_Array_One = new int[10];
		int[] small_Array_Two = new int[10];
		int len= big_Array.length;
		System.out.println("length: "+ len);
		int k =len/2;
		System.out.println("Value of k: "+ k);

	
		System.out.println("The elements copied in first small array are:");

		for (int i = 0; i <k; i++)
		{
			small_Array_One[i] =big_Array[i];
			System.out.println(small_Array_One[i]);

		}
		System.out.println("The elements copied in second small array are:");
		for(int j=0;j<k;j++)
		{ 

			small_Array_Two[j] = big_Array[j+10];
			System.out.println(small_Array_Two[j]);

			
		}
		
input.close();
		
		}
	}


