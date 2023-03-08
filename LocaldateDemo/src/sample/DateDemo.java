package sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
public static void main(String[] args) {
	Date date=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	System.out.println(sdf.format(date));
	System.out.println(date);
	

 
}
}
