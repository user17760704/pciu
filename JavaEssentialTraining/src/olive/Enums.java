package olive;

import java.util.ArrayList;
import java.util.List;

import olive.model.OliveWithEnums;
import olive.model.OliveNames;

public class Enums
{
	public static void main(String[] args)
	{
		List<OliveWithEnums> olives = new ArrayList<>();
		
		olives.add(new OliveWithEnums(OliveNames.KALAMATA, 0x2E0854, 3));
		olives.add(new OliveWithEnums(OliveNames.LIGURIAN, 0x2E0854, 4));
		olives.add(new OliveWithEnums(OliveNames.UNKNOWN, 0x2E0854, 5));
		
		for (OliveWithEnums olive : olives)
		{
			System.out.println(olive.getTypeOfOlive());
			System.out.println(olive.getColor());
			System.out.println(olive.getYeild());
		}
		
		OlivePressEnums ope = new OlivePressEnums();
		
		double yeild = ope.getOil(olives);
		System.out.println("The yeild is: " + yeild);
		
		OliveNames name = OliveNames.KALAMATA;
		System.out.println(name);
	}
}
