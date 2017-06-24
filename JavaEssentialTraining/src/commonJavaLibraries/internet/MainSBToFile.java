package commonJavaLibraries.internet;

import java.net.MalformedURLException;

public class MainSBToFile
{
	private static final String FLOWERS_FEED = "http://services.hanselandpetal.com/feeds/flowers.xml";

	public static void main(String[] args) throws MalformedURLException
	{
		ReadDataIntoStringBuilder readData = new ReadDataIntoStringBuilder();
		
		StringBuilder sb = readData.readData(FLOWERS_FEED);
		
		String filePath = "./src/commonJavaLibraries/files/flowersFeed.xml";
		
		WriteStringBuilderToFile.writeToFile(filePath, sb);

	}

}
