package coreapi.wrapper;

import com.sun.org.apache.regexp.internal.CharacterArrayCharacterIterator;

public class Main {

	public static void main(String[] args) {
		// Wrapper Classes
		int a = 5, b = 3, k = 0;
		int m = 0;
		k = new Integer(a) + new Integer(b); //
		System.out.println(k);

		k = new Integer(a) + b;
		System.out.println(k);

		k = b + new Integer(a);
		System.out.println(k);

		m = new Integer(a) + new Integer(b); //
		System.out.println(m);

		// == vs equals()
		Integer i1 = 1;
		Integer i2 = new Integer(1);
		int i3 = 1;
		Byte b1 = 1;
		Long g1 = 1L;

		System.out.println(i1 == i2);
		System.out.println(i1 == i3);
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
		int bad1 = Integer.parseInt("a"); // throws NumberFormatException
		Integer bad2 = Integer.valueOf("123.45"); // throws
													// NumberFormatException
		
	}
}
