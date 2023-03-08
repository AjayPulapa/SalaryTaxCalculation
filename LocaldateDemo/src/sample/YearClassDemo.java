package sample;

import java.time.Year;
import java.util.Scanner;

public class YearClassDemo {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		int year1=sc.nextInt();
		Year year=Year.of(year1);
		System.out.println(year.isLeap());
		
	}
}
