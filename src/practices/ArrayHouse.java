package practices;

import java.util.Scanner;

public class ArrayHouse {

	public static void main(String[] args) {
		System.out.println("Enter 15 numbers");

		Scanner input = new Scanner(System.in);
		int[] house_Array = new int[15];
		for (int i = 0; i < house_Array.length; i++) {
			house_Array[i]=input.nextInt();
	}
		System.out.println("The Entered array elements are:");
		for (int i = 0; i < house_Array.length; i++) {
		System.out.println(house_Array[i]);
		}
		int evenhouse_sum=0,oddhouse_sum=0;
		System.out.println("Sum of even house residents");

		for (int i=0;i<=house_Array.length;i+=2)
		{
			evenhouse_sum =evenhouse_sum+house_Array[i];
			System.out.println(evenhouse_sum);
		}
		System.out.println("Sum of odd house residents");

		for(int i=1;i<house_Array.length;i+=2)
		{
			oddhouse_sum = oddhouse_sum+house_Array[i];
			System.out.println(oddhouse_sum);

		}
		
		if(evenhouse_sum>oddhouse_sum)
		{
			System.out.println("Even-numbered houses have more residents");
		}
		else
			System.out.println("Odd-numbered houses have more residents.");
	
			
input.close();
	}}

