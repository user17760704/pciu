package olive.operations;

import java.util.List;

import olive.model.OliveModel;

public class OlivePress
{
	public double getOil(List<OliveModel> oliveModels)
	{
		double yeild = 0; 
		for (OliveModel oliveModel : oliveModels)
		{
			yeild += oliveModel.getYeild();
		}
		
		return yeild;
	}
}
