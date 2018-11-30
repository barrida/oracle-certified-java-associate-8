package datetime;

import java.time.*;
import java.time.format.*;

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
		patternsForFormatting();
		parsingDatesAndTimes();
	}

	/**
	 * Formatting Dates and Times
	 * 
	 * You are only responsible for SHORT and MEDIUM predifined formats for the
	 * exam
	 * 
	 * DateTimeFormatter f = DateTimeFormatter. _____ (FormatStyle.SHORT);
	 * DateTimeFormatter f = DateTimeFormatter. _____ (FormatStyle.MEDIUM);
	 */
	private static void formattingDates() {
		System.out.println("-------------------------------\n Formatting Dates and Times");
		// DateTimeFormatter constructors
		DateTimeFormatter ofLocalizedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter ofLocalizedTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		DateTimeFormatter ofLocalizedDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

		// Using formatting
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);

		DateTimeFormatter ofLocalizedDate2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(ofLocalizedDate2.format(dateTime)); // 1/20/20
		System.out.println(ofLocalizedDate2.format(date)); // 1/20/20
		// System.out.println(ofLocalizedDate2.format(time)); //
		// UnsupportedTemporalTypeException. Time cannot be formatted as a date
	}

	/**
	 * Period class
	 */
	private static void periodClass() {
		System.out.println("-------------------------------\nPeriod class");

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
		System.out.println("asdada" + date);
		System.out.println("Add period of 1 month: " + date.plus(period)); // 2015-02-20
		System.out.println("DateTime after period: " + dateTime.plus(period)); // 2015-02-20T06:15

		// LocalTime is not allowed to add period.
		// System.out.println("Time after period: " + time.plus(period)); //
		// throws
		// UnsupportedTemporalTypeException
	}

	/**
	 * LocalDate, LocalTime, and LocalDateTime classes
	 */
	private static void dateTimeClasses() {
		System.out.println("-------------------------------\nLocalDate, LocalTime, and LocalDateTime classes");

		LocalDate date1 = LocalDate.of(2018, Month.SEPTEMBER, 22);
		System.out.println("LocalDate: " + date1);
		LocalTime time1 = LocalTime.of(6, 15, 20, 200);
		System.out.println("LocalTime" + time1);
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		System.out.println("LocalDateTime: " + dateTime1);
	}

	/**
	 * Patterns for Formatting and Parsing
	 */
	private static void patternsForFormatting() {
		System.out.println("-------------------------------\nPatterns for Formatting and Parsing");
		
		//Create date objects
		LocalDateTime dateTime = LocalDateTime.now();
		LocalTime time = LocalTime.now();
		LocalDate date = LocalDate.now();
		
		//The format() method is declared on both the formatter objects and the date/time objects
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d MMMMM yyyy");
		System.out.println("Formats this date-time using the specified formatter: " + dateTime.format(dateTimeFormatter));
		System.out.println("Formats a date-time object using this formatter: " + dateTimeFormatter.format(dateTime));
		
		//ISO is a standard for dates
		System.out.println("Formats a date-time using DateTimeFormatter.ISO_LOCAL_DATE: " + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println("Formats a time using DateTimeFormatter.ISO_LOCAL_TIME: " + time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println("Formats a date-time using DateTimeFormatter.ISO_LOCAL_DATE_TIME: " + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		// We can only use this formatter with objects containing times
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm"); 
		System.out.println("Format time hh:mm: " + dateTime.format(timeFormatter));
		timeFormatter.format(dateTime);
		//timeFormatter.format(date); // throw an exception Unsupported field: ClockHourOfAmPm
		timeFormatter.format(time); // ok
	}
	
	/**
	 * Parsing Dates and Times
	 */
	private static void parsingDatesAndTimes() {
		System.out.println("-------------------------------\nParsing Dates and Times");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("01 02 2015", f);
		LocalTime time = LocalTime.parse("11:22");
		System.out.println(date); // 2015-01-02
		System.out.println(time); // 11:22
	}


}
