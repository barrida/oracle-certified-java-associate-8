package stringfunctions;

/**
 * 
 * Be able to determine the output of code using String. Know the rules for
 * concatenating Strings and how to use common String methods. Know that Strings
 * are immutable. Pay special attention to the fact that indexes are zero based
 * and that substring() gets the string up until right before the index of the
 * second parameter.
 * 
 * @author suleyman.yildirim
 *
 */
public class StringFunctions {

	public static void main(String[] args) {
		commonFunctions();
	}

	private static void commonFunctions() {
		// charAt(), indexOf(), length(), substring() are common functions for String and StringBuilder

		//charAt
		String s = "Java8";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length() - 1));
		// s.charAt(s.length()); // java.lang.StringIndexOutOfBoundsException

		
		//indexOf
		System.out.println(s.indexOf("aa")); // -1
		System.out.println(s.indexOf("J")); // -1
		
		//substring(beginIndex,endIndex)
		for (int i = 0; i <= s.length(); i++) {
			System.out.println(s.substring(0, i));
		}
		
		//substring(beginIndex)
		for (int i = 0; i <= s.length(); i++) {
			System.out.println(s.substring(i));
		}
		
		System.out.println(s.toString());

	}

}
