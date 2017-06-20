package loopThroughCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LoopThroughCollections
{
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		List<String> list = putElementsInList(3);
		iterateOverArrayList(list);
		
		Map<String, String> map = putElementsInMap(3);
		iterateOverHashMap(map);
		
	}
	
	public static void iterateOverArrayList(List<String> list)
	{
		System.out.println("toString()");
		System.out.println(list);
		
		System.out.println("Iterator");
		Iterator<String> iterator = list.iterator(); 
		while(iterator.hasNext())
		{
			System.out.print(iterator.next() + ", ");
		}
		
		System.out.println("\nFor each");
		for(String value : list)
		{
			System.out.print(value + ", ");
		}
		
		System.out.println("Java 8 Method Reference");
		list.forEach(System.out :: println);
		
	}
	
	public static List<String> putElementsInList(int numberOfElements)
	{
		List<String> listOfStrings = new ArrayList<String>();
		
		for(int i = 0; i < numberOfElements; i++)
		{
			System.out.print("Enter an element: ");
			listOfStrings.add(input.nextLine());
		}
		
		return listOfStrings;
	}
	
	public static void iterateOverHashMap(Map<String, String> map)
	{
		System.out.println("toString()");
		System.out.println(map);
	}
	
	public static Map<String, String> putElementsInMap(int numberOfElementsInMap)
	{
		Map<String, String> mapOfStrings = new HashMap<String, String>();
		
		for (int i = 0; i < numberOfElementsInMap; i++)
		{
			System.out.print("Enter key: ");
			String key = input.nextLine();
			System.out.println("Enter value: ");
			String value = input.nextLine();
			mapOfStrings.put(key, value);
		}
		
		return mapOfStrings;
	}
}