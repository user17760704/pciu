package methods;

import java.util.Scanner;

public class MethodOverloading
{

	public static void main(String[] args)
	{
		String s1 = getInput("Enter value 1: ");
		String s2 = getInput("Enter value 2: ");

		addValues(s1, s2);
	}
	
	static String getInput(String prompt)
	{
		Scanner input = new Scanner(System.in);
		System.out.println(prompt);
		String inputStr = input.nextLine();
		
		return inputStr;
	}
	
	static void addValues(String s1, String s2)
	{
		double a = Double.parseDouble(s1) + Double.parseDouble(s2);
		
		System.out.println(s1 + " + " + s2 + " = " + a);
	}

}
