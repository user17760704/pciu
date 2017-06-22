package olive;

import java.util.List;

import olive.model.OliveModelWithEnums;

public class OlivePressEnums
{
	public double getOil(List<OliveModelWithEnums> olives)
	{
		double yeild = 0; 
		for (OliveModelWithEnums olive : olives)
		{
			yeild += olive.getYeild();
		}
		
		return yeild;
	}
}
