package olive.operations;

import java.util.ArrayList;
import java.util.List;

import olive.model.OliveModel;
import olive.model.enums.OliveModelEnums;

public class OlivePress
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
		
//		double yeild = 0; 
//		for (OliveModel oliveModel : oliveModels)
//		{
//			yeild += oliveModel.getYeild();
//		}
//		
		return yeild;
	}
}
