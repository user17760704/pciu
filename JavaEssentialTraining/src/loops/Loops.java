package loops;

public class Loops
{

	public static void main(String[] args)
	{
		String[] months = {"1", "2", "3", "4", "5", "6", 
							"7", "8", "9", "10", "11", "12"};
		
//		Incrementing For loop
		
		for(int i = 0; i < months.length; i++)
		{
			if(i < (months.length-1))
			{
				System.out.print(months[i] + ", ");
			}
			else
			{
				System.out.println(months[i] + ".");
			}
		}
		
//		Decrementing for loop
		for(int i = (months.length-1); i >= 0; i--)
		{
			if(i > 0)
			{
				System.out.print(months[i] + ", ");
			}
			else
			{
				System.out.println(months[i] + ".");
			}
		}		
		
//		For each loop
		for (String month : months)
		{
			System.out.print(month + ", ");
		}

	}

}
