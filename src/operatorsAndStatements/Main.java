package operatorsAndStatements;

public class Main {

	public static void main(String args[]) {

		// UNREACHABLE CODE
		int hourOfDay = 20;
		if (hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else if (hourOfDay < 11) {
			System.out.println("Good Morning"); // UNREACHABLE CODE
		} else {
			System.out.println("Good Evening");
		}

		/**
		 * Data types supported by switch statements include the following:
		 * 
		 * int and Integer
		 * 
		 * byte and Byte
		 * 
		 * short and Short
		 * 
		 * char and Character
		 * 
		 * String
		 * 
		 * enum values
		 * 
		 * Note: boolean and long are not permitted on switch statement
		 */

		/**
		 * Valid switch CASE statement values:
		 * 
		 * literal
		 * 
		 * enum constant
		 * 
		 * final constant
		 * 
		 */

		long key = 1L; // boolean and long are not permitted on switch statement

		// switch (key) {
		// case 1l:
		//
		// break;
		//
		// default:
		// break;
		// }

		/**
		 * The exam creators are fond of switch examples that are missing break
		 * statements! When evaluating switch statements on the exam, always
		 * consider that multiple branches may be visited in a single execution.
		 * 
		 */

		int dayOfWeek = 5;
		switch (dayOfWeek) {
		case 0:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Weekday");
		case 6:
			System.out.println("Saturday");
			break;
		}

	}

}
