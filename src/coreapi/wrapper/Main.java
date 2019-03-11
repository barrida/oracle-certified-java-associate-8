package coreapi.wrapper;

import com.sun.org.apache.regexp.internal.CharacterArrayCharacterIterator;

public class Main {

	public static void main(String[] args) {

		/**
		 * Autoboxing:  int to Integer
		 * 
		 * Unboxing: Integer to int
		 * 
		 */
		
		
		// Wrapper Classes
		int a = 5, b = 3, k = 0;
		int m = 0;
		k = new Integer(a) + new Integer(b); // unboxing
		System.out.println(k);

		k = new Integer(a) + b; // unboxing
		System.out.println(k);

		k = b + new Integer(a); // unboxing
		System.out.println(k);

		m = new Integer(a) + new Integer(b); //
		System.out.println(m);

		// == vs equals()
		Integer i1 = 1;
		Integer i2 = new Integer(1);
		int i3 = 1;
		Byte b1 = 1;
		Long g1 = 1L;

		System.out.println("i1 == i2 ? " + (i1 == i2));
		System.out.println("i1 == i3 ? " + (i1 == i3)); //
		// System.out.println(i1==b1); // will not compile
		System.out.println("i1.equals(i2): " + i1.equals(i2));
		System.out.println("i1.equals(i3): " + i1.equals(i3));
		System.out.println("i1.equals(g1): " + i1.equals(g1));
		System.out.println("i1.equals(b1) " + i1.equals(b1));
		System.out.println("i1.equals(b1.intValue()): " + i1.equals(b1.intValue()));

		String s = null;
		Boolean.parseBoolean(s);
		Boolean.valueOf(false);
		Boolean asd = Boolean.valueOf("123");

		System.out.println(Character.valueOf('x'));

		// NumberFormatException
		// int bad1 = Integer.parseInt("a"); // throws NumberFormatException
		// Integer bad2 = Integer.valueOf("123.45"); // throws
		// // NumberFormatException

		/**
		 * Overflow explanation:
		 * 
		 * If an integer addition overflows, then the result is the low-order
		 * bits of the mathematical sum as represented in some sufficiently
		 * large two's-complement format. 
		 * 
		 * If overflow occurs, then the sign of
		 * the result is not the same as the sign of the mathematical sum of the
		 * two operand values.
		 * 
		 * 
		 */
		int aa = Integer.MIN_VALUE;
		int bb = -aa;
		System.out.println(aa + "   " + bb);//
		System.out.println(Integer.MAX_VALUE + 1);
	}
}
