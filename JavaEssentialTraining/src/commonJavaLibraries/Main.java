package commonJavaLibraries;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main
{

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
//		Java uses forward slash is used as a directory separator on all operating system
//		This is an example of hard coded paths
//		String sourceFile = "C:/git/pciu/JavaEssentialTraining/src/commonJavaLibraries/files/loremipsum.txt";
//		String targetFile = "C:/git/pciu/JavaEssentialTraining/src/commonJavaLibraries/files/target.txt";
		
//		This is an example of relative paths
//		The working directory for the java application is the root of the entire project, which in this case is:
//		C:\git\pciu\JavaEssentialTraining
		String sourceFile = "./src/commonJavaLibraries/files/loremipsum.txt";
		String targetFile = "./src/commonJavaLibraries/files/target.txt";
		
		File source = new File(sourceFile);
		File destination = new File(targetFile);
		
		try (FileReader fr = new FileReader(source); 
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(destination))
		{
			System.out.println("Source file found in location: " + source.getAbsolutePath());
			String line = br.readLine();
			while (line != null)
			{
				fw.write(line + "\n");
				line = br.readLine();
			}
			System.out.println("Destination of the file is: " + destination.getAbsolutePath());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
