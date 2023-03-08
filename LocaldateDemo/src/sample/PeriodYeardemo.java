package sample;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodYeardemo {
 
	public static void main(String[] args) {
	 
	 LocalDate birthDay=LocalDate.of(2000, Month.JANUARY, 03);
	 LocalDate todayDate=LocalDate.now();
	 System.out.println(birthDay);
	 System.out.println(birthDay.plusYears(23));
	 System.out.println(todayDate);
	 
	 Period p=Period.between(birthDay, todayDate);
	 System.out.println(p.getDays());
	 System.out.println(p.getMonths());
	 System.out.println(p.getYears());
	 System.out.println(p.getChronology());
	 
	 LocalDate deathDate=LocalDate.of(2001+70, 01, 03);
	 Period p1=Period.between(birthDay, deathDate);
	 System.out.println(p1);
	 System.out.println(p1.getYears());
	 int days=p1.getYears()*365+p1.getMonths()*30+p1.getDays();
	 System.out.printf("U have %d days Left in your Life",days);
	}
}
