package accessModifier;

class Data {

	int intVal = 0;
	String strVal = "default";

	public Data(int k) {
		this.intVal = k;
	}

}

public class AccessModifier {
	int a;

	public void AccessModifier(int a) {
		a = a;
	}

	int x = 5;

	int getX() {
		return x;
	}

	public void looper() {
		
		
		int x = 0;
		while ((x = getX()) != 0) {
			for (int m = 10; m >= 0; m--) {
				x = m;
			}
		}

	}

	public static void main(String[] args) throws Exception {

		// The default accessibility is more restrictive than protected, but
		// less restrictive than private.

		// default members are only accessible within the class itself and from
		// other classes in the same package.

		// protected members are accessible from subclasses in any other
		// package as well.

		// private members are only accessible within the
		// class itself.

		// public > protected > package (or default) > private
		/**
		 * 
		 * 
		 * boolean true or false true
		 * 
		 * byte 8-bit integral value 123
		 * 
		 * short 16-bit integral value 123
		 * 
		 * int 32-bit integral value 123
		 * 
		 * long 64-bit integral value 123
		 * 
		 * float 32-bit floating-point value 123.45f
		 * 
		 * double 64-bit floating-point value 123.456
		 * 
		 * char 16-bit Unicode value 'a'
		 */
		int index = 1;
		String[] strArr = new String[5];
		String myStr = strArr[index];
		System.out.println(myStr);

		float f = -123;

		boolean asd = Boolean.parseBoolean("TrUe");
		System.out.println(new Boolean("true") == Boolean.TRUE);

		int i = 0;
		for (; true; i++)
			if (i > 5)
				break;

		for (int y = 0; y < 3; y++) {
			System.out.print(args[y] + " ");
		}
		Data d1 = new Data(10);
		d1.strVal = "D1";
		Data d2 = d1;
		d2.intVal = 20;
		System.out.println("d2 val = " + d2.strVal);
		
		

	}

}
