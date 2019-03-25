package coreapi.string;

import java.util.Arrays;
import java.util.List;

public class StringBuilderFunctions {

	/**
	 * 
	 * append() insert() delete() deleteCharAt() reverse() toString()
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new StringBuilderFunctions();
		functions();
	}

	private static void functions() {
		StringBuilder stringBuilder = new StringBuilder("qweasdzxc");

		System.out.println("Initial value: " + stringBuilder);
		/**
		 * Rule 1: substring() does not change the value of a StringBuilder
		 */
		String sub = stringBuilder.substring(0, 3);
		System.out.println(sub);
		System.out.println("substring() does not change the value of a StringBuilder: " + stringBuilder);

		/**
		 * Rule 2: append() insert() delete() deleteCharAt() reverse() and
		 * insert() do change the value of a StringBuilder appends adds the
		 * string representation of the parameter passed
		 */
		
		
		stringBuilder.append("string").append(5).append(false).append(3.4).append(2L);

		// insert
		System.out.println(stringBuilder.insert(2, "HHH"));

		// delete
		System.out.println("delete: "+stringBuilder.delete(0, 1));

		// deleteCharAt
		System.out.println(stringBuilder.deleteCharAt(0));

		// reverse
		System.out.println(stringBuilder.reverse());

		// replace
		StringBuilder stringBuilder2 = new StringBuilder("12345");
		System.out.println("replace: " + stringBuilder2.replace(3, 4, "REPLACE"));
		System.out.println(stringBuilder2.append(true));

		
		// Compile error: Type mismatch: cannot convert from String to
		// StringBuilder
		// StringBuilder b = "string pool";

	}

}
