
/*
 * Written by Ryan Cook
 */

public class Apple {
	
	private String type;
	private double weight;				//Initialized private variables
	private double price;
	
//	private String defaultType = "Gala";
//	private double defaultWeight = 0.0;					The start of an idea that fell through
//	private double defaultPrice = 0.0;
	
	public Apple() 			//Default Apple
	{
		setType("Gala");
		setWeight(0.0);
		setPrice(0.0);
	}
	
	public Apple(String type, double weight, double price) 		//Parameterized Apple
	{

		setType(type);
		setWeight(weight);
		setPrice(price);
		
	}
	
	
	//Getters and Setters
	
	public String getType() {
		return type;
	}

	public void setType(String type) 		//Used if-statements in the setters to validate if an entry is valid. if not, it reverts to the default value
	{
		if(type.equals("Red Delicious") || type.equals("Golden Delicious") || type.equals("Gala") || type.equals("Granny Smith")) 
		{
			this.type = type;
		}
		else 
		{
			this.type = "Gala";
		}
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) 
	{
		if(weight >= 0.0 && weight <= 2.0) 
		{
			this.weight = weight;
		}
		else 
		{
			this.weight = 0.0;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) 
	{
		if(price >= 0.0) 
		{
			this.price = price;
		}
		else 
		{
			this.price = 0.0;
		}
	}
	
	public String toString() 			//Prints each of the values "extracted" by the getters (i need a thesaurus for my terms)
	{
		return "Type: " + getType() + "   " + "Weight: " + getWeight() + "   " + "Price: " + getPrice();
	}
	
	public static boolean AppleCheck(Apple a, Apple c) 			//Compares two apples in the AppleTester class
	{
		if ((a.getType() == c.getType()) &&
			(a.getWeight() == c.getWeight()) &&
			(a.getPrice() == c.getPrice())) 
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
