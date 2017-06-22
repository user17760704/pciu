package calculatorClass.operations;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput 
{
	public static Scanner input = new Scanner(System.in);
	
	public static ArrayList<String> getInput(int n)
	{
		ArrayList<String> al = new ArrayList<String>();
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter value " + (i + 1) + ": ");
			String s = input.nextLine();
			try
			{
				Double.parseDouble(s);
				al.add(s);
			}
			catch(Exception e)
			{
				System.out.println("The value is not a valid number.");
				e.printStackTrace();
			}
			
		}
		
		return al;
	}
	
	public static void performOperation(ArrayList<String> listOfNumbers)
	{
		System.out.println("Choose an operation (+,-,*,/)");
		String operation = input.next();
		
		switch (operation)
		{
			case "+":
				MathHelper.addition(listOfNumbers);
				break;
			case "-":
				MathHelper.subtraction(listOfNumbers);
				break;
			case "*":
				MathHelper.multiplication(listOfNumbers);
				break;
			case "/":
				MathHelper.division(listOfNumbers);
				break;
			default:
				System.out.println("Not a valid choice.");
		}
		
		input.close();
	}
}
