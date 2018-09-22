package datetime;

import java.time.*;

/**
 * All the classes in the new Date Time API are immutable and good for
 * multithreaded environments. They are packaged under or sub packages of
 * java.time package.
 * 
 * @author suleyman.yildirim
 *
 */
public class DateAndTime {

	public static void main(String[] args) {
		dateTimeClasses();
		periodClass();
		formattingDates();
	}

	/**
	 * Formatting Dates and Times You are only responsible for SHORT and
	 * MEDIUM predifined formats for the exam
	 */
	private static void formattingDates() {
		
	}

	/**
	 * Period class
	 */
	private static void periodClass() {
		System.out.println("----------------------------");
		Period annually = Period.ofYears(1); // every 1 year
		Period quarterly = Period.ofMonths(3); // every 3 months
		Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
		Period everyOtherDay = Period.ofDays(2); // every 2 days
		Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

		// Only LocalDateTime and LocalDate are allowed to add period
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println("Time before period: " + dateTime);
		Period period = Period.ofMonths(1);
		System.out.println("Add period of 1 month: " + date.plus(period)); // 2015-02-20
		System.out.println("DateTime after period: " + dateTime.plus(period)); // 2015-02-20T06:15
		
		//LocalTime is not allowed to add period.
		System.out.println("Time after period: " + time.plus(period)); // throws UnsupportedTemporalTypeException
	}

	/**
	 * LocalDate, LocalTime, and LocalDateTime classes
	 */
	private static void dateTimeClasses() {
		LocalDate date1 = LocalDate.of(2018, Month.SEPTEMBER, 22);
		System.out.println("LocalDate: " + date1);
		LocalTime time1 = LocalTime.of(6, 15, 20, 200);
		System.out.println("LocalTime" + time1);
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		System.out.println("LocalDateTime: " + dateTime1);
	}

}
