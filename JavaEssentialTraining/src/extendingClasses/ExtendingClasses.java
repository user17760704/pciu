package extendingClasses;

import java.util.ArrayList;
import java.util.List;

import olive.model.enums.*;


public class ExtendingClasses
{

	public static void main(String[] args)
	{
		List<OliveModelEnums> olives = new ArrayList<>();
		
		olives.add(new OliveModelEnums (OliveNamesEnums.KALAMATA, OliveColorEnums.BLACK, 3));
		olives.add(new OliveModelEnums (OliveNamesEnums.LIGURIAN, OliveColorEnums.GREEN, 4));
		olives.add(new OliveModelEnums (OliveNamesEnums.UNKNOWN, OliveColorEnums.PURPLE, 5));
		
		

	}

}
