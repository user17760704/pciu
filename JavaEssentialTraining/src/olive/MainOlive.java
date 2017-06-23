package olive;

import java.util.ArrayList;
import java.util.List;

import olive.model.Olive;
import olive.operations.OlivePress;

public class MainOlive
{

	public static void main(String[] args)
	{
		
		List<Olive> olives = new ArrayList<>();
		
//		Olive o1 = new Olive("Kalamata", 0x2E0854, 3);
//		Olive o2 = new Olive("Kalamata", 0x2E0854, 4);
//		Olive o3 = new Olive("Kalamata", 0x2E0854, 5);
		
		olives.add(new Olive("Kalamata", 0x2E0854, 3));
		olives.add(new Olive("Kalamata", 0x2E0854, 4));
		olives.add(new Olive("Kalamata", 0x2E0854, 5));
		
		for (Olive olive : olives)
		{
			System.out.println(olive.getTypeOfOlive());
			System.out.println(olive.getColor());
			System.out.println(olive.getYeild());
		}
		
		OlivePress op = new OlivePress();
		
		double yeild = op.getOil(olives);
		System.out.println("The yeild is: " + yeild);
		
	}

}
