package olive;

import java.util.ArrayList;
import java.util.List;

import olive.model.enums.OliveEnums;
import olive.model.enums.OliveWithEnums;

public class Enums
{
	public static void main(String[] args)
	{
		List<OliveWithEnums> olives = new ArrayList<>();
		
		olives.add(new OliveWithEnums(OliveEnums.KALAMATA, 0x2E0854, 3));
		olives.add(new OliveWithEnums(OliveEnums.LIGURIAN, 0x2E0854, 4));
		olives.add(new OliveWithEnums(OliveEnums.UNKNOWN, 0x2E0854, 5));
		
		for (OliveWithEnums olive : olives)
		{
			System.out.println(olive.getTypeOfOlive());
			System.out.println(olive.getColor());
			System.out.println(olive.getYeild());
		}
		
		OlivePressEnums ope = new OlivePressEnums();
		
		double yeild = ope.getOil(olives);
		System.out.println("The yeild is: " + yeild);
		
		OliveEnums name = OliveEnums.KALAMATA;
		System.out.println(name);
	}
}
