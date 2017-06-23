package olive.operations;

import java.util.List;

import olive.model.enums.OliveModelEnums;

public class OlivePressEnums
{
	public double getOil(List<OliveModelEnums> olives)
	{
		double yeild = 0; 
		for (OliveModelEnums olive : olives)
		{
			yeild += olive.getYeild();
		}
		
		return yeild;
	}
}
