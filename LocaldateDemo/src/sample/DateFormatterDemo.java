package sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterDemo {
 
	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(dtf);
		String format=dt.format(dtf);
		System.out.println(format);
		
		DateTimeFormatter dtf1=DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(dt.format(dtf1));
		
		LocalDate parsedDate=LocalDate.parse(format,dtf);
		System.out.println(parsedDate);
		
		
		
		LocalDate date=LocalDate.of(2021, 01, 03);
		LocalTime time=LocalTime.of(03, 40,12);
		LocalDateTime dt1=LocalDateTime.of(date, time);
		System.out.println(dt1);
	}
}
