package olive;

import java.util.ArrayList;
import java.util.List;

import olive.model.enums.OliveColorEnums;
import olive.model.enums.OliveModelEnums;
import olive.model.enums.OliveNamesEnums;
import olive.operations.OlivePress;

public class OliveMainExtendingClasses
{

	public static void main(String[] args)
	{
		List<OliveModelEnums> olives = new ArrayList<>();
		
		olives.add(new OliveModelEnums (OliveNamesEnums.KALAMATA, OliveColorEnums.BLACK, 3));
		olives.add(new OliveModelEnums (OliveNamesEnums.LIGURIAN, OliveColorEnums.GREEN, 4));
		olives.add(new OliveModelEnums (OliveNamesEnums.UNKNOWN, OliveColorEnums.PURPLE, 5));
		
		OlivePress op = new OlivePress();
		
		double yield = op.getOil(olives);
		
		System.out.println("Yield: " + yield);
		
		
	}


}
