package Java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class DateandTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date =LocalDate.of(1998, 11, 17);
		System.out.println(date);
		int year = date.getYear();
		System.out.println(year);
		Month day = date.getMonth();
		int day1= date.getDayOfMonth();
		System.out.println(day1);
		System.out.println(day);
		DayOfWeek dov = date.getDayOfWeek();
		System.out.println(dov);
		boolean leap= date.isLeapYear();
		System.out.println(leap);
		
		int year1= date.get(ChronoField.YEAR);
		System.out.println(year1);
		
		int month1= date.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(month1);
		
		int day2=date.get(ChronoField.DAY_OF_MONTH);
		System.out.println(day2);
		
		int day3= date.get(ChronoField.DAY_OF_WEEK);
		System.out.println(day3);
		
		
		int day4= date.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR);
		System.out.println(day4);
		
		

	}

}
