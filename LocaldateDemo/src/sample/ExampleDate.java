package sample;

import java.time.ZoneId;

public class ExampleDate {
  public static void main(String[] args) {
	
	  for(String zone:ZoneId.getAvailableZoneIds())
	  {
		  if(zone.equals("Asia/Tokyo"))
		  {
		  System.out.println(zone);
	  }
//		  System.out.println(zone);
	  }
}
}
