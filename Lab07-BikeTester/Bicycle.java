/*
 * Written by Ryan Cook
 */

public class Bicycle 
{
												//Variables
	private String make;
	private Wheel frontWheel = new Wheel();
	private Wheel backWheel = new Wheel();
	private Frame frame = new Frame();

	public Bicycle()						//Default constructor
	{
		setMake("none");
		setFrontWheel(frontWheel);
		setBackWheel(backWheel);
		setFrame(frame);
	}
	

	public Bicycle(String make, Wheel frontWheel, Wheel backWheel, Frame frame)		//Parameterized Constructor
	{
		setMake(make);
		setFrontWheel(frontWheel);
		setBackWheel(backWheel);
		setFrame(frame);
	}
	

	//getters and setters
	
	public String getMake() 
	{
		return make;
	}

	public void setMake(String make) 	//TODO: fix this shi 
	{
		if(make != null)
		{
			this.make = make;
		}
		else 
		{
			this.make = "none";
		}
	}
	

	public Wheel getFrontWheel() 
	{
		return frontWheel;
	}

	public void setFrontWheel(Wheel frontWheel) 
	{
		this.frontWheel = frontWheel;
	}
	

	public Wheel getBackWheel() 
	{
		return backWheel;
	}

	public void setBackWheel(Wheel backWheel) 
	{
		this.backWheel = backWheel;
	}
	

	public Frame getFrame() 
	{
		return frame;
	}

	public void setFrame(Frame frame) 
	{
		this.frame = frame;
	}
	
	

	// Equals Method
	public boolean equals(Bicycle other) 				//Used 'other' to create another instance to compare the values to
	{
		if (other == null) 
		{
			return false;
		}
		return this.make.equalsIgnoreCase(other.make)
				&& this.frontWheel.equals(other.frontWheel)
				&& this.backWheel.equals(other.backWheel)
				&& this.frame.equals(other.frame);
	}
	

	// toString method
	public String toString() 
	{
		return "[Bicycle] Make: " + make + 
				" Front Wheel " + frontWheel.toString() + 
				" Back Wheel " + backWheel.toString() + 
				" Frame: " + frame.toString();
	}
}
