package basics;

public class Operator {

	public static void main(String[] args) throws Exception {
		int i = 1, j = 10;
		do {
			System.out.println("i=" + i + " j=" + j);
			if (i++ > --j) {

				continue;
			}
			// System.out.println("i=" + i + " j=" + j);
		} while (i < 5);

		/***
		 * 
		 * 
		 * A narrowing primitive conversion may be used if all of the following
		 * conditions are satisfied:
		 * 
		 * 1. The expression is a compile time constant expression of type byte,
		 * char, short, or int. 
		 * 
		 * 2. The type of the variable is byte, short, or char. 
		 * 
		 * 3. The value of the expression (which is known at compile time,
		 * because it is a constant expression) is representable in the type of
		 * the variable.
		 * 
		 * Note that implict narrowing conversion (i.e. conversion without an
		 * explicit cast) does not apply to float, long, or double. For example,
		 * char ch = 30L; will fail to compile although 30 is small enough to
		 * fit into a char.
		 */
		char c;
		int s;
		c = 'a';// 1
		s = c; // 2
		System.out.println(c);
		System.out.println(s);
		s++; // 3
		System.out.println(s);
		c = (char) s; // 4

		int a = 2;
		byte b;
		
		final char ch = 'a';
		char asd = ch + 1;
		System.out.println("asd: " + asd);
		
		c = (char) a;
		b = (byte) a;
		System.out.println(c);
		c++; // 5
		System.out.println(c);
	}
}
