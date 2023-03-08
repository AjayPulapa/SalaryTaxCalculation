package sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo1 {
   public static void main(String[] args) {
	   System.out.println("Date");
	LocalDate d=LocalDate.now();
	int dd=d.getDayOfMonth();
	int mmm=d.getMonthValue();
	int yyyy=d.getYear();
	System.out.println(d);
	System.out.println(dd);
	System.out.println(mmm);
	System.out.println(yyyy);
	System.out.println(dd+"-"+mmm+"-"+yyyy);
	System.out.printf("%d-%d-%d", dd,mmm,yyyy);
	
	System.out.println("Time\n");
	LocalTime t=LocalTime.now();
	int hh=t.getHour();
	int mm=t.getMinute();
	int ss=t.getSecond();
	int ns=t.getNano();
	Class<? extends LocalTime> a=t.getClass();
	System.out.println(t);
	System.out.println(hh);
	System.out.println(mm);
	System.out.println(ss);
	System.out.println(ns);
	System.out.println(a);
	
}
}
