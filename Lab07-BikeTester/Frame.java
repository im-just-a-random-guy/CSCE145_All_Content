/*
 * Written by Ryan Cook
 */

public class Frame 
{
													//Variables
	private double size;
	private String type;
	
	public Frame() 									//Default constructor
	{
		setSize(18.5);
		setType("Diamond");
	}
	
	public Frame(double size, String type)			//Parameterized constructor
	{
		setSize(size);
		setType(type);
	}
	
		//Getters and setters
	
	public double getSize() 
	{
		return size;
	}

	public void setSize(double size) 
	{
		if(size >= 18.5 && size <= 60)
		{
			this.size = size;
		}
		else 
		{
			this.size = 18.5;
		}
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		if(type.equals("Diamond") || type.equals("Step-Through") || type.equals("Truss") || type.equals("Penny-Farthing"))
		{
			this.type = type;
		}
		else 
		{
			this.type = "Diamond";
		}
	}
	
	
	// Equals Method
    public boolean equals(Frame other) 				//Used 'other' to create another instance to compare the values to
    {
        if (other == null) 
        {
        	return false;
        }
        return this.size == other.size && this.type.equalsIgnoreCase(other.type);
    }

    // toString Method
    public String toString() 
    {
        return "[Frame] Size: " + size + " Type: " + type;
    }
	
	
	
}
