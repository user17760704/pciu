package olive.operations;

import java.util.List;

import interfaces.Press;
import olive.model.OliveModel;
import olive.model.enums.OliveModelEnums;

public class OlivePress implements Press
{
	public double getOil(List<?> oliveModels)
	{
		Object object = oliveModels.get(0);
		
		double yeild = 0;
		
		if(object instanceof OliveModelEnums)
		{
			List<OliveModelEnums> olives = (List<OliveModelEnums>) oliveModels;
						
			for(OliveModelEnums olive: olives)
			{
				yeild += olive.getYeild();
			}
		}
		
		else if (object instanceof OliveModel)
		{
			List<OliveModel> olives = (List<OliveModel>) oliveModels;
			
			for(OliveModel olive: olives)
			{
				yeild += olive.getYeild();
			}
		}
		
		return yeild;
	}

	@Override
	public void setOil(int oil) 
	{
		
	}
}
