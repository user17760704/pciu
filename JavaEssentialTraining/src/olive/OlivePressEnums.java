package olive;

import java.util.List;

import olive.model.OliveWithEnums;

public class OlivePressEnums
{
	public double getOil(List<OliveWithEnums> olives)
	{
		double yeild = 0; 
		for (OliveWithEnums olive : olives)
		{
			yeild += olive.getYeild();
		}
		
		return yeild;
	}
}
