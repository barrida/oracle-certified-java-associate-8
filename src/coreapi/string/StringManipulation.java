package coreapi.string;

public class StringManipulation {

	public static void main(String[] args) {
		immutability();
		equality();
	}

	private static void equality() {
		
		String s1 = "Java"; // Use string pool	
		String s2 = new String("Java"); // don't use string pool and create object
		if (s1 == s2) {
			System.out.println("Object references are equal");
			
		}
		
		if (s1.equals(s2)) {
			System.out.println("Contents of the objects are equal");
		}

	}

	/**
	 * 
	 */
	private static void immutability() {
		// String is immutable so an object cannot be modified or garbage collected
		String s = "Java";
		s.concat("8");
		System.out.println("String is immutable so an object cannot be modified or garbage collected"
				+ ": "+s);
		
		// StringBuilder can be mutated with methods like append()
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Java");
		System.out.println("StringBuilder can be mutated with methods like append(): "+stringBuilder);
	}

}
