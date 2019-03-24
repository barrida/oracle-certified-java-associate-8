package datetime;

import java.time.*;
import java.time.format.*;
import java.time.temporal.TemporalAccessor;

/**
 * All the classes in the new Date Time API are immutable
 * 
 * Good for multithreaded environments.
 * 
 * Under or sub packages of java.time package.
 * 
 * You cannot chain methods when creating a Period. Only the last method is used
 * because the Period.ofXXX methods are static methods
 * 
 * Period wrong = Period.ofYears(1).ofWeeks(1); // every week
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
		exceptions();
	}

	/**
	 * LocalDate, LocalTime, and LocalDateTime classes
	 */
	private static void dateTimeClasses() {
		System.out.println("-------------------------------\nLocalDate, LocalTime, and LocalDateTime classes");
		

		LocalDate date1 = LocalDate.of(2018, Month.SEPTEMBER, 22);
		
		date1.plusDays(2);
		
		System.out.println("LocalDate: " + date1);
		LocalTime time1 = LocalTime.of(6, 15, 20, 200);
		System.out.println("LocalTime:  " + time1);
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		System.out.println("LocalDateTime: " + dateTime1);
	}

	/**
	 * Patterns for Formatting and Parsing
	 * 
	 * MMMM M represents the month. The more Ms you have, the more verbose the
	 * Java output.For example, M outputs 1, MM outputs 01, MMM outputs Jan, and
	 * MMMM outputs January.
	 * 
	 * dd d represents the date in the month. As with month, the more ds you
	 * have, the more verbose the Java output. dd means to include the leading
	 * zero for a single-digit month.
	 * 
	 * , Use , if you want to output a comma (this also appears after the year).
	 * 
	 * yyyy y represents the year. yy outputs a two-digit year and yyyy outputs
	 * a four-digit year.
	 * 
	 * hh h represents the hour. Use hh to include the leading zero if you’re
	 * outputting a single digit hour.
	 * 
	 * DateTimeFormatter.ofPattern("d MMMM yyyy")
	 * 
	 */
	private static void patternsForFormatting() {
		System.out.println("-------------------------------\nPatterns for Formatting and Parsing");
		
		
		FormatStyle dateStyle = FormatStyle.SHORT;
		System.out.println("format: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(LocalDate.now()));
		System.out.println("format: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(LocalDate.now()));
		
		System.out.println("dd M YY: " + DateTimeFormatter.ofPattern("dd M YY").format(LocalDate.of(2019, Month.JANUARY, 9)));
		System.out.println("dd MM YY: " + DateTimeFormatter.ofPattern("dd MM YY").format(LocalDate.of(2019, Month.DECEMBER, 9)));
		System.out.println("dd MMM YY: " + DateTimeFormatter.ofPattern("dd MMM YY").format(LocalDate.of(2019, Month.DECEMBER, 9)));
		System.out.println("MMM dd YY: " + DateTimeFormatter.ofPattern("MMM dd YY").format(LocalDate.of(2019, Month.DECEMBER, 9)));
		System.out.println("dd MMMM YY: " + DateTimeFormatter.ofPattern("dd MMMM YYYY").format(LocalDate.of(2019, Month.DECEMBER, 9)));

		//System.out.println("hh:mm" + DateTimeFormatter.ofPattern("hh:mm").format(LocalDate.now())); // UnsupportedTemporalTypeException
		System.out.println("hh:mm" + DateTimeFormatter.ofPattern("hh:mm").format(LocalDateTime.now())); //ok
		System.out.println("hh:mm" + DateTimeFormatter.ofPattern("hh:mm").format(LocalTime.now())); //ok
		
		System.out.println("DateTimeFormatter.ISO_LOCAL_DATE: " + LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
		//System.out.println("DateTimeFormatter.ISO_LOCAL_DATE: " + LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));//UnsupportedTemporalTypeException
		//System.out.println("DateTimeFormatter.ISO_LOCAL_TIME: " + LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_TIME));//UnsupportedTemporalTypeException
		System.out.println("DateTimeFormatter.ISO_LOCAL_DATE_TIME: " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		System.out.println("DateTimeFormatter.ISO_LOCAL_TIME: " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println("DateTimeFormatter.ISO_LOCAL_DATE_TIME: " + LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));

		FormatStyle dateTimeStyle  = FormatStyle.MEDIUM;
		DateTimeFormatter.ofLocalizedDateTime(dateTimeStyle);
		FormatStyle timeStyle = FormatStyle.MEDIUM;
		DateTimeFormatter.ofLocalizedTime(timeStyle);
		
		// Create date objects
		LocalDateTime dateTime = LocalDateTime.now();
		LocalTime time = LocalTime.now();

		// The format() method is declared on both the formatter objects and the
		// date/time objects
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
		System.out.println("Formats this date-time using the specified formatter: " + dateTime.format(dateTimeFormatter));
		System.out.println("Formats a date-time object using this formatter: " + dateTimeFormatter.format(dateTime));

		// ISO is a standard for dates
		System.out.println("Formats a date-time using DateTimeFormatter.ISO_LOCAL_DATE: "
				+ dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println("Formats a time using DateTimeFormatter.ISO_LOCAL_TIME: "
				+ time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println("Formats a date-time using DateTimeFormatter.ISO_LOCAL_DATE_TIME: "
				+ dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		// We can only use this formatter with objects containing times
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println("Format time hh:mm: " + dateTime.format(timeFormatter));
		timeFormatter.format(dateTime);
		// timeFormatter.format(date); // throw an exception Unsupported field:
		// ClockHourOfAmPm
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

	/**
	 * Formatting Dates and Times
	 * 
	 * You are only responsible for SHORT and MEDIUM predifined formats for the
	 * exam
	 * 
	 * DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.___);
	 * DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.___);
	 * DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.___);
	 * 
	 * 
	 * DateTimeFormatter f = DateTimeFormatter. _____ (FormatStyle.SHORT);
	 * DateTimeFormatter f = DateTimeFormatter. _____ (FormatStyle.MEDIUM);
	 */
	private static void formattingDates() {
		System.out.println("-------------------------------\nFormatting Dates and Times");

		// DateTimeFormatter constructors
		DateTimeFormatter ofLocalizedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter ofLocalizedTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		DateTimeFormatter ofLocalizedDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

		// Using formatting
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);

		DateTimeFormatter ofLocalizedDate2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(ofLocalizedDate2.format(dateTime)); // day/month/year
		System.out.println(ofLocalizedDate2.format(date)); // day/month/year

		String medium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
				.format(LocalDate.of(2019, Month.APRIL, 12));
		System.out.println("FormatStyle.MEDIUM: " + medium);

		String shortVersion = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
				.format(LocalDate.of(2019, Month.APRIL, 12));
		System.out.println("FormatStyle.SHORT: " + shortVersion);
		// System.out.println(ofLocalizedDate2.format(time)); //
		// UnsupportedTemporalTypeException. Time cannot be formatted as a date
		LocalTime time2 = LocalTime.of(11, 12, 34);
		
		System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(LocalTime.now())); //ok
		System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(LocalDateTime.now()));//ok
		//DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(LocalDate.now()); // UnsupportedTemporalTypeException Unsupported field: HourOfDay
		//DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(time2);//UnsupportedTemporalTypeException 
		
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
		System.out.println("Add period of 1 month: " + date.plus(period)); // 2015-02-20
		System.out.println("DateTime after period: " + dateTime.plus(period)); // 2015-02-20T06:15
		System.out.println("Minus period of 1 month: " + date.minus(period));

		// You cannot chain methods when creating a Period. Only the last method
		// is used because the Period.ofXXX methods are static methods
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.ofDays(1).ofYears(2);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println("You cannot chain methods when creating a Period: " + f.format(d));

		// LocalTime is not allowed to add period.
		// System.out.println("Time after period: " + time.plus(period)); //
		// throws
		// UnsupportedTemporalTypeException
	}

	/**
	 * Examples for
	 * 
	 * java.time.format.DateTimeParseException
	 * 
	 * java.time.DateTimeException
	 */
	private static void exceptions() {

		// This will throw a  java.time.format.DateTimeParseException
		// if the input string lacks the time component i.e.T17:13:50
		LocalDateTime d3 = LocalDateTime.parse("2015-01-02T17:13");

		// This will throw a  java.time.format.DateTimeParseException
		// if the input string contains the time component

		LocalDate d4 = LocalDate.parse("2015-01-02");

		// This will throw a  java.time.format.DateTimeParseException
		// if the input string contains the Date component
	    LocalTime d5 =LocalTime.parse("02:13:59.983435345");

		//LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException
	}

}
