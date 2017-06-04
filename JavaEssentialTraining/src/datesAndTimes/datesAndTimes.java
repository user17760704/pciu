package datesAndTimes;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;

public class datesAndTimes
{
	public static void main(String[] args)
	{
		Date d = new Date();
		
		System.out.println(d);
		
		Calendar cal = Calendar.getInstance();
		
		GregorianCalendar gcal = new GregorianCalendar(2009,1,28);
		System.out.println(gcal.after(cal));
		
		gcal.add(GregorianCalendar.DATE, 1);
		
		Date d2 = gcal.getTime();
		
		System.out.println(d2);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println(df.format(d2));
		
//		This is new API
		LocalDateTime ldt = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		System.out.println(ldt.format(formatter));
	}

}
