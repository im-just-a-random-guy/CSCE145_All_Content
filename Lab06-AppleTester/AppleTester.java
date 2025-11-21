
/*
 * Written by RYan Cook
 */

public class AppleTester {
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the apple tester");
		
		
//		String[] type = {"Red Delicious", "Golden Delicious", "Gala", "Granny Smith"};				Used for an idea that fell through
//		double weight;
//		double price;
		
		
		//Default apple values ("Gala", 0.0, 0.0)
		Apple a = new Apple();
		
		System.out.println(a);
		
		
		//Parameterized and valid apple values
		Apple b = new Apple("Granny Smith", 0.75, 0.99);
		
		System.out.println(b);
		
		
		//Parameterized and invalid apple values
		Apple c = new Apple("iPad", 2.5, -200);
		
		System.out.println(c);		//Because these values don't meet the valid options, they are changed to the default values
		
		
		System.out.println();
		
		
		System.out.println("Checking if the first and last apple are the same...");
		
		System.out.println(Apple.AppleCheck(a, c));					//Used this to compare the first and last apple. 
																	//There's most definitely a better way to do this, but it works
	}
}
