package methods;

public class Methods
{
	
	static String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
			"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	
	public static void main(String[] args)
	{
		System.out.println("For loop: " + forLoop());
	}
	
	public static StringBuilder forLoop()
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < months.length; i++)
		{
			if (i < (months.length - 1))
			{
				sb.append(months[i] + ", ");
			}
			else
			{
				sb.append(months[i] + "." );
			}	
		}
		
		return sb;
	}
}
