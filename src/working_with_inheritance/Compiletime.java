package working_with_inheritance;

/***
 * Which variable (or static method) will be used depends on the class that the
 * variable is declared of.
 * 
 * Which instance method will be used depends on the actual class of the object
 * that is referenced by the variable.
 * 
 * @author suleyman.yildirim
 *
 */

/// Runtime Polymorphism example.
class Base {

	public int a = 5;

	public String getValue() {
		return "Base";
	}

	public void setNumber(int a) {
		System.out.println("Base class set number: " + a);
	}

}

class Base2 extends Base {

	public int a = 7;

	public String getValue() { // method should be identical to base class
		return "Base2";
	}

	public void setNumber(double a) { // this is not overriding so
		System.out.println("Child class set number: " + a);
	}
}

public class Compiletime {
	public static void main(String[] args) {
		Base b = new Base2();
		System.out.println(b.getValue()); // Which instance method will be used
											// depends on the actual class of
											// the object that is referenced by
											// the variable. At run time b
											// points to an object of class Base
		System.out.println(b.a); // Which variable (or static method) will be
									// used depends on the class that the
									// variable is declared of. .

		b.setNumber((int) 12.0); // this is not overriding so it calls the
									// function in super class

	}
}
