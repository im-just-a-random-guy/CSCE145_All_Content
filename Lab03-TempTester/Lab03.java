
/*
 * Written by Ryan Cook
 */

import java.util.Scanner;

public class Lab03 {

	public static void main(String[] args) 
	{


		Scanner k = new Scanner(System.in);
		int days = 10;
		double[] temps = new double[days];					//Used a double because the lab asked for decimals, not integers

		System.out.println("Enter temps for ten days:");
		for(int i = 0; i < days; i++) 
		{
			System.out.print("Day " + (i + 1) + ": ");
			temps[i] = k.nextDouble();						//Makes every new entry in the array what the user inputs
		}

		System.out.println();

		double sum = 0;


		for(int i = 0; i < temps.length; i++) 
		{
			sum += temps[i];								//Adds every temperature to the larger sum
		}

		double average = sum/days;

		System.out.println("average temp: " + average);

		System.out.println();

		int belowAverage = 0;							//Used to count the days that are below average

		System.out.println("The days that were below average were: ");
		for(int i = 0; i < days; i++) 
		{
			if (temps[i] < average) 
			{
				System.out.println("Day " + (i + 1) + " with " + temps[i]);		//used (i + 1) because the array i starts at 0
				belowAverage++;
			}
		}

	}

}
