package sample;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class CalendarDemo 
{
	public static void main(String[] args) 
	{
		//String to a Date
		String strDate = "04-01-2015";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try
		{
			Date date1 = sdf.parse(strDate);
			System.out.println("String to Date : " + date1);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		//Date to String
		Date date1 = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy EEE hh:mm:ss S");
		String dateString = sdf2.format(date1);
		System.out.println("Date to String : " + dateString);
		
		
		//Date to Calendar
		Date date2 = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date2);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		//Calendar to Date
		Calendar cal1 = new GregorianCalendar(2015, 00, 8);
		Date date3 = cal1.getTime();
		System.out.println(date3);
		
		
		
	}
}