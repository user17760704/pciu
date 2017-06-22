package calculatorClass;

import java.util.ArrayList;

import calculatorClass.operations.UserInput;

public class CalculatorClass {

	public static void main(String[] args) 
	{
		ArrayList<String> listOfNumbers = UserInput.getInput(8);
		UserInput.performOperation(listOfNumbers);
	}

}
