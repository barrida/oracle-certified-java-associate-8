package methods;

import com.sun.org.apache.regexp.internal.CharacterArrayCharacterIterator;

public class ParamTest {
	public static void printSum(int a, int b) {
		System.out.println("In int " + (a + b));
	}

	public static void printSum(Integer a, Integer b) {
		System.out.println("In Integer " + (a + b));
	}

	public static void printSum(Double a, Double b) {
		System.out.println("In Double " + (a + b));
	}

	public static void printSum(double a, double b) {
		System.out.println("In double primitive " + (a + b));
	}

	public static void main(String[] args) {
		printSum(1, 2);
		printSum(1.0, 2.0);
		printSum(1.0f, 2.0f);
		printSum(32760, 32760);

		double x = Double.MAX_VALUE;
		System.out.println("Double.max_value:	" + x);
		float y = (float) x;
		System.out.println(y);
		System.out.println("Float.MAX_VALUE:	" + Float.MAX_VALUE);

		System.out.println("asdas" + (x == y));
		System.out.println("Byte.: " + Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
		System.out.println("Short.MAX_VALUE: " + Short.MAX_VALUE + " " + Short.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
		System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE + " " + Long.MIN_VALUE);
		System.out.println("Float.MAX_VALUE: " + Float.MAX_VALUE + " " + Float.MIN_VALUE);
		//System.out.println(Character.MAX_VALUE);

	
	}
}