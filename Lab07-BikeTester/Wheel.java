/*
 * Written by Ryan Cook
 */

public class Wheel 
{
	//Variables
	private double diameter;
	private double width;

	public Wheel()										//Default constructor
	{
		setDiameter(16.0);
		setWidth(1.0);
	}

	public Wheel(double diameter, double width)			//Parameterized Constructor
	{
		setDiameter(diameter);
		setWidth(width);
	}


	//Getters and setters
	public double getDiameter() 
	{
		return diameter;
	}

	public void setDiameter(double diameter) 
	{
		if(diameter >= 16 && diameter <= 55)
		{
			this.diameter = diameter;
		}
		else 
		{
			this.diameter = 16;
		}
	}

	public double getWidth() 
	{
		return width;
	}

	public void setWidth(double width) 
	{
		if(width >= 1.0 && width <= 2.5)
		{
			this.width = width;
		}
		else {
			this.width = 1.0;
		}
	}

	//Equals method
	public boolean equals(Wheel other) 					//Used 'other' to create another instance to compare the values to
	{		
		if (other == null)
		{
			return false;
		}
		return this.diameter == other.diameter && this.width == other.width;
	}

	//toString method
	public String toString() 
	{
		return "[Wheel] Diameter " + diameter + " Width " + width;
	}



}
