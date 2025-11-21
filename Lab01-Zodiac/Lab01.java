
/*
 * Written by Ryan Cook - idk why my name is wrong :(
 */

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//System.out.println("Hello world?"); - Just testing to see if its working
		
		//boolean validMonth; - variable for an earlier plan i had
		//boolean validDay; - variable for an earlier plan i had
		System.out.println("What is your zodiac? Enter your birthday -- Month followed by Day as numbers");
		int month = keyboard.nextInt();
		int day = keyboard.nextInt();
		
		
		//System.out.println(month); - testing to see if the scanner worked
		
		
		
		//code below used to determine if a month is valid. there's definitely an easier way to do this, but for now it stays
		
			
		if(month == 1)  
		{
			System.out.println("your month is January");
		}
		else if(month == 2) {
			System.out.println("your month is February");
		}
		else if(month == 3) {
			System.out.println("your month is March");
		}
		else if(month == 4) {
			System.out.println("your month is April");
		}
		else if(month == 5) {
			System.out.println("your month is May");
		}
		else if(month == 6) {
			System.out.println("your month is June");
		}
		else if(month == 7) {
			System.out.println("your month is July");
		}
		else if(month == 8) {
			System.out.println("your month is August");
		}
		else if(month == 9) {
			System.out.println("your month is September");
		}
		else if(month == 10) {
			System.out.println("your month is October");
		}
		else if(month == 11) {
			System.out.println("your month is November");
		}
		else if(month == 12) {
			System.out.println("your month is December");
		}
		else {
			System.out.println("invalid month bruh");
			System.exit(0); //Used a system exit so it wouldn't tell the day too
		} 
		
		
		//same thing as the months. this is used to determine if  a month is valid. probably a better way to do this, but we'll sit on this for now
		

		
		if(month == 1 && day >=1 && day <= 31) 
		{
			System.out.println("Your day is " +day);
		}
		else if(month == 2 && day >=1 && day <= 29) 
		{
			System.out.println("Your day is " +day);
		}
		else if(month == 3 && day >=1 && day <= 31) 
		{
			System.out.println("Your day is " +day);
		}
		else if(month == 4 && day >=1 && day <= 30) 
		{
			System.out.println("Your day is " +day);
		}
		else if(month == 5 && day >=1 && day <= 31) 
		{
			System.out.println("Your day is " +day);
		}
		else if(month == 6 && day >=1 && day <= 30) 
		{
			System.out.println("Your day is " +day);
		}
		else if(month == 7 && day >=1 && day <= 31) 
		{
			System.out.println("Your day is " +day);
		}
		else if(month == 8 && day >=1 && day <= 31) 
		{
			System.out.println("Your day is " +day);
		}
		else if(month == 9 && day >=1 && day <= 30) 
		{
			System.out.println("Your day is " +day);
		}
		else if(month == 10 && day >=1 && day <= 31) 
		{
			System.out.println("Your day is " +day);
		}
		else if(month == 11 && day >=1 && day <= 30) 
		{
			System.out.println("Your day is " +day);
		}
		else if(month == 12 && day >=1 && day <= 31) 
		{
			System.out.println("Your day is " +day);
		}
		else {
			System.out.println("invalid day bruh");
		}
		
		//now starts the actual important code. added the harry potter reference for laughs
		
		if((month == 3 && (day >= 21 && day <= 31)) || (month == 4 ) && (day >= 1 && day <= 19)) {
			System.out.println("youre an ARIES, Harry!");
		}
		else if((month == 4 && (day >= 20 && day <= 30)) || (month == 5 ) && (day >= 1 && day <= 20)) {
			System.out.println("youre a TAURUS, Harry!");
		}
		else if((month == 5 && (day >= 21 && day <= 31)) || (month == 6 ) && (day >= 1 && day <= 20)) {
			System.out.println("youre a GEMINI, Harry!");
		}
		else if((month == 6 && (day >= 21 && day <= 30)) || (month == 7 ) && (day >= 1 && day <= 22)) {
			System.out.println("youre a CANCER, Harry!");
		}
		else if((month == 7 && (day >= 23 && day <= 31)) || (month == 8 ) && (day >= 1 && day <= 22)) {
			System.out.println("youre a LEO, Harry!");
		}
		else if((month == 8 && (day >= 23 && day <= 31)) || (month == 9 ) && (day >= 1 && day <= 22)) {
			System.out.println("youre a VIRGO, Harry!");
		}
		else if((month == 9 && (day >= 23 && day <= 30)) || (month == 10 ) && (day >= 1 && day <= 22)) {
			System.out.println("youre a LIBRA, Harry!");
		}
		else if((month == 10 && (day >= 23 && day <= 31)) || (month == 11 ) && (day >= 1 && day <= 21)) {
			System.out.println("youre a SCORPIO, Harry!");
		}
		else if((month == 11 && (day >= 22 && day <= 30)) || (month == 12 ) && (day >= 1 && day <= 21)) {
			System.out.println("youre a SAGITTARIUS, Harry!");
		}
		else if((month == 12 && (day >= 22 && day <= 31)) || (month == 1 ) && (day >= 1 && day <= 19)) {
			System.out.println("youre a CAPRICORN, Harry!");
		}
		else if((month == 1 && (day >= 20 && day <= 31)) || (month == 2 ) && (day >= 1 && day <= 18)) {
			System.out.println("youre an AQUARIUS, Harry!");
		}
		else if((month == 2 && (day >= 19 && day <= 29)) || (month == 3 ) && (day >= 1 && day <= 20)) {
			System.out.println("youre a PISCES, Harry!");
		}
		
		
	}
		
		
		
	}


