package calculatorClass.operations;

import java.util.ArrayList;

public class MathHelper 
{
	public static void addition(ArrayList<String> listOfNumbers)
	{
		double d = 0;
		
		for (int i = 0; i < listOfNumbers.size(); i++)
		{
			d += Double.parseDouble(listOfNumbers.get(i));
		}
		
		System.out.println("Sum: " + d);
	}
	
	public static void subtraction(ArrayList<String> listOfNumbers)
	{
		double d = 0;
		
		for (int i = 0; i < listOfNumbers.size(); i++)
		{
			if(i == 0)
			{
				d = Double.parseDouble(listOfNumbers.get(i));
				System.out.println("First number is: " + d);
			}
			else
			{
				d -= Double.parseDouble(listOfNumbers.get(i));
			}
		}
		
		System.out.println("Subtraction: " + d);
	}
	
	public static void multiplication(ArrayList<String> listOfNumbers)
	{
		double d = 0;
		
		for (int i = 0; i < listOfNumbers.size(); i++)
		{
			if(i == 0)
			{
				d = Double.parseDouble(listOfNumbers.get(i));
				System.out.println("First number is: " + d);
			}
			else
			{
				d *= Double.parseDouble(listOfNumbers.get(i));
			}
		}
		
		System.out.println("Multiplication: " + d);
	}
	
	public static void division(ArrayList<String> listOfNumbers)
	{
		double d = 0;
		
		for (int i = 0; i < listOfNumbers.size(); i++)
		{
			if(i == 0)
			{
				d = Double.parseDouble(listOfNumbers.get(i));
				System.out.println("First number is: " + d);
			}
			else
			{
				d /= Double.parseDouble(listOfNumbers.get(i));
			}
		}
		
		System.out.println("Division: " + d);
	}
}
