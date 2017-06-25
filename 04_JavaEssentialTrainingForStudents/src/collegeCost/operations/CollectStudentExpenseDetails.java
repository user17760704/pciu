package collegeCost.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import collegeCost.model.LivingExpenses;
import collegeCost.model.OnCampus;
import collegeCost.model.TuitionExpenses;

public class CollectStudentExpenseDetails
{
	public static Scanner input = new Scanner(System.in);
	
	public LivingExpenses setLivingExpenseDetails()
	{
//		String doesTheStudentLiveInDorm = "";
		LivingExpenses lv = null;
		
		boolean onCampus = OnCampus.isOnCampus();
		
		if(onCampus)
		{
			System.out.println("Enter the dorm fees: ");
			double dormFees = input.nextDouble();
			
			System.out.println("Enter cost of meal plan: ");
			double costOfMealPlan = input.nextDouble();
			
			System.out.println("Enter duration of stay (months): ");
			int durationOfStay = input.nextInt();
			
			System.out.println("Living expenses per month: ");
			double otherExpenses = input.nextDouble();
			
			lv = new LivingExpenses(dormFees, costOfMealPlan, durationOfStay, otherExpenses);
			
		}
		
		else
		{
			System.out.println("Enter the rent per month: ");
			double rent = input.nextDouble();
			
			System.out.println("Enter living expenses per month: ");
			double otherExpenses = input.nextDouble();
			
			lv = new LivingExpenses(rent, otherExpenses);
		}
		
		
//		while(!doesTheStudentLiveInDorm.equalsIgnoreCase("y") && !doesTheStudentLiveInDorm.equalsIgnoreCase("n"))
//		{
//			System.out.println("Does the student in a dorm (y/n)?");
//			doesTheStudentLiveInDorm = input.nextLine();
//		}
//		
//		if (doesTheStudentLiveInDorm.equalsIgnoreCase("y"))
//		{
//			System.out.println("Enter the dorm fees: ");
//			double dormFees = input.nextDouble();
//			
//			System.out.println("Enter cost of meal plan: ");
//			double costOfMealPlan = input.nextDouble();
//			
//			System.out.println("Enter duration of stay (months): ");
//			int durationOfStay = input.nextInt();
//			
//			System.out.println("Living expenses per month: ");
//			double otherExpenses = input.nextDouble();
//			
//			lv = new LivingExpenses(dormFees, costOfMealPlan, durationOfStay, otherExpenses);
//		}
//		
//		else if (doesTheStudentLiveInDorm.equalsIgnoreCase("n"))
//		{
//			System.out.println("Enter the rent per month: ");
//			double rent = input.nextDouble();
//			
//			System.out.println("Enter living expenses per month: ");
//			double otherExpenses = input.nextDouble();
//			
//			lv = new LivingExpenses(rent, otherExpenses);
//		}
		
		return lv;
	}
	
	public TuitionExpenses setTuitionExpenseDetails()
	{
		
		TuitionExpenses te = null;
		
		System.out.println("Enter the number of credit hours per year: ");
		int creditHours = input.nextInt();
		
		System.out.println("Enter the cost of credit hour: ");
		double costOfCreditHour = input.nextDouble();
		
		System.out.println("Enter the cost of supplies per year: ");
		double costOfSuppliesPerYear = input.nextDouble();
		
		te = new TuitionExpenses(creditHours, costOfCreditHour, costOfSuppliesPerYear);
		
		return te;
	}
	
}
