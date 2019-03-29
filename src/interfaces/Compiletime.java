package interfaces;

/**
 * 
 * Which variable (or static method) will be used depends on the class that the
 * variable is declared of.
 * 
 * Which instance method will be used depends on the actual class of the object
 * that is referenced by the variable
 * 
 * Overriding Return Type --> Rule 1: In case of overriding, the return type of
 * the overriding method must match exactly to the return type of the overridden
 * method if the return type is a primitive.
 * 
 * Overriding Return Type --> Rule 2: (In case of objects, the return type of
 * the overriding method may be a subclass of the return type of the overridden
 * method.)
 * 
 * 
 * Default interface rules
 * 
 * 1. must have method body 2. must only be declared in interface 3. access
 * modifier must be public
 * 
 * @author suleyman.yildirim
 *
 */

interface IWorkout {

	public default boolean isFinished() { // compile error
		return true;
	}
}

interface DefaultClass extends IWorkout {

	public default boolean isFinished() { // can redefine
		return false;
	}
}

/***
 * 
 * 
 * @author suleyman.yildirim
 *
 */
class MyBaseReturnClass {

}

class MyChildReturnClass extends MyBaseReturnClass {

}

class A {

	public int foo() {
		return 1;
	}

	public Object getMyObject() {
		Object o = new Object();
		System.out.println("class A: " + o);
		return o;
	}

	public Integer getInteger() {
		return Integer.valueOf(1);
	}

	MyBaseReturnClass getMyClass() {
		return new MyBaseReturnClass();
	}

}

class B extends A {
	// Rule 1 --> compile error
	// public short foo() {
	// return 1;
	// }

	// Rule 2 --> compile error: return type should be subclass of Integer
	// public int getInteger() {
	// return Integer.valueOf(1).intValue();
	// }

	// Rule 2 --> compiles
	public Integer getMyObject() {
		Integer i = new Integer(1);
		Integer.valueOf(1);
		Integer.valueOf("1");
		System.out.println("class B: " + i);
		return i;
	}

	// Rule 2 --> compiles
	MyChildReturnClass getMyClass() {
		return new MyChildReturnClass();
	}

}

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

	public void aMethod() {
		System.out.println("aMethod");
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

		Base2 b2 = (Base2) b;
		b2.aMethod();

		// overriding return type calls
		A a = new B();
		a.getMyObject();
		a.getMyClass();
	}
}
