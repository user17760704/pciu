package conditionalStatements;

public class Loops
{

	public static void main(String[] args)
	{
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
							"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
//		Example of a for loop
		for (int i = 0; i < months.length; i++)
		{
			if (i < (months.length - 1))
			{
				System.out.print(months[i] + ", ");
			}
			else
			{
				System.out.println(months[i] + "." );
			}	
		}
		
		for (String month : months)
		{
			System.out.print(month + ", ");
		}

	}

}
