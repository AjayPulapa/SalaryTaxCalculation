package sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocaldateTimeDemo1 {
 
	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		int dd=dt.getDayOfMonth();
		int mm=dt.getMonthValue();
		int hh=dt.getHour();
		int ms=dt.getMinute();
//		System.out.println(dd+" "+mm+" "+hh+" "+ms);
		
		LocalDateTime ldt=LocalDateTime.of(2000,Month.JANUARY,03,6,24);
		System.out.println(ldt);
		//After 6 Months
		System.out.println("After Six Days"+ldt.plusDays(6));
		System.out.println("After 23 Years"+ldt.plusYears(23));
		//Before 6 Months
		System.out.println("Before Six Days"+ldt.minusDays(6));
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
	}
	
}
