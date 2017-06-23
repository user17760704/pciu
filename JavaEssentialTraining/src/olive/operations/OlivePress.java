package olive.operations;

import java.util.List;

import olive.model.Olive;

public class OlivePress
{
	public double getOil(List<Olive> olives)
	{
		double yeild = 0; 
		for (Olive olive : olives)
		{
			yeild += olive.getYeild();
		}
		
		return yeild;
	}
}
