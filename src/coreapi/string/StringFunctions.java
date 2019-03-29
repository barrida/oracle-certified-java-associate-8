package coreapi.string;

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
	    System.out.println("2" + true); 
	    System.out.println(true + "3"); 
		  
		objectEquality();
		commonFunctions();
		  
		  boolean hasParams = (args == null ? false : true);

System.out.println(hasParams);
			 
	        if(hasParams){
	            System.out.println("has params");
	        }
	        
	        {
	            System.out.println("no params");
	        }
	}

	/**
	 * 
	 */
	private static void objectEquality() {
		StringFunctions s1 = new StringFunctions();
		StringFunctions s2 = new StringFunctions();
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); //false
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb1.equals(sb2)); //false
	}

	private static void commonFunctions() {
		// charAt(), indexOf(), length(), substring() are common functions for
		// String and StringBuilder

		// charAt
		String s = "Java8";

		// if (s instanceof String) {
		// System.out.println("instance of");
		// }

		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length() - 1));
		// s.charAt(s.length()); // java.lang.StringIndexOutOfBoundsException

		// indexOf
		System.out.println(s.indexOf("aa")); // -1
		System.out.println(s.indexOf("J")); // 0

		// substring(beginIndex,endIndex)
		for (int i = 0; i <= s.length(); i++) {
			System.out.println(s.substring(0, i));
		}

		System.out.println("begin end same: " + s.substring(2, 2));

		// substring(beginIndex)
		for (int i = 0; i <= s.length(); i++) {
			System.out.println(s.substring(i));
		}

		// replace
		s.replace('a', 'J');
		System.out.println(s);
		System.out.println(s.toString());

		int total = 0;
		StringBuilder letters = new StringBuilder("suleyman");
		total += letters.substring(4).length();
		//total += letters.substring(6, 5).length();
		// //java.lang.StringIndexOutOfBoundsException: String index out of
		// range:
		System.out.println(total);

		boolean a, b = true;
		if (a = b) {
			System.out.println(
					"If a and b are of type boolean, the expression (a = b) can be used as the condition expression of an if statement.");
		}

		// indexOf(int ch, int fromIndex)
		String sIndex = "MINIMUM";
		System.out.println(sIndex.indexOf('M', 3)); // 4
		System.out.println(sIndex.indexOf('m', 3)); // -1 index not found
		// indexOf(String str, int fromIndex)
		System.out.println(sIndex.indexOf("NIM", 0)); // 2

		// trim
		// Whitespace consists of spaces along with the \t (tab) and \n (
		// (newline) characters
		System.out.println("abc".trim()); // abc
		System.out.println("   Hello    World       ".trim()); // Hello    World // It leaves the spaces that are in the middle of the string
		System.out.println("   Hello    World       ".trim().length()); // a b c It leaves the spaces that are in the middle of the string
		System.out.println("   Hello    World       ".length()); // a b c It leaves the spaces that are in the middle of the string

		
	}

}
