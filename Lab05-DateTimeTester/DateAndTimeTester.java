
/*
 * Written by Ryan Cook
 */

//NOTE  Sorry if the formatting messes up with the comments being beside the code instead of above or below it :/

import java.util.Scanner;

public class DateAndTimeTester 
{

	private int month;
	private int day;
	private int hour;
	private int minute;

	public void run() 
	{
		Scanner k = new Scanner(System.in);

		while (true) 
		{
			System.out.println("Enter a date and time (MM/DD HH:MM):");
			String userInput = k.nextLine();

			if (isValid(userInput)) 
			{
				System.out.println("The date and time is valid!");
			} 
			else 
			{
				System.out.println("Invalid input. Please use M/D H:MM format.");
			}

			System.out.println("Type quit to exit or press ENTER to continue:");
			String exit = k.nextLine();
			if (exit.equalsIgnoreCase("quit")) 				//Ignores whether the user puts 'quit' or 'Quit' or any other quirky combos
			{
				System.out.println("Goodbye!");
				break;
			}
		}
	}

	public boolean isValid(String input) {
		month = 0;
		day = 0;
		hour = 0;
		minute = 0;

		int num = 0;			//num is used to convert chars into strings so the program can compare in validity tests

		for (int i = 0; i < input.length(); i++) 
		{
			char c = input.charAt(i);			//Had to look up the best way for the program to read the special characters inputed by the user (/ and :)

			if (c >= '0' && c <= '9') {			
				num = num * 10 + (c - '0');		//This was part of looking up the above comment. It converts chars into ints so they can be validated
			} 
			else {
				if (getMonth() == 0) 
				{
					month = num;
				} 
				else if (getDay() == 0) 
				{
					day = num;
				} 
				else if (getHour() == 0) 
				{
					hour = num;
				} 
				else if (getMin() == 0) 
				{
					minute = num;
				}
				num = 0;			//Sets the num variable back to 0
			}
		}

		if (getMin() == 0 && num != 0) 
		{
			minute = num;
		} 
		else if (getHour() == 0 && num != 0) 
		{
			hour = num;
		} 
		else if (getDay() == 0 && num != 0) 
		{
			day = num;
		} 
		else if (getMonth() == 0 && num != 0) 
		{
			month = num;
		}

		return isValidDate(getMonth(), getDay()) && isValidTime(getHour(), getMin());
	}

	public int getMonth() 
	{
		return month;
	}

	public int getDay() 
	{
		return day;
	}

	public int getHour() 
	{
		return hour;
	}

	public int getMin() 
	{
		return minute;
	}

	public boolean isValidDate(int month, int day) 			//Checks to make sure the entered date falls within the dating conventions
	{
		if (month < 1 || month > 12) 
		{
			return false;
		}
		if (month == 2) 					//Special case for February,a s it only has 28 days
		{
			return day >= 1 && day <= 28;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) 
		{
			return day >= 1 && day <= 30;
		}
		return day >= 1 && day <= 31;
	}

	public boolean isValidTime(int hour, int minute) 			//Checks to make sure the entered time falls within a 12-hour system, and within 59 minutes
	{
		return hour >= 1 && hour <= 12 && minute >= 0 && minute <= 59;
	}
}


