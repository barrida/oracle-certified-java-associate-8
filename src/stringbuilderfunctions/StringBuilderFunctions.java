package stringbuilderfunctions;

public class StringBuilderFunctions {

	/**
	 * 
	 * append() insert() delete() deleteCharAt() reverse() toString()
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		functions();
	}

	private static void functions() {
		StringBuilder stringBuilder = new StringBuilder("qweasdzxc");
		
		// Rule 1: substring() does not change the value of a StringBuilder
		stringBuilder.substring(0, 3);
		System.out.println(stringBuilder); // it is not qwe! Be careful :) 

		// Compile error
		// StringBuilder b = "string pool";
		
		// Rule 2: append() insert() delete() deleteCharAt() reverse()  and insert() do change the value of a StringBuilder
		//appends adds the string representation of the parameter passed
		stringBuilder.append("string").append(5).append(false).append(3.4).append(2L);
		
		//insert
		System.out.println(stringBuilder.insert(2, "HHH"));
		
		//delete
		System.out.println(stringBuilder.delete(0, 1));
		
		//deleteCharAt
		System.out.println(stringBuilder.deleteCharAt(0));
		
		//reverse
		System.out.println(stringBuilder.reverse());
		
		

	}
}
